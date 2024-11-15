/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author sheny
 */
public class tb_login {
    private final String URL = "jdbc:mysql://localhost:3306/db_bromo";
    private final String USER = "root";
    private final String PASS = ""; //default string kosong
    
    Connection getConnection()  throws SQLException {
       return DriverManager.getConnection(URL, USER, PASS );            
    }
    
    public void InsertLogin(String username, String password) throws SQLException {
        String checkSql = "SELECT * FROM tb_login WHERE username = ?";
        String insertSql = "INSERT INTO tb_login (username, password) VALUES (?, ?)";

        try (
            Connection conn = getConnection();
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            PreparedStatement insertStmt = conn.prepareStatement(insertSql);
        ) {
            // Cek apakah username sudah ada
            checkStmt.setString(1, username);
            try (ResultSet rs = checkStmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("username ini sudah ada. Tidak dapat menambahkan data duplikat.");
                    return; 
                }
            }

            // Jika tidak ada data duplikat, masukkan data login admin baru
            insertStmt.setString(1, username);
            insertStmt.setString(2, password);
            insertStmt.executeUpdate();
            System.out.println("Login berhasil ditambahkan.");
        }
    }
}
