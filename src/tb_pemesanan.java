
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Date;

/**

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheny
 */
public class tb_pemesanan {
    private final String URL = "jdbc:mysql://localhost:3306/db_bromo";
    private final String USER = "root";
    private final String PASS = ""; //default string kosong
    
    Connection getConnection()  throws SQLException {
       return DriverManager.getConnection(URL, USER, PASS );            
    }
    
    public List<pemesanan> getAllpemesanan() throws SQLException {
        List<pemesanan> list_pemesanan = new ArrayList();
        
        String sql = "select * from tb_pemesanan";
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                pemesanan pemesanan= new pemesanan(
                        rs.getInt("id"), 
                        rs.getString("nama"),
                        rs.getString("paket"),
                        rs.getString("harga"),
                        rs.getDate("tanggal")
                );
                
                list_pemesanan.add(pemesanan);
            }
        }
        
        return list_pemesanan;
    }
    
    public void Insertpemesanan(pemesanan p_pemesanan) throws SQLException {
        String sql = "insert into tb_pemesanan (nama, paket, harga, tanggal) values (?, ?, ?, ?)";
    
        try (
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
        ) {
            stmt.setString(1, p_pemesanan.getNama());
            stmt.setString(2, p_pemesanan.getPaket());
            stmt.setString(3, p_pemesanan.getHarga());
            stmt.setDate(4, new java.sql.Date(p_pemesanan.getTanggal().getTime()));

            
            stmt.executeUpdate();
        }
    }
    
    public void updatePemesanan(pemesanan p_pemesanan) throws SQLException {
    String sql = "UPDATE tb_pemesanan SET nama = ?, paket = ?, harga = ?, tanggal = ? WHERE id = ?";
    
    try (Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, p_pemesanan.getNama());
        stmt.setString(2, p_pemesanan.getPaket());
        stmt.setString(3, p_pemesanan.getHarga());
        stmt.setDate(4, new java.sql.Date(p_pemesanan.getTanggal().getTime()));
        stmt.setInt(5, p_pemesanan.getId());
        
        stmt.executeUpdate();
        }
    }
    
    public void deletePemesanan(int id) throws SQLException {
        String sql = "DELETE FROM tb_pemesanan WHERE id = ?";

        try (Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);

            stmt.executeUpdate();
        }
    }
}

    

