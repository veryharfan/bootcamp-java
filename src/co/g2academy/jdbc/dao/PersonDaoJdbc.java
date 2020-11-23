package co.g2academy.jdbc.dao;

import co.g2academy.jdbc.entity.Person;
import com.mysql.cj.result.SqlDateValueFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoJdbc {

    private Connection connection;
    private PreparedStatement insertStatement;
    private PreparedStatement updateStatement;
    private PreparedStatement deleteStatement;
    private PreparedStatement getByIdStatement;
    private PreparedStatement getAllStatement;

    private final String insertQuery = "insert into person(name, password) values (?, ?)";
    private final String updateQuery = "update person set name = ?, password = ? where id = ?";
    private final String deleteQuery = "delete from person where id = ?";
    private final String getByIdQuery = "select * from person where id = ?";
    private final  String getAllQuery = "select * from person";

    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        insertStatement = this.connection.prepareStatement(insertQuery,
                Statement.RETURN_GENERATED_KEYS);
        updateStatement = this.connection.prepareStatement(updateQuery);
        deleteStatement = this.connection.prepareStatement(deleteQuery);
        getByIdStatement = this.connection.prepareStatement(getByIdQuery);
        getAllStatement = this.connection.prepareStatement(getAllQuery);
    }

    public Person save(Person person) throws SQLException {
        if (person.getId() == null) {
            insertStatement.setString(1, person.getName());
            insertStatement.setString(2, person.getPassword());
            int id = insertStatement.executeUpdate();
            person.setId(id);
        } else {
            updateStatement.setString(1, person.getName());
            updateStatement.setString(2, person.getPassword());
            updateStatement.setInt(3, person.getId());
            updateStatement.executeUpdate();
        }
        return person;
    }

    public Person delete(Person p) throws SQLException {
        deleteStatement.setInt(1, p.getId());
        deleteStatement.executeUpdate();
        return p;
    }

    public Person getById(Integer id) throws SQLException {
        getByIdStatement.setInt(1, id);
        ResultSet rs = getByIdStatement.executeQuery();
        if (rs.next()) {
            return getPersonFromResultSet(rs);
        }
        return null;
    }

    public List<Person> getAll() throws SQLException {
        List<Person> persons = new ArrayList<Person>();
        ResultSet rs = getAllStatement.executeQuery();
        while (rs.next()) {
            persons.add(getPersonFromResultSet(rs));
        }
        return persons;
    }

    public Person getPersonFromResultSet(ResultSet rs) throws SQLException {
        Person person = new Person();
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setPassword(rs.getString("password"));
        return person;
    }
}
