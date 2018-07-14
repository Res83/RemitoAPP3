package EntornoGrafico;

import CodigoFuente.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Provedores_Agregar extends javax.swing.JFrame
{
 Conexion conex = new Conexion();
 Connection cone2;
 
    private String SeBorroRegistro;
    private String TextoTemporal;
    private int id_borrado_es;
    private Integer Comienza_desde_Aqui;
    private String Bandera_Modificando;
    private int seleccion;
    
    
 
int contador_de_error=0;

 
 private void PropiedadesTabla()
 {
     if(SeBorroRegistro!="SI"){
int id=id_incrementable();
jTextField_txtCodigo_Provedor.setText(String.valueOf(id));    
}
     String Columnas[]=
     {
         "cod",
         "Nombre y Apellido",
         "Calle",
         "Altura",
         "Teléfono",
         "Celular",
         "Piso",
         "Entre Calles",
         "GoogleMaps",
         "CP",
         "Provincia",
         "Ciudad",
         "E-mail",
         "Nota"
     };
     DefaultTableModel dft = new DefaultTableModel(null,Columnas);
     
     try
     {
         Statement orden = cone2.createStatement();
         ResultSet r=orden.executeQuery("Select* From ListadeProvedores");
         
         while(r.next())
         {
         Object Filas[] = 
         {
             r.getString("Codigo_Provedor"),
             r.getString("NombreyApellidoProvedor"),
             r.getString("Calle_Provedor"),
             r.getString("Calle_Numero_Provedor"),
             r.getString("TelefonoFijo_Provedor"),
             r.getString("TelefonoMovil_Provedor"),
             r.getString("Piso_Provedor"),
             r.getString("EntreCalles_Provedor"),
             r.getString("GoogleMaps_Provedor"),
             r.getString("CODPOSTAL_Provedor"),
             r.getString("Provincia_Provedor"),
             r.getString("Ciudad_Provedor"),
             r.getString("Email_Provedor"),
             r.getString("Anotacionl_Provedor")
         };
         dft.addRow(Filas);
         }
         jTable_TablaProvedores.setModel(dft);
     }
     catch (SQLException ex)
     {
         Logger.getLogger(Provedores_Agregar.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("No Anda Carga de la tabla");
     }
     
 }


public Provedores_Agregar()
{
    initComponents();
       
        Bandera_Modificando="No";
        jLabel_Requerido_NombreyApellido.setVisible(false);
        jLabel_Requerido_CalleNumero.setVisible(false);
        jLabel_Requerido_Telefono.setVisible(false);
        
    conex.CrearDB_Base_datos_Provedores();
    cone2=conex.CargarDB_Base_datos_Provedores();
    if (cone2!=null)
    {
        PropiedadesTabla();
        
    }
    
    

}

    Provedores_Agregar(Panel_Inicio aThis, boolean b)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

/**
 * This method is called from within the constructor to
 * initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is
 * always regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2_Codigo_Provedor = new javax.swing.JLabel();
        jTextField_txtCodigo_Provedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_txtNombreApellido_Provedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1_txtCalle_Provedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1_txtCalle_Numero_Provedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1_txtTelefonoFijo_Provedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2_txtTelefonoMovil_Provedor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_TablaProvedores = new javax.swing.JTable();
        jLabel_Requerido_NombreyApellido = new javax.swing.JLabel();
        jLabel_Requerido_CalleNumero = new javax.swing.JLabel();
        jLabel_Requerido_Telefono = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1_txtPiso_Provedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1_txtEntreCalles_Provedor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField1_txtGoogleMaps_Provedor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField1_txtCODPOSTAL_Provedor = new javax.swing.JTextField();
        jTextField1_txtProvincia_Provedor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1_txtCiudad_Provedor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField1_txtEmail_Provedor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_txtAnotacionl_Provedor = new javax.swing.JTextArea();
        jButton1_GuardarNuevoProvedor = new javax.swing.JButton();
        jButton1_CerrarVentanAbierta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RemitoAPP > Agregar Nuevo Provedor");
        setAlwaysOnTop(true);
        setSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Agregar nuevo Provedor");

        jLabel2_Codigo_Provedor.setText("Código:");

        jTextField_txtCodigo_Provedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_txtCodigo_Provedor.setText("000");
        jTextField_txtCodigo_Provedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField_txtCodigo_ProvedorActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre y Apellido:");

        jTextField1_txtNombreApellido_Provedor.setToolTipText("Campo Mínimo requerido (Requerido)");
        jTextField1_txtNombreApellido_Provedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1_txtNombreApellido_ProvedorActionPerformed(evt);
            }
        });

        jLabel3.setText("Calle:");

        jTextField1_txtCalle_Provedor.setToolTipText("Campo Mínimo requerido (Requerido)");

        jLabel6.setText("Numero:");

        jTextField1_txtCalle_Numero_Provedor.setToolTipText("Campo Mínimo requerido (Requerido)");
        jTextField1_txtCalle_Numero_Provedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1_txtCalle_Numero_ProvedorActionPerformed(evt);
            }
        });

        jLabel4.setText("Teléfono Fijo:");

        jTextField1_txtTelefonoFijo_Provedor.setToolTipText("Campo Mínimo requerido (Requerido)");

        jLabel5.setText("Celular:");

        jTextField2_txtTelefonoMovil_Provedor.setToolTipText("Campo Mínimo requerido (Requerido)");
        jTextField2_txtTelefonoMovil_Provedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField2_txtTelefonoMovil_ProvedorActionPerformed(evt);
            }
        });

        jTable_TablaProvedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {

            }
        ));
        jTable_TablaProvedores.setEnabled(false);
        jTable_TablaProvedores.setFocusable(false);
        jScrollPane2.setViewportView(jTable_TablaProvedores);

        jLabel_Requerido_NombreyApellido.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Requerido_NombreyApellido.setText("(Requerido)");

        jLabel_Requerido_CalleNumero.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Requerido_CalleNumero.setText("(Requerido)");

        jLabel_Requerido_Telefono.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Requerido_Telefono.setText("(Requerido a lo sumo un Teléfono)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1_txtNombreApellido_Provedor)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1_txtCalle_Provedor, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1_txtCalle_Numero_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Requerido_NombreyApellido)
                                    .addComponent(jLabel_Requerido_CalleNumero)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1_txtTelefonoFijo_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2_txtTelefonoMovil_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Requerido_Telefono)))
                        .addContainerGap(149, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 590, Short.MAX_VALUE)
                                .addComponent(jLabel2_Codigo_Provedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_txtCodigo_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_Codigo_Provedor)
                    .addComponent(jTextField_txtCodigo_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1_txtNombreApellido_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Requerido_NombreyApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1_txtCalle_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1_txtCalle_Numero_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Requerido_CalleNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1_txtTelefonoFijo_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2_txtTelefonoMovil_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Requerido_Telefono))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Datos Basicos", jPanel1);

        jLabel7.setText("Piso / Depto :");

        jTextField1_txtPiso_Provedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1_txtPiso_ProvedorActionPerformed(evt);
            }
        });

        jLabel8.setText("Entre Calles :");

        jLabel9.setText("GoogleMaps :");

        jLabel10.setText("Código Postal :");

        jLabel12.setText("Provincia :");

        jLabel13.setText("Ciudad :");

        jLabel14.setText("E-mail:");

        jTextField1_txtEmail_Provedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1_txtEmail_ProvedorActionPerformed(evt);
            }
        });

        jLabel11.setText("Anotación (Un bloque de texto Libre):");

        jTextArea1_txtAnotacionl_Provedor.setColumns(20);
        jTextArea1_txtAnotacionl_Provedor.setRows(5);
        jScrollPane1.setViewportView(jTextArea1_txtAnotacionl_Provedor);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1_txtPiso_Provedor, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(jTextField1_txtEntreCalles_Provedor)
                            .addComponent(jTextField1_txtGoogleMaps_Provedor)
                            .addComponent(jTextField1_txtEmail_Provedor)
                            .addComponent(jTextField1_txtCiudad_Provedor)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField1_txtCODPOSTAL_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1_txtProvincia_Provedor, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))))
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1_txtPiso_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1_txtEntreCalles_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField1_txtGoogleMaps_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1_txtCODPOSTAL_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField1_txtProvincia_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField1_txtCiudad_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField1_txtEmail_Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos Opcionales", jPanel2);

        jButton1_GuardarNuevoProvedor.setText("Guardar Nuevo Provedor");
        jButton1_GuardarNuevoProvedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1_GuardarNuevoProvedorActionPerformed(evt);
            }
        });

        jButton1_CerrarVentanAbierta.setText("Cerrar");
        jButton1_CerrarVentanAbierta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1_CerrarVentanAbiertaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1_GuardarNuevoProvedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1_CerrarVentanAbierta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1_GuardarNuevoProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1_CerrarVentanAbierta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_txtEmail_ProvedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1_txtEmail_ProvedorActionPerformed
    {//GEN-HEADEREND:event_jTextField1_txtEmail_ProvedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_txtEmail_ProvedorActionPerformed

    private void jButton1_CerrarVentanAbiertaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1_CerrarVentanAbiertaActionPerformed
    {//GEN-HEADEREND:event_jButton1_CerrarVentanAbiertaActionPerformed
// Clic Boton Cerrar

//  Java: dispose() es usado para cerrar un jframe
dispose();
    }//GEN-LAST:event_jButton1_CerrarVentanAbiertaActionPerformed

    private void jTextField1_txtNombreApellido_ProvedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1_txtNombreApellido_ProvedorActionPerformed
    {//GEN-HEADEREND:event_jTextField1_txtNombreApellido_ProvedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_txtNombreApellido_ProvedorActionPerformed

    private void jButton1_GuardarNuevoProvedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1_GuardarNuevoProvedorActionPerformed
    {//GEN-HEADEREND:event_jButton1_GuardarNuevoProvedorActionPerformed
     contador_de_error=0;
        
        Validar();
        
        if(contador_de_error==0)
        {            
      //agregar Provedores a la tabla
               cone2 = conex.CargarDB_Base_datos_Provedores();
                if (cone2!=null)
        
        {
                    try
            
            {
                Statement orden = cone2.createStatement();
                String crear = "Insert Into ListadeProvedores"
                        + "("
                        + "Codigo_Provedor,"
                        + "NombreyApellidoProvedor,"
                        + "Calle_Provedor,"
                        + "Calle_Numero_Provedor,"
                        + "TelefonoFijo_Provedor,"
                        + "TelefonoMovil_Provedor,"
                        + "Piso_Provedor,"
                        + "EntreCalles_Provedor,"
                        + "GoogleMaps_Provedor,"
                        + "CODPOSTAL_Provedor,"
                        + "Provincia_Provedor,"
                        + "Ciudad_Provedor,"
                        + "Email_Provedor,"
                        + "Anotacionl_Provedor"
                        + ") Values("
                        + ""+jTextField_txtCodigo_Provedor.getText()+","
                        + "'"+jTextField1_txtNombreApellido_Provedor.getText()+"',"
                        + "'"+jTextField1_txtCalle_Provedor.getText()+"',"
                        + ""+jTextField1_txtCalle_Numero_Provedor.getText()+","
                        + ""+jTextField1_txtTelefonoFijo_Provedor.getText()+","
                        + ""+jTextField2_txtTelefonoMovil_Provedor.getText()+","
                        + "'"+jTextField1_txtPiso_Provedor.getText()+"',"
                        + "'"+jTextField1_txtEntreCalles_Provedor.getText()+"',"
                        + "'"+jTextField1_txtGoogleMaps_Provedor.getText()+"',"
                        + "'"+jTextField1_txtCODPOSTAL_Provedor.getText()+"',"
                        + "'"+jTextField1_txtProvincia_Provedor.getText()+"',"
                        + "'"+jTextField1_txtCiudad_Provedor.getText()+"',"
                        + "'"+jTextField1_txtEmail_Provedor.getText()+"',"
                        + "'"+jTextArea1_txtAnotacionl_Provedor.getText()+"'"
                        + ")";
                
                
                        orden.executeUpdate(crear);
                        System.out.println("Registro creado");
                        PropiedadesTabla();
                        
                        
                        
                       JOptionPane.showMessageDialog(this, "Se ha agregado correctamente ("+jTextField1_txtNombreApellido_Provedor.getText()+")");
                        }
                    catch (SQLException ex)
            {
                          System.out.println("Error WILSONG:"+ex);
                          JOptionPane.showMessageDialog(this, "Error: Numero de Provedor Repetido ("+jTextField_txtCodigo_Provedor.getText()+") Cambie el numero");
                                    
                            }}            
            

        }else
        {
          JOptionPane.showMessageDialog(this, "Error: Es neceserio completar los campos requeridos para guardar.");
        }
        }
              
/**
 * @param args the command line arguments
 */
public static void main(String args[])
{
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try
    {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
        {
            if ("Nimbus".equals(info.getName()))
            {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    }
    catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
    {
        java.util.logging.Logger.getLogger(Provedores_Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
     //</editor-fold>
     //</editor-fold>
     //</editor-fold>
     //</editor-fold>
     //</editor-fold>
     //</editor-fold>
     //</editor-fold>
     //</editor-fold>

    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() ->
    {
        new Provedores_Agregar().setVisible(true);
    });
    
    }//GEN-LAST:event_jButton1_GuardarNuevoProvedorActionPerformed

    private void jTextField1_txtPiso_ProvedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1_txtPiso_ProvedorActionPerformed
    {//GEN-HEADEREND:event_jTextField1_txtPiso_ProvedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_txtPiso_ProvedorActionPerformed

    private void jTextField2_txtTelefonoMovil_ProvedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField2_txtTelefonoMovil_ProvedorActionPerformed
    {//GEN-HEADEREND:event_jTextField2_txtTelefonoMovil_ProvedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_txtTelefonoMovil_ProvedorActionPerformed

    private void jTextField_txtCodigo_ProvedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField_txtCodigo_ProvedorActionPerformed
    {//GEN-HEADEREND:event_jTextField_txtCodigo_ProvedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_txtCodigo_ProvedorActionPerformed

    private void jTextField1_txtCalle_Numero_ProvedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1_txtCalle_Numero_ProvedorActionPerformed
    {//GEN-HEADEREND:event_jTextField1_txtCalle_Numero_ProvedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_txtCalle_Numero_ProvedorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_CerrarVentanAbierta;
    private javax.swing.JButton jButton1_GuardarNuevoProvedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_Codigo_Provedor;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Requerido_CalleNumero;
    private javax.swing.JLabel jLabel_Requerido_NombreyApellido;
    private javax.swing.JLabel jLabel_Requerido_Telefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_TablaProvedores;
    private javax.swing.JTextArea jTextArea1_txtAnotacionl_Provedor;
    private javax.swing.JTextField jTextField1_txtCODPOSTAL_Provedor;
    private javax.swing.JTextField jTextField1_txtCalle_Numero_Provedor;
    private javax.swing.JTextField jTextField1_txtCalle_Provedor;
    private javax.swing.JTextField jTextField1_txtCiudad_Provedor;
    private javax.swing.JTextField jTextField1_txtEmail_Provedor;
    private javax.swing.JTextField jTextField1_txtEntreCalles_Provedor;
    private javax.swing.JTextField jTextField1_txtGoogleMaps_Provedor;
    private javax.swing.JTextField jTextField1_txtNombreApellido_Provedor;
    private javax.swing.JTextField jTextField1_txtPiso_Provedor;
    private javax.swing.JTextField jTextField1_txtProvincia_Provedor;
    private javax.swing.JTextField jTextField1_txtTelefonoFijo_Provedor;
    private javax.swing.JTextField jTextField2_txtTelefonoMovil_Provedor;
    private javax.swing.JTextField jTextField_txtCodigo_Provedor;
    // End of variables declaration//GEN-END:variables

 
    private void Validar() 
    {      
        if(jTextField1_txtNombreApellido_Provedor.getText().equals(""))
        {
            jLabel_Requerido_NombreyApellido.setVisible(true);
            contador_de_error++;
            System.out.println("+ NombreAmpellido");
        }else
        {
            jLabel_Requerido_NombreyApellido.setVisible(false);
                        System.out.println("- NombreAmpellido");
        }
            
        if(jTextField1_txtCalle_Provedor.getText().equals(""))
        {
            jLabel_Requerido_CalleNumero.setVisible(true);
            contador_de_error++;
                        System.out.println("+ Calle");
        }else
        {
            jLabel_Requerido_CalleNumero.setVisible(false);
                                    System.out.println("- Calle");
        }
        if(jTextField1_txtCalle_Numero_Provedor.getText().equals(""))
        {
            jLabel_Requerido_CalleNumero.setVisible(true);
            contador_de_error++;
                        System.out.println("+ Numero");
        }else
        {
            jLabel_Requerido_CalleNumero.setVisible(false);
                                    System.out.println("- Numero");
        }
        if(jTextField1_txtTelefonoFijo_Provedor.getText().equals(""))
        {
            jLabel_Requerido_Telefono.setVisible(true);
            contador_de_error++;
                                    System.out.println("+ TelefonoFijoyCelular");
        }else
        {
            jLabel_Requerido_Telefono.setVisible(false);
            System.out.println("- TelefonoFijoyCelular");
        }
               if(jTextField2_txtTelefonoMovil_Provedor.getText().equals(""))
        {
            jLabel_Requerido_Telefono.setVisible(true);
            contador_de_error++;
                                    System.out.println("+ celular");
        }else
        {
            jLabel_Requerido_Telefono.setVisible(false);
//            contador_de_error--;
            System.out.println("- celular");
        }
    
              System.out.println("Contador de Error = "+contador_de_error);  
    }
    
    public int id_incrementable()
{
    int id=1;
    PreparedStatement ps =null;
    cone2= conex.CargarDB_Base_datos_Provedores();
    try
    {
      Statement orden = cone2.createStatement();
      ResultSet r = orden.executeQuery("Select MAX(Codigo_Provedor) From ListadeProvedores");
        while (r.next())
        {            
                    id=r.getInt(1)+1;

        }
        System.out.println("Id Maximo:"+id);
        
            }
    catch (Exception ex)
    {
        System.out.println("Error:"+ex);
    }
    finally
    {
        try
        {
            ps.close();
            
            //DesconectarBasededatos Falta
        }
        catch (Exception e)
        {
        }
    
    }
    
        if(SeBorroRegistro=="SI")
    {
                        System.out.println("Se Borro un registro recien:"+SeBorroRegistro+"La Id era:"+id_borrado_es );
     id=Comienza_desde_Aqui;   
    }
    
        return id;
    }
    
    }