
package gui;

import entities.Client;
import entities.Producto;
import implement.ImplProducto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resources.Resources;


public class JIFProductoGUI extends javax.swing.JInternalFrame {

    ImplProducto ip= new ImplProducto();
    Resources r= new Resources();
      DefaultTableModel modelo;
    public JIFProductoGUI() {
        initComponents();
        ReporteDataDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFormulario = new javax.swing.JPanel();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_paterno = new javax.swing.JLabel();
        jLabel_materno = new javax.swing.JLabel();
        jLabel_nro = new javax.swing.JLabel();
        jTextField_PRODUCTO = new javax.swing.JTextField();
        jTextField_PRECIO_VENTA = new javax.swing.JTextField();
        jTextField_STOCK = new javax.swing.JTextField();
        jTextField_PRECIO_COMPRA = new javax.swing.JTextField();
        jButtonActualizar = new javax.swing.JButton();
        jButtonGrabar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        idproduct = new javax.swing.JTextField();

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_titulo.setText("Formulario Producto");
        jLabel_titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nombre.setText("Nombres:");

        jLabel_paterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_paterno.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_paterno.setText("Stock:");

        jLabel_materno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_materno.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_materno.setText("Precio Venta:");

        jLabel_nro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nro.setText("Precio Compra:");

        jTextField_PRODUCTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PRODUCTOActionPerformed(evt);
            }
        });

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonGrabar.setText("Grabar");
        jButtonGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_paterno)
                    .addComponent(jLabel_nombre)
                    .addComponent(jLabel_materno)
                    .addComponent(jLabel_nro))
                .addGap(31, 31, 31)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_PRODUCTO)
                    .addComponent(jTextField_PRECIO_VENTA, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jTextField_STOCK)
                    .addComponent(jTextField_PRECIO_COMPRA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFormularioLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButtonGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre)
                    .addComponent(jTextField_PRODUCTO, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_STOCK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_paterno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_PRECIO_VENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_materno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_PRECIO_COMPRA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nro))
                .addGap(75, 75, 75)
                .addComponent(jButtonActualizar)
                .addGap(93, 93, 93))
            .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormularioLayout.createSequentialGroup()
                    .addContainerGap(250, Short.MAX_VALUE)
                    .addComponent(jButtonGrabar)
                    .addGap(124, 124, 124)))
        );

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(idproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(idproduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
  System.out.print("Actualiza"+idproduct.getText());

        if(jTextField_PRODUCTO.getText().equals("")||
            jTextField_STOCK.getText().equals("")||
            jTextField_PRECIO_VENTA.getText().equals("")||
            jTextField_PRECIO_COMPRA.getText().equals("")
        ){
            JOptionPane.showMessageDialog(null, "Ingrese los datos completos");

        }else{

          Producto ps=new Producto();
            ps.setProd_id(idproduct.getText());
            ps.setProd_nombre(jTextField_PRODUCTO.getText());
            ps.setProd_stock(jTextField_STOCK.getText());
            ps.setProd_preciocompra(Double.parseDouble(jTextField_PRECIO_COMPRA.getText()));
            ps.setProd_precioveta(Double.parseDouble(jTextField_PRECIO_VENTA.getText()));
            int row=jTableProductos.getSelectedRow();
            updateOneReporteData(row);
            
            ip.ActualizarProducto(ps);
            JOptionPane.showMessageDialog(null, "Se actualizo de manera satisfactoria");
            
            ReporteDataDB();
        }
            // limpiarJTextField();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrabarActionPerformed
        Producto p= new Producto();
        p.setProd_id(r.generaID());
        p.setProd_nombre(jTextField_PRODUCTO.getText());
        p.setProd_stock(jTextField_STOCK.getText());
        p.setProd_preciocompra(Double.parseDouble(jTextField_PRECIO_COMPRA.getText()));
        p.setProd_precioveta(Double.parseDouble(jTextField_PRECIO_VENTA.getText()));
        
        ip.AddProducto(p);
        ReporteDataDB();
        limpiarTXfield();
    }//GEN-LAST:event_jButtonGrabarActionPerformed

    private void jTextField_PRODUCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PRODUCTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PRODUCTOActionPerformed
 public void limpiarTXfield(){
     jTextField_PRECIO_COMPRA.setText("");
     jTextField_PRECIO_VENTA.setText("");
     jTextField_PRODUCTO.setText("");
     jTextField_STOCK.setText("");
     
 }
 public void ReporteDataDB(){
        System.out.println("Reporte de desde db");
                
            modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Stock");
            modelo.addColumn("Precio Venta");
            modelo.addColumn("Precio Compra");
    

                for (Producto pers : ip.reporteProductos()) {
                    Object[] fila = new Object[5];
                    fila[0] = pers.getProd_id();
                    fila[1] = pers.getProd_nombre();
                    fila[2] = pers.getProd_stock();
                    fila[3] = pers.getProd_precioveta();
                    fila[4] = pers.getProd_preciocompra();
                    
                    

                    modelo.addRow(fila);
                }
            jTableProductos.setModel(modelo); 
 }
 
    public void updateOneReporteData(int rowSelected){
        Object[] fila = new Object[5];
                    jTableProductos.setValueAt(jTextField_PRODUCTO.getText(), rowSelected, 0);
                    jTableProductos.setValueAt(jTextField_STOCK.getText(), rowSelected, 1);
                    jTableProductos.setValueAt(jTextField_PRECIO_VENTA.getText(), rowSelected, 2);
                    jTableProductos.setValueAt(jTextField_PRECIO_COMPRA.getText(), rowSelected, 3);
                    jTableProductos.setValueAt(idproduct.getText(), rowSelected, 4);
                    
    }

 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idproduct;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonGrabar;
    private javax.swing.JLabel jLabel_materno;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nro;
    private javax.swing.JLabel jLabel_paterno;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextField_PRECIO_COMPRA;
    private javax.swing.JTextField jTextField_PRECIO_VENTA;
    private javax.swing.JTextField jTextField_PRODUCTO;
    private javax.swing.JTextField jTextField_STOCK;
    // End of variables declaration//GEN-END:variables
}
