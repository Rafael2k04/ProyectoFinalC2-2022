/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import conexion.ConexionMysql;
import java.sql.*;
import java.time.LocalDate;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LAB REDES
 */
public class JIFSalesGUI extends javax.swing.JInternalFrame {
ConexionMysql conectar= new ConexionMysql();
Connection conexion=conectar.conectaDB();
DefaultTableModel modelo;
double goku=0.00;

    /**
     * Creates new form JIFSalesGUI
     */
    public JIFSalesGUI() {
        initComponents();
        LLenarCombo();
         modelo= new DefaultTableModel();
         modelo.addColumn("Cantidad");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Precio");
        this.jTable1.setModel(modelo);
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
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabelCLIENTE = new javax.swing.JLabel();
        jComboBoxpRODUCTOS = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabelCLIENTE1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CANTIDAD", "DESCRIPCION", "PRECIO UNIT", "PRECIO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("TOTAL:");

        jLabelCLIENTE.setText("DIRECCION");

        jComboBoxpRODUCTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxpRODUCTOSActionPerformed(evt);
            }
        });

        jLabel1.setText("PRODUCTOS:");

        jLabelCLIENTE1.setText("CLIENTE:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("CANTIDAD");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("TIENDAS LA PRIMERA");

        jButton2.setText("CONFIRMAR VENTA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                            .addComponent(jLabelCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2)
                            .addComponent(jLabelCLIENTE1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxpRODUCTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(504, 504, 504)
                        .addComponent(jButton2)))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCLIENTE1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxpRODUCTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)))
                .addComponent(jLabelCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBoxpRODUCTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxpRODUCTOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxpRODUCTOSActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
ResultSet rs;
Statement st;
        try{
   
    PreparedStatement ps=conexion.prepareStatement("SELECT *FROM producto WHERE nombre=?");
    String variable = jComboBoxpRODUCTOS.getSelectedItem().toString();
    ps.setString(1,variable);
    String []fer=new String[4];
    rs= ps.executeQuery();
    int valor = (int)jSpinner1.getValue();
    while(rs.next()){
        goku = Double.parseDouble(rs.getString("precioventa"))*valor;
fer[0]=""+valor;
fer[1]=rs.getString("nombre");
fer[2]=rs.getString("precioventa");
fer[3]=goku+"";
modelo.addRow(fer);
    }
}catch(Exception e){
    
} 
      calcular();
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String opciones=JOptionPane.showInputDialog(null,"Seleccionar si pagara a credito o debito:\n 1.Credito \n 2.Debito");
 LocalDate todaysDate = LocalDate.now();
  Random rand = new Random(); //instance of random class
      int upperbound = 1000000;
        //generate random values from 0-24
      int int_random = rand.nextInt(upperbound); 
if(opciones.equals("1")){
    String card1=JOptionPane.showInputDialog(null,"Escribe tu Numero de Tarjeta:");
    String card2=JOptionPane.showInputDialog(null,"Confirmar  tu Numero de Tarjeta:");
    String nip=JOptionPane.showInputDialog(null,"Nip:");
    if(card1.equals(card2)){
        JOptionPane.showMessageDialog(null,"PAGADO");
         try{
        
       String sql="insert into sales (tipo,fecha,serie,numeroventa,importetotal,client,Direccion) VALUES('"+"credito"+"','"+todaysDate+"','"+int_random+"','1','"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jTextField3.getText()+"')";
       Statement stm=conexion.createStatement();
       int i=stm.executeUpdate(sql);
       
       for(int j=0;j<jTable1.getRowCount();j++){
           PreparedStatement pps= conexion.prepareStatement("INSERT INTO salesdetails (serie,cantidad,descripcion,precio,subtotal)VALUES(?,?,?,?,?)");
           pps.setString(1, ""+int_random);
           pps.setString(2, jTable1.getValueAt(j, 0).toString());
           pps.setString(3, jTable1.getValueAt(j, 1).toString());
           pps.setString(4, jTable1.getValueAt(j, 2).toString());
           pps.setString(5, jTable1.getValueAt(j, 3).toString());
           pps.executeUpdate();
       }
       JOptionPane.showMessageDialog(null,"Guardado en la Base de datos");
       
    }catch(SQLException e){
        
    }
    }else{
      JOptionPane.showMessageDialog(null, "No puede Pagar rechazada la tarjeta");
    }
   
    
}else if(opciones.equals("2")){
    try{
        
       String sql="INSERT INTO sales VALUES('"+"contado"+"','"+todaysDate+"','"+int_random+"','"+"1"+"','"+jTextField1.getText()+"','"+jTextField2.getText()+"','"+jTextField3.getText()+"')";
       Statement stm=conexion.createStatement();
       int i=stm.executeUpdate(sql);
       
       for(int j=0;j<jTable1.getRowCount();j++){
           PreparedStatement pps= conexion.prepareStatement("INSERT INTO salesdetails (serie,cantidad,descripcion,precio,subtotal)VALUES(?,?,?,?,?)");
           pps.setString(1, ""+int_random);
           pps.setString(2, jTable1.getValueAt(j, 0).toString());
           pps.setString(3, jTable1.getValueAt(j, 1).toString());
           pps.setString(4, jTable1.getValueAt(j, 2).toString());
           pps.setString(5, jTable1.getValueAt(j, 3).toString());
           pps.executeUpdate();
       }
       
       
    }catch(SQLException e){
        
    }
}
//GUARADRA LOS DATOS EN SALES
  //      SALES DETlle
    //            manada imprimir a la impresora

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

public void LLenarCombo(){
  String sql="SELECT nombre FROM producto";  
  
  try{
      PreparedStatement ps=conexion.prepareStatement(sql);
      ResultSet rs=ps.executeQuery();
      jComboBoxpRODUCTOS.addItem("Seleccionar Opcion");
      while(rs.next()){
          jComboBoxpRODUCTOS.addItem(rs.getString("nombre"));
      }
  }catch(SQLException e){
      
  }
}

 void calcular()
    {
        String pre;
        String can;
        double igv=0;
        double total=0;
        double subtotal=0;
        double precio;
        int cantidad;
        double imp=0.0;
        
            /*can=Integer.parseInt(cant);
            imp=pre*can;
            dato[4]=Float.toString(imp);*/
        
        for(int i=0;i<jTable1.getRowCount();i++)
        {
            pre=jTable1.getValueAt(i, 2).toString();
            can=jTable1.getValueAt(i, 0).toString();
            precio=Double.parseDouble(pre);
            cantidad=Integer.parseInt(can);
            imp=precio*cantidad;
            subtotal=subtotal+imp;
             
        }
       
        jTextField1.setText(""+Math.rint(subtotal*100)/100);
        
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxpRODUCTOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCLIENTE;
    private javax.swing.JLabel jLabelCLIENTE1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
