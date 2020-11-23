package co.g2academy.jdbc;

import co.g2academy.jdbc.dao.PersonDaoJdbc;
import co.g2academy.jdbc.entity.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.UUID;

public class PersonDaoJdbcExample {

    public static void main(String[] args) {
        try {
            //1. load MySql JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. Create Database connection
            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/javabootcamp",
                            "root", "Mysqlpwd123");
            // how to use DAO
            PersonDaoJdbc personDao = new PersonDaoJdbc();
            personDao.setConnection(connection);
            //insert person data
            Person p = new Person();
            p.setName("very-" + UUID.randomUUID());
            p.setPassword("mypassword");
            personDao.save(p);
            //get by id
            Person personId1 = personDao.getById(1);
            printPerson(personId1);
            // update person with id 1
            personId1.setName("updated name here");
            personId1.setPassword("updated password");
            personDao.save(personId1);
            //get All
            List<Person> persons = personDao.getAll();
            for (Person person : persons) {
                printPerson(person);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void printPerson(Person person) {
        System.out.println("id: " + person.getId() + ", name: "
            + person.getName() + ", password: " + person.getPassword());
    }
}
