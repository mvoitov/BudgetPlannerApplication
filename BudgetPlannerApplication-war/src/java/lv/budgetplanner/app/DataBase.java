/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.budgetplanner.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Maxim
 */
public class DataBase {

    public static boolean selectUsernameFromDbUserTable(String username) {
        String usernameFromDb = "";
        boolean bool = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
            Statement st = (Statement) con.createStatement();
            String selectTableSQL = "SELECT * FROM `user`";
            ResultSet rs = st.executeQuery(selectTableSQL);
            while (rs.next()) {
                usernameFromDb = rs.getString("Username");
                if (username.equals(usernameFromDb)) {
                    bool = true;
                }
            }
        } catch (Exception e) {
        }
        return bool;
    }

    public static boolean selectPasswordFromDbUserTable(String password) {
        String passwordFromDb = "";
        boolean bool = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
            Statement st = (Statement) con.createStatement();
            String selectTableSQL = "SELECT * FROM `user`";
            ResultSet rs = st.executeQuery(selectTableSQL);
            while (rs.next()) {
                passwordFromDb = rs.getString("Password");
                if (password.equals(passwordFromDb)) {
                    bool = true;
                }
            }
        } catch (Exception e) {
        }
        return bool;
    }

    public static void insertRecordIntoDbUserTable(String usernameValue, String passwordValue) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
            Statement st = (Statement) con.createStatement();
            String insertTableSQL = "INSERT INTO test.`user` (`Username`, `Password`) VALUES ('" + usernameValue + "', '" + passwordValue + "');";
            st.executeUpdate(insertTableSQL);
            st.close();
        } catch (Exception e) {
        }
    }

    public static boolean usernameIsNotAlreadyTaken(String usernameValue) {
        String usernameFromDb = "";
        boolean bool = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
            Statement st = (Statement) con.createStatement();
            String selectTableSQL = "SELECT * FROM `user`";
            ResultSet rs = st.executeQuery(selectTableSQL);
            while (rs.next()) {
                usernameFromDb = rs.getString("Username");
                if (usernameValue.equals(usernameFromDb)) {
                    bool = false;
                }
            }
        } catch (Exception e) {
        }
        return bool;
    }
}
