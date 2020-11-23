package co.g2academy.jdbc;

import java.sql.*;

public class MysqlConnectionExample {

    public static void main(String[] args) {
        try {
            //1, load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. Create database connection
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/javabootcamp",
                            "root", "Mysqlpwd123");
            //3. Create Statement
            Statement statement = connection.createStatement();
            //4. Execute query to get data from database
            ResultSet rs = statement.executeQuery("select * from student");
            //6. iterate through all rows in student table
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer age = rs.getInt("age");
                String phoneNumber = rs.getString("phone_no");
                System.out.println(id + " " + name + " " +
                        age + " " + phoneNumber);
            }
            //6. update data
            statement.executeUpdate(
                    "update student set age = 18, name='very harfan' where id=3");
            //7. delete data
            statement.executeUpdate(
                    "delete from student where id = 3");
            //8. insert data (row)
//            statement.executeUpdate(
//                    "insert into student values(4, 'vina', 17, '0811114')");
//            statement.executeUpdate(
//                    "insert into student values(6, 'hartono', 18, '0811115')");

            //===== prepared statement =====
            String insertQuery = "insert into student(id, name, age, phone_no) values(?, ?, ?, ?)";
            PreparedStatement psInsert = connection.prepareStatement(insertQuery);
            String updateQuery = "update student set name = ?, age = ?, phone_no = ? where id = ?";
            PreparedStatement psUpdate = connection.prepareStatement(updateQuery);
            //insert
//            psInsert.setInt(1, 7);
//            psInsert.setString(2, "Syifa");
//            psInsert.setInt(3, 17);
//            psInsert.setString(4, "081115");
//            psInsert.executeUpdate();
            //update
            psUpdate.setString(1, "Updated name");
            psUpdate.setInt(2, 17);
            psUpdate.setString(3, "011111");
            psUpdate.setInt(4, 1);
            psUpdate.executeUpdate();

            //=== batch execution and transaction
            connection.setAutoCommit(false);
            for (int i = 8; i < 100; i++ ) {
                //insert
                psInsert.setInt(1, i);
                psInsert.setString(2, "Student" + i);
                psInsert.setInt(3, 17);
                psInsert.setString(4, "08888111" + i);
                psInsert.addBatch();
            }
            psInsert.executeBatch();
            connection.commit();
            connection.setAutoCommit(true);

            // close all resource once it is being used
            //bad example, need to be in finally statement
            rs.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
