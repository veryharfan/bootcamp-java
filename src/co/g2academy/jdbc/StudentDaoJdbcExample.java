package co.g2academy.jdbc;

import co.g2academy.jdbc.dao.StudentDaoJdbc;
import co.g2academy.jdbc.entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.UUID;

public class StudentDaoJdbcExample {

    public static void main(String[] args) {
        try {
            //1. load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. Create database connection
            Connection connection =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/javabootcamp",
                            "root", "Mysqlpwd123");

            //howto use DAO
            StudentDaoJdbc studentDao = new StudentDaoJdbc();
            studentDao.setConnection(connection);
            //insert person data
            Student s = new Student();
            s.setName("very-" + UUID.randomUUID());
            s.setAge(17);
            s.setPhone_no("0876834");
            studentDao.save(s);
            //get by id
            Student studentId1 = studentDao.getById(56);
            printStudent(studentId1);
            //update student with id 1
            studentId1.setName("updated name here");
            studentId1.setAge(16);
            studentId1.setPhone_no("updated ph_no");
            studentDao.save(studentId1);
            //getAll
            List<Student> students = studentDao.getAll();
            for (Student student : students) {
                printStudent(student);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private static void printStudent(Student s){
        System.out.println("id: " + s.getId() + ", name: "
                + s.getName() + ", age: " + s.getAge() +
                ", phone_no: " + s.getPhone_no());
    }
}
