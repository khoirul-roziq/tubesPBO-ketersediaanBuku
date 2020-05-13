/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import inc.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class PanelAdd extends javax.swing.JPanel {
    DefaultTableModel model;
    /**
     * Creates new form PanelAdd
     */
    public PanelAdd() throws SQLException {
        initComponents();
        model = new DefaultTableModel();
        tableBuku.setModel(model);
        
        model.addColumn("ISBN");
        model.addColumn("Judul Buku");
        model.addColumn("Penulis");
        model.addColumn("Penerbit");
        model.addColumn("Tahun Terbit");
        model.addColumn("Tempat Terbit");
        model.addColumn("Harga");
        model.addColumn("Stock Tersedia");
        model.addColumn("Lokasi");
        
        tampilkanTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableBuku = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jISBN = new javax.swing.JLabel();
        tfISBN = new javax.swing.JTextField();
        jJudul = new javax.swing.JLabel();
        tfJudul = new javax.swing.JTextField();
        jPenulis = new javax.swing.JLabel();
        tfPenulis = new javax.swing.JTextField();
        jPenerbit = new javax.swing.JLabel();
        tfPenerbit = new javax.swing.JTextField();
        jTahunT = new javax.swing.JLabel();
        tfTahunT = new javax.swing.JTextField();
        jTempatT = new javax.swing.JLabel();
        tfTempatT = new javax.swing.JTextField();
        jHarga = new javax.swing.JLabel();
        tfHarga = new javax.swing.JTextField();
        jStock = new javax.swing.JLabel();
        tfStock = new javax.swing.JTextField();
        jLokasi = new javax.swing.JLabel();
        tfLokasi = new javax.swing.JTextField();
        bAddData = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(630, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableBuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(tableBuku);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 198, 630, 291));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(54, 33, 89));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add!");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 34, 152, -1));

        jISBN.setForeground(new java.awt.Color(54, 33, 89));
        jISBN.setText("ISBN");
        add(jISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 103, -1, -1));
        add(tfISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 100, 100, -1));

        jJudul.setForeground(new java.awt.Color(54, 33, 89));
        jJudul.setText("Judul");
        add(jJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 129, -1, -1));
        add(tfJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 126, 100, -1));

        jPenulis.setForeground(new java.awt.Color(54, 33, 89));
        jPenulis.setText("Penulis");
        add(jPenulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, -1));
        add(tfPenulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 152, 100, -1));

        jPenerbit.setForeground(new java.awt.Color(54, 33, 89));
        jPenerbit.setText("Penerbit");
        add(jPenerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 103, -1, -1));
        add(tfPenerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 100, 100, -1));

        jTahunT.setForeground(new java.awt.Color(54, 33, 89));
        jTahunT.setText("Tahun Terbit");
        add(jTahunT, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 129, -1, -1));
        add(tfTahunT, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 126, 100, -1));

        jTempatT.setForeground(new java.awt.Color(54, 33, 89));
        jTempatT.setText("Tempat Terbit");
        add(jTempatT, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 155, -1, -1));
        add(tfTempatT, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 152, 100, -1));

        jHarga.setForeground(new java.awt.Color(54, 33, 89));
        jHarga.setText("Harga");
        add(jHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 103, -1, -1));
        add(tfHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 100, 100, -1));

        jStock.setForeground(new java.awt.Color(54, 33, 89));
        jStock.setText("Stock Tersedia");
        add(jStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 129, -1, -1));
        add(tfStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 126, 100, -1));

        jLokasi.setForeground(new java.awt.Color(54, 33, 89));
        jLokasi.setText("Lokasi");
        add(jLokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 155, -1, -1));
        add(tfLokasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 152, 100, -1));

        bAddData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bAddData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_add_file_32px.png"))); // NOI18N
        bAddData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAddDataMouseClicked(evt);
            }
        });
        add(bAddData, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 100, 41, 72));
    }// </editor-fold>//GEN-END:initComponents

    private void bAddDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAddDataMouseClicked
       Database db;

       String isbn = tfISBN.getText();
       String judul = tfJudul.getText();
       String penulis = tfPenulis.getText();
       String penerbit = tfPenerbit.getText();
       String tahun = tfTahunT.getText();
       String tempat = tfTempatT.getText();
       String harga = tfHarga.getText();
       String stok = tfStock.getText();
       String lokasi = tfLokasi.getText();
       
       try {
            db = new Database();
            db.tambahData(isbn, judul, penulis, penerbit, tahun, tempat, harga, stok, lokasi);
            tampilkanTable();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
            tfISBN.setText("");
            tfJudul.setText("");
            tfPenulis.setText("");
            tfPenerbit.setText("");
            tfTahunT.setText("");
            tfTempatT.setText("");
            tfHarga.setText("");
            tfStock.setText("");
            tfLokasi.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal ditambahkan");
        }
    }//GEN-LAST:event_bAddDataMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bAddData;
    private javax.swing.JLabel jHarga;
    private javax.swing.JLabel jISBN;
    private javax.swing.JLabel jJudul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLokasi;
    private javax.swing.JLabel jPenerbit;
    private javax.swing.JLabel jPenulis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jStock;
    private javax.swing.JLabel jTahunT;
    private javax.swing.JLabel jTempatT;
    private javax.swing.JTable tableBuku;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfISBN;
    private javax.swing.JTextField tfJudul;
    private javax.swing.JTextField tfLokasi;
    private javax.swing.JTextField tfPenerbit;
    private javax.swing.JTextField tfPenulis;
    private javax.swing.JTextField tfStock;
    private javax.swing.JTextField tfTahunT;
    private javax.swing.JTextField tfTempatT;
    // End of variables declaration//GEN-END:variables

    void tampilkanTable() throws SQLException {
        Database db = new Database();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        ResultSet rs = db.tampilBuku("SELECT * FROM book");  
        try{
            while(rs.next()){
            Object[] data = new Object[9];
            data[0]=rs.getString("isbn");
            data[1]=rs.getString("judul_buku");
            data[2]=rs.getString("pengarang");
            data[3]=rs.getString("penerbit");
            data[4]=rs.getString("tahun_terbit");
            data[5]=rs.getString("tempat_terbit");
            data[6]=rs.getString("harga");
            data[7]=rs.getString("jumlah_stok");
            data[8]=rs.getString("lokasi_penempatan");
            model.addRow(data);
         }   
        }catch(SQLException e){
            System.out.println("gagal");
        }
    }
}
