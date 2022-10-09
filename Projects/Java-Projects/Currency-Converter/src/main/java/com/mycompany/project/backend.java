package com.mycompany.project;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class backend {
    public static double USD;
    public static double PKR;
    public static double BTC;
    public static double ETH;
    public static double DOGE;
    public static double BNB;
    public static double ADA;
    public static double XRP;
    public static double DOT;
    public static double UNI;

    public static void main(String[] args) {
        Connect();
        getValues();
    }

    static Connection connection;
    static PreparedStatement pst;
    ResultSet rs;
    Statement stmt;

    public static void Connect() {

        String url = "jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11505382";
        String username = "sql11505382";
        String password = "gmbMwnGKDC";
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("EZ");
        }

        catch (SQLException e) {
            System.out.println("oops");
        }
        ;
    }

    public void LoadCurrencies() {
        try {
            pst = connection.prepareStatement("SELECT ID FROM currencydata");
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Converter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void getValues() {
        try {
            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet srs;

            String q = "SELECT * FROM currencydata where ID = ?";
            pst = connection.prepareStatement(q);
            pst.setString(1, "1");
            srs = pst.executeQuery();
            if (srs.next() == true) {
                USD = srs.getDouble("USD");
                PKR = srs.getDouble("PKR");
                BTC = srs.getDouble("BTC");
                ETH = srs.getDouble("ETH");
                DOGE = srs.getDouble("DOGE");
                BNB = srs.getDouble("BNB");
                ADA = srs.getDouble("ADA");
                XRP = srs.getDouble("XRP");
                DOT = srs.getDouble("DOT");
                UNI = srs.getDouble("UNI");
            }
        } catch (SQLException ex) {
            System.out.println("oops");
        }
    }
}
