package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

@Component
public class DataStorageJDBC {
    Connection con;
    Statement statement;

    private static final String url = "jdbc:mysql://localhost:3307/mydb?useSSL=false";
    private static final String login = "root";
    private static final String password = "root";

    @PostConstruct
    public void init() throws SQLException {

        con = DriverManager.getConnection(url,login,password);
        statement = con.createStatement();
    }

    public ResultSet executeQuery(String query) throws SQLException {
        return statement.executeQuery(query);
    }

    public int executeUpdate(String query) throws SQLException{
        return  statement.executeUpdate(query);
    }

    public DataStorageJDBC() throws SQLException {
    }
}
