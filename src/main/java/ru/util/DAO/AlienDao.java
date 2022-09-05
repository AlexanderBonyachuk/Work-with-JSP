package ru.util.DAO;

import java.sql.*;

import ru.util.model.Alien;

public class AlienDao {
    public Alien getAlien(int id) {
        Alien a = new Alien();

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/ksandr",
                    "postgres",
                    "1");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(
                    "SELECT * FROM alien WHERE id = " + id);
            if(rs.next()) {
                a.setId(rs.getInt("id"));
                a.setName(rs.getString("name"));
                a.setTech(rs.getString("tech"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
}
