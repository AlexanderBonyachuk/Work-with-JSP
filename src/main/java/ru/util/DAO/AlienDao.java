package ru.util.DAO;

import java.sql.*;

import ru.util.model.Alien;

public class AlienDao {
    public Alien getAlien(int aid) {
        Alien model = new Alien();

        System.out.println("We here");

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/ksandr",
                    "postgres",
                    "1");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(
                    "SELECT * FROM alien WHERE id = " + aid);
            if(rs.next()) {
                model.setAid(rs.getInt("aid"));
                model.setName(rs.getString("name"));
                model.setTech(rs.getString("tech"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }
}
