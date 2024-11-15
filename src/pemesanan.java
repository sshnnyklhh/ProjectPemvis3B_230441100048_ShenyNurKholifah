
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sheny
 */
public class pemesanan {
    private int id;
    private String nama, paket, harga;
    private Date tanggal;
    public pemesanan (int p_id, String p_nama, String p_paket, String p_harga, Date p_tanggal) {
        this.id = p_id;
        this.nama = p_nama;
        this.paket = p_paket;
        this.harga = p_harga;
        this.tanggal = p_tanggal;
    }
    
    public void setId(int p_id) {
        this.id = p_id;
    }
    
    public int getId() {
        return id;
    }
    public void setNama(String p_nama) {
        this.nama = p_nama;
    }
    
    public String getNama() {
        return nama;
    }
    public void setPaket(String p_paket) {
        this.paket = p_paket;
    }
    
    public String getPaket() {
        return paket;
    }
    public void setHarga(String p_harga) {
        this.harga = p_harga;
    }
    
    public String getHarga() {
        return harga;
    }
    public void setTanggal(Date p_tanggal) {
        this.tanggal =  p_tanggal;
    }
    
    public Date getTanggal() {
        return tanggal;
    }
}