/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import static sms.Addstudent.data;

/**
 *
 * @author Bhanu Priya
 */
public class Studentdetail extends javax.swing.JFrame {

    /**
     * Creates new form Studentdetail
     */
    public Studentdetail() {
        initComponents();
    }
    private static final String DB_DRIVER = "oracle.jdbc.OracleDriver";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DB_USER = "system";
    private static final String DB_PASSWORD = "1234";
    String status="";
    ResultSet rs = null;
    Statement st = null;
    Connection con = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtaddmission = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsinfo = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblsdetail = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblsaddress = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Addmission No.");

        txtaddmission.setText(" ");
        txtaddmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddmissionActionPerformed(evt);
            }
        });

        jLabel1.setText(" Name");

        txtname.setText(" ");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText(" All");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtaddmission, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(txtname))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaddmission, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tblsinfo.setForeground(new java.awt.Color(0, 0, 153));
        tblsinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Addmissio No.", "Session", "Class", "Section", "Date of Addmission"
            }
        ));
        tblsinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsinfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsinfo);

        jScrollPane4.setViewportView(jScrollPane1);

        tblsdetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Student Name", "D O B", "Sex", "Father's Name", "Mother's Name", "father's Occupation", "Gardian Occupation ", "Yearly Income"
            }
        ));
        tblsdetail.setDropMode(javax.swing.DropMode.ON);
        tblsdetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsdetailMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblsdetail);

        jScrollPane5.setViewportView(jScrollPane2);

        tblsaddress.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Address", "City", "State", "Pin Code", "Contact No.", "E-mail"
            }
        ));
        tblsaddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsaddressMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblsaddress);

        jScrollPane6.setViewportView(jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Display1(Integer.parseInt(txtaddmission.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblsinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsinfoMouseClicked
       int row=tblsinfo.getSelectedRow();       
     int sid=Integer.parseInt(tblsinfo.getValueAt(row,0).toString());
        Display2(sid);       
    }//GEN-LAST:event_tblsinfoMouseClicked

    private void txtaddmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddmissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddmissionActionPerformed

    private void tblsaddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsaddressMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblsaddressMouseClicked

    private void tblsdetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsdetailMouseClicked
        int row=tblsdetail.getSelectedRow();       
     int id=Integer.parseInt(tblsdetail.getValueAt(row,0).toString());
        Display3(id);
    }//GEN-LAST:event_tblsdetailMouseClicked

        void Display1(int addmissionno) {
        try {
            java.lang.Class.forName(DB_DRIVER);
            con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            st = con.createStatement();
            data.clear();
            Vector<String> columnNames = new Vector<String>();
            columnNames.add("Id");
            columnNames.add("Addmission No.");
            columnNames.add("Session");
            columnNames.add("Class");
            columnNames.add("Section");
            columnNames.add("Date of addmission");
            rs = st.executeQuery("select * from SmsSystem.tblstudentinfo Where fldaddmissionnum="+addmissionno+"");
            while (rs.next()) {
                Vector<String> vstring = new Vector<String>();
                 vstring.add(rs.getString(1));
                vstring.add(rs.getString(2));
                vstring.add(rs.getString(3));
                vstring.add(rs.getString(4));
                vstring.add(rs.getString(5));
                vstring.add(rs.getString(6));
                data.add(vstring);
            }
            DefaultTableModel model = new DefaultTableModel(data, columnNames);
            tblsinfo.setModel(model);
            con.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }       
        void Display2(int id) {
        try {
            java.lang.Class.forName(DB_DRIVER);
            con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            st = con.createStatement();
            data.clear();
            Vector<String> columnNames = new Vector<String>();
             columnNames.add("Id");
            columnNames.add("Student Name");
            columnNames.add("D O B");
            columnNames.add("Sex");
            columnNames.add("Father's name");
            columnNames.add("Mother's Name");
            columnNames.add("Father's Occupation");
            columnNames.add("Mother's Occupation");
                columnNames.add("Gardian Name");
            columnNames.add("Yearly income");
            rs = st.executeQuery("select * from SmsSystem.tblstudentdetail where fldid="+id+"");
            while (rs.next()) {
                Vector<String> vstring = new Vector<String>();
                vstring.add(rs.getString(1));
                vstring.add(rs.getString(2));
                vstring.add(rs.getString(5));
                vstring.add(rs.getString(6));
                vstring.add(rs.getString(3));
                vstring.add(rs.getString(4));
                vstring.add(rs.getString(7));
                vstring.add(rs.getString(8));
                 vstring.add(rs.getString(9));
                  vstring.add(rs.getString(10));
                data.add(vstring);
            }
            DefaultTableModel model = new DefaultTableModel(data, columnNames);
            tblsdetail.setModel(model);
            con.close();
        }
        catch (Exception ex)
          {
            ex.printStackTrace();
          }
        }
        
     void Display3(int id) {
        try {
            data.clear();
           
            java.lang.Class.forName(DB_DRIVER);
            con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            st = con.createStatement();
            data.clear();
            Vector<String> columnNames = new Vector<String>();
            columnNames.add("Address");
            columnNames.add("City");
            columnNames.add("State");
            columnNames.add("Pin code");
            columnNames.add("Country");
            columnNames.add("Contact No. ");
             columnNames.add("Email ");
             DefaultTableModel model = new DefaultTableModel(data, columnNames);
            rs = st.executeQuery("select * from SmsSystem.tblstudentaddress where fldid="+id+"");
            while (rs.next()) {
                Vector<String> vstring = new Vector<String>();
                vstring.add(rs.getString(2));
                vstring.add(rs.getString(3));
                vstring.add(rs.getString(4));
                vstring.add(rs.getString(5));
                vstring.add(rs.getString(6));
                vstring.add(rs.getString(7));  
                 vstring.add(rs.getString(8));  
                data.add(vstring);
            }           
            tblsaddress.setModel(model);
            con.close();          
        }
           catch (Exception ex) 
           {
            ex.printStackTrace();
           }    
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Studentdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studentdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studentdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studentdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studentdetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblsaddress;
    private javax.swing.JTable tblsdetail;
    private javax.swing.JTable tblsinfo;
    private javax.swing.JTextField txtaddmission;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
