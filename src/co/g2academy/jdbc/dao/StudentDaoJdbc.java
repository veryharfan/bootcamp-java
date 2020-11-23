package co.g2academy.jdbc.dao;

import co.g2academy.jdbc.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoJdbc {

    private Connection connection;
    private PreparedStatement insertStatement;
    private PreparedStatement updateStatement;
    private PreparedStatement deleteStatement;
    private PreparedStatement getByIdStatement;
    private PreparedStatement getAllStatement;

    private final String insertQuery = "insert into student(name, age, phone_no) values (?, ?, ?)";
    private final String updateQuery = "update student set  name = ?, age = ?, phone_no = ? where id = ?";
    private final String deleteQuery = "delete from student where id = ?";
    private final String getByIdQuery = "select * from student where id = ?";
    private final String getAllQuery = "select * from student";

    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        insertStatement = this.connection.prepareStatement(insertQuery,
                Statement.RETURN_GENERATED_KEYS);
        updateStatement = this.connection.prepareStatement(updateQuery);
        deleteStatement = this.connection.prepareStatement(deleteQuery);
        getByIdStatement = this.connection.prepareStatement(getByIdQuery);
        getAllStatement = this.connection.prepareStatement(getAllQuery);
    }

    public Student save(Student student) throws SQLException {
        if (student.getId() == null) {
            insertStatement.setString(1, student.getName());
            insertStatement.setInt(2, student.getAge());
            insertStatement.setString(3, student.getPhone_no());
            int id = insertStatement.executeUpdate();
            student.setId(id);
        } else {
            updateStatement.setString(1, student.getName());
            updateStatement.setInt(2, student.getAge());
            updateStatement.setString(3, student.getPhone_no());
            updateStatement.setInt(4, student.getId());
            updateStatement.executeUpdate();
        }
        return student;
    }

    public Student delete(Student s) throws SQLException{
        deleteStatement.setInt(1, s.getId());
        deleteStatement.executeUpdate();
        return s;
    }

    public Student getById(Integer id) throws SQLException {
        getByIdStatement.setInt(1, id);
        ResultSet rs = getByIdStatement.executeQuery();
        // proses mapping dari relational ke object
        if (rs.next()) {
            return getStudentFromResultSet(rs);
        }
        return null;
    }

    public List<Student> getAll() throws SQLException {
        List<Student> students = new ArrayList<Student>();
        ResultSet rs = getAllStatement.executeQuery();
        while (rs.next()) {
            students.add(getStudentFromResultSet(rs));
        }
        return students;
    }

    private Student getStudentFromResultSet(ResultSet rs) throws SQLException{
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        student.setPhone_no(rs.getString("phone_no"));
        return student;
    }
}

