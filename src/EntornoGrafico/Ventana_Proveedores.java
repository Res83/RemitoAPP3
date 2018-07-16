package EntornoGrafico;

import CodigoFuente.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ventana_Proveedores extends javax.swing.JFrame
{
    Conexion conex = new Conexion();
    Connection cone2;
     Conexion CargarDB_Base_datos_Proveedores = new Conexion();
 
    private String SeBorroRegistro;
    private String TextoTemporal;
    private int id_borrado_es;
    private Integer Comienza_desde_Aqui;
    private String Bandera_Modificando;
    private int seleccion;
    
    
 
int contador_de_error=0;

public Ventana_Proveedores()
{
    initComponents();    
    
    jButton_EliminarRegistro.setVisible(false);
    
    jButton_ModificarRegistro.setVisible(false);
    
    jTextField_Empresa.requestFocus();
       
        Bandera_Modificando="No";
        
        
// Textos de Aviso que debe completar:        
        jLabel_Requerido_Empresa.setVisible(false);
        jLabel_Requerido_NombreyApellido.setVisible(false);
        jLabel_Requerido_CalleNumero.setVisible(false);
        jLabel_Requerido_Telefono.setVisible(false);
        

    conex.CrearDB_Base_datos_Proveedores();
    cone2= conex.CargarDB_Base_datos_Proveedores();
    
    if (cone2!=null)
    {
        PropiedadesTabla();
        
    }
}

    Ventana_Proveedores(Panel_Inicio aThis, boolean b)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2_Codigo_Provedor = new javax.swing.JLabel();
        jTextField_txtCodigo_Proveedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_txtNombreApellido_Proveedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1_txtCalle_Proveedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1_txtCalle_Numero_Proveedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1_txtTelefonoFijo_Proveedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2_txtTelefonoMovil_Proveedor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_TablaProveedores = new javax.swing.JTable();
        jLabel_Requerido_NombreyApellido = new javax.swing.JLabel();
        jLabel_Requerido_CalleNumero = new javax.swing.JLabel();
        jLabel_Requerido_Telefono = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField_Empresa = new javax.swing.JTextField();
        jLabel_Requerido_Empresa = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1_txtPiso_Proveedor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1_txtEntreCalles_Proveedor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField1_txtGoogleMaps_Proveedor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField1_txtCODPOSTAL_Proveedor = new javax.swing.JTextField();
        jTextField1_txtProvincia_Proveedor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1_txtCiudad_Proveedor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField1_txtEmail_Proveedor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_txtAnotacionl_Proveedor = new javax.swing.JTextArea();
        jButton_AgregarRegistro = new javax.swing.JButton();
        jButton_ModificarRegistro = new javax.swing.JButton();
        jButton1_CerrarVentanAbierta = new javax.swing.JButton();
        jButton_EliminarRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RemitoAPP > Proveedores");
        setAlwaysOnTop(true);
        setSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Proveedores");

        jLabel2_Codigo_Provedor.setText("Código:");

        jTextField_txtCodigo_Proveedor.setEditable(false);
        jTextField_txtCodigo_Proveedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_txtCodigo_Proveedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField_txtCodigo_ProveedorActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre y Apellido:");

        jTextField1_txtNombreApellido_Proveedor.setToolTipText("Campo Mínimo requerido (Requerido)");
        jTextField1_txtNombreApellido_Proveedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1_txtNombreApellido_ProveedorActionPerformed(evt);
            }
        });

        jLabel3.setText("Calle:");

        jTextField1_txtCalle_Proveedor.setToolTipText("Campo Mínimo requerido (Requerido)");

        jLabel6.setText("Numero:");

        jTextField1_txtCalle_Numero_Proveedor.setToolTipText("Campo Mínimo requerido (Requerido)");
        jTextField1_txtCalle_Numero_Proveedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1_txtCalle_Numero_ProveedorActionPerformed(evt);
            }
        });

        jLabel4.setText("Teléfono Fijo:");

        jTextField1_txtTelefonoFijo_Proveedor.setToolTipText("Campo Mínimo requerido (Requerido)");

        jLabel5.setText("Celular:");

        jTextField2_txtTelefonoMovil_Proveedor.setToolTipText("Campo Mínimo requerido (Requerido)");
        jTextField2_txtTelefonoMovil_Proveedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField2_txtTelefonoMovil_ProveedorActionPerformed(evt);
            }
        });

        jTable_TablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {

            }
        ));
        jTable_TablaProveedores.setEnabled(false);
        jTable_TablaProveedores.setFocusable(false);
        jTable_TablaProveedores.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTable_TablaProveedoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_TablaProveedores);

        jLabel_Requerido_NombreyApellido.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Requerido_NombreyApellido.setText("(Requerido)");

        jLabel_Requerido_CalleNumero.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Requerido_CalleNumero.setText("(Requerido)");

        jLabel_Requerido_Telefono.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Requerido_Telefono.setText("(Requerido a lo sumo un Teléfono)");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Empresa:");

        jLabel_Requerido_Empresa.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Requerido_Empresa.setText("(Requerido)");

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
                                    .addComponent(jTextField1_txtNombreApellido_Proveedor)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1_txtCalle_Proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1_txtCalle_Numero_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Requerido_NombreyApellido)
                                    .addComponent(jLabel_Requerido_CalleNumero)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1_txtTelefonoFijo_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2_txtTelefonoMovil_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Requerido_Telefono)))
                        .addContainerGap(149, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Requerido_Empresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2_Codigo_Provedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_txtCodigo_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2_Codigo_Provedor)
                        .addComponent(jTextField_txtCodigo_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Requerido_Empresa))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1_txtNombreApellido_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Requerido_NombreyApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1_txtCalle_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1_txtCalle_Numero_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Requerido_CalleNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1_txtTelefonoFijo_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2_txtTelefonoMovil_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Requerido_Telefono))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Datos Basicos", jPanel1);

        jLabel7.setText("Piso / Depto :");

        jTextField1_txtPiso_Proveedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1_txtPiso_ProveedorActionPerformed(evt);
            }
        });

        jLabel8.setText("Entre Calles :");

        jLabel9.setText("GoogleMaps :");

        jLabel10.setText("Código Postal :");

        jLabel12.setText("Provincia :");

        jLabel13.setText("Ciudad :");

        jLabel14.setText("E-mail:");

        jTextField1_txtEmail_Proveedor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField1_txtEmail_ProveedorActionPerformed(evt);
            }
        });

        jLabel11.setText("Anotación (Un bloque de texto Libre):");

        jTextArea1_txtAnotacionl_Proveedor.setColumns(20);
        jTextArea1_txtAnotacionl_Proveedor.setRows(5);
        jScrollPane1.setViewportView(jTextArea1_txtAnotacionl_Proveedor);

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
                            .addComponent(jTextField1_txtPiso_Proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(jTextField1_txtEntreCalles_Proveedor)
                            .addComponent(jTextField1_txtGoogleMaps_Proveedor)
                            .addComponent(jTextField1_txtEmail_Proveedor)
                            .addComponent(jTextField1_txtCiudad_Proveedor)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField1_txtCODPOSTAL_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1_txtProvincia_Proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))))
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
                    .addComponent(jTextField1_txtPiso_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1_txtEntreCalles_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField1_txtGoogleMaps_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1_txtCODPOSTAL_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField1_txtProvincia_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField1_txtCiudad_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField1_txtEmail_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos Opcionales", jPanel2);

        jButton_AgregarRegistro.setText("Guardar Nuevo Proveedor");
        jButton_AgregarRegistro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_AgregarRegistroActionPerformed(evt);
            }
        });

        jButton_ModificarRegistro.setText("Modificar Registro");
        jButton_ModificarRegistro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_ModificarRegistroActionPerformed(evt);
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

        jButton_EliminarRegistro.setText("Eliminar Registro");
        jButton_EliminarRegistro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_EliminarRegistroActionPerformed(evt);
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
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_AgregarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1_CerrarVentanAbierta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_ModificarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_EliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton1_CerrarVentanAbierta))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_AgregarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_ModificarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_EliminarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_txtEmail_ProveedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1_txtEmail_ProveedorActionPerformed
    {//GEN-HEADEREND:event_jTextField1_txtEmail_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_txtEmail_ProveedorActionPerformed

    private void jButton1_CerrarVentanAbiertaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1_CerrarVentanAbiertaActionPerformed
    {//GEN-HEADEREND:event_jButton1_CerrarVentanAbiertaActionPerformed
// Clic Boton Cerrar

//  Java: dispose() es usado para cerrar un jframe
dispose();
    }//GEN-LAST:event_jButton1_CerrarVentanAbiertaActionPerformed

    private void jTextField1_txtNombreApellido_ProveedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1_txtNombreApellido_ProveedorActionPerformed
    {//GEN-HEADEREND:event_jTextField1_txtNombreApellido_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_txtNombreApellido_ProveedorActionPerformed

    private void jButton_AgregarRegistroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_AgregarRegistroActionPerformed
    {//GEN-HEADEREND:event_jButton_AgregarRegistroActionPerformed
     contador_de_error=0;
        
        Validar();
        
        if(contador_de_error==0)
        {            
      //agregar Proveedores a la tabla
               cone2= conex.CargarDB_Base_datos_Proveedores();
                if (cone2!=null)
        
        {
                    try
            
            {
                Statement orden = cone2.createStatement();
                String crear = "Insert Into ListadeProveedores"
                        + "("
                        + "Codigo_Proveedor,"
                        + "Empresa,"
                        + "NombreyApellidoProveedor,"
                        + "Calle_Proveedor,"
                        + "Calle_Numero_Proveedor,"
                        + "TelefonoFijo_Proveedor,"
                        + "TelefonoMovil_Proveedor,"
                        + "Piso_Proveedor,"
                        + "EntreCalles_Proveedor,"
                        + "GoogleMaps_Proveedor,"
                        + "CODPOSTAL_Proveedor,"
                        + "Provincia_Proveedor,"
                        + "Ciudad_Proveedor,"
                        + "Email_Proveedor,"
                        + "Anotacionl_Proveedor"
                        + ") Values("
                        + ""+jTextField_txtCodigo_Proveedor.getText()+","
                        + "'"+jTextField_Empresa.getText()+"',"                       
                        + "'"+jTextField1_txtNombreApellido_Proveedor.getText()+"',"
                        + "'"+jTextField1_txtCalle_Proveedor.getText()+"',"
                        + ""+jTextField1_txtCalle_Numero_Proveedor.getText()+","
                        + ""+jTextField1_txtTelefonoFijo_Proveedor.getText()+","
                        + ""+jTextField2_txtTelefonoMovil_Proveedor.getText()+","
                        + "'"+jTextField1_txtPiso_Proveedor.getText()+"',"
                        + "'"+jTextField1_txtEntreCalles_Proveedor.getText()+"',"
                        + "'"+jTextField1_txtGoogleMaps_Proveedor.getText()+"',"
                        + "'"+jTextField1_txtCODPOSTAL_Proveedor.getText()+"',"
                        + "'"+jTextField1_txtProvincia_Proveedor.getText()+"',"
                        + "'"+jTextField1_txtCiudad_Proveedor.getText()+"',"
                        + "'"+jTextField1_txtEmail_Proveedor.getText()+"',"
                        + "'"+jTextArea1_txtAnotacionl_Proveedor.getText()+"'"
                        + ")";
                
                
                        orden.executeUpdate(crear);
                        System.out.println("Registro creado");
                        PropiedadesTabla();
                        
                        
                        
                       JOptionPane.showMessageDialog(this, "Se ha agregado correctamente ("+jTextField_Empresa.getText()+")");
                        }
                    catch (SQLException ex)
            {
                          System.out.println("Error WILSONG:"+ex);
                          JOptionPane.showMessageDialog(this, "Error: Numero de Proveedor Repetido ("+jTextField_txtCodigo_Proveedor.getText()+") Cambie el numero");
                                    
                            }}            
            

        }else
        {            
                JOptionPane.showMessageDialog(this, "Es neceserio completar los campos requeridos para guardar.", "Aviso", 0, null);
        }
        }
              
/**
 * @param args the command line arguments
 */
public static void main(String args[])
{
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
        java.util.logging.Logger.getLogger(Ventana_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(() ->
    {
        new Ventana_Proveedores().setVisible(true);
    });
    
    }//GEN-LAST:event_jButton_AgregarRegistroActionPerformed

    private void jTextField1_txtPiso_ProveedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1_txtPiso_ProveedorActionPerformed
    {//GEN-HEADEREND:event_jTextField1_txtPiso_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_txtPiso_ProveedorActionPerformed

    private void jTextField2_txtTelefonoMovil_ProveedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField2_txtTelefonoMovil_ProveedorActionPerformed
    {//GEN-HEADEREND:event_jTextField2_txtTelefonoMovil_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_txtTelefonoMovil_ProveedorActionPerformed

    private void jTextField_txtCodigo_ProveedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField_txtCodigo_ProveedorActionPerformed
    {//GEN-HEADEREND:event_jTextField_txtCodigo_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_txtCodigo_ProveedorActionPerformed

    private void jTextField1_txtCalle_Numero_ProveedorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField1_txtCalle_Numero_ProveedorActionPerformed
    {//GEN-HEADEREND:event_jTextField1_txtCalle_Numero_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_txtCalle_Numero_ProveedorActionPerformed

    private void jButton_ModificarRegistroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_ModificarRegistroActionPerformed
    {//GEN-HEADEREND:event_jButton_ModificarRegistroActionPerformed



        //Boton Modificar registro
        if (jTextField_Empresa.getText().equals(""))
        {
            JOptionPane.showInputDialog(this,"Codigo de Proveedor Vacio");
        }else
        {
            Editar_Registro();
        }

    }//GEN-LAST:event_jButton_ModificarRegistroActionPerformed

    private void jButton_EliminarRegistroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_EliminarRegistroActionPerformed
    {//GEN-HEADEREND:event_jButton_EliminarRegistroActionPerformed
        if (jTextField_Empresa.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"El campo de Codigo de Proveedor esta Vacio");
        } else
        {
            // el codigo indica los botones de eleminar y cancelar tomando el codigo JOtionPane. la option Yes.Option es el primier boton o el de okey
            // La segunda NO_Option seria el boton cancelar o el 2 boton
            String opcion[] = {"Eliminar", "Cancelar"};
            String TextoFantasma=jTextField1_txtNombreApellido_Proveedor.getText();
            int eleccion = JOptionPane.showOptionDialog(this, "¿Quieres eliminar (" +TextoFantasma+ ") ?", "Eliminar registro", 0, 0, null, opcion, evt);
            if (eleccion==JOptionPane.YES_OPTION)
            {
                EliminarRegistro();

            }
            else if (eleccion==JOptionPane.NO_OPTION)
            {

            }
        }

    }//GEN-LAST:event_jButton_EliminarRegistroActionPerformed

    private void jTable_TablaProveedoresMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTable_TablaProveedoresMouseClicked
    {//GEN-HEADEREND:event_jTable_TablaProveedoresMouseClicked
// al cliquear la tabla va tomar datos y mostrar en formulario
     Bandera_Modificando="Si";
     
        jButton_AgregarRegistro.setVisible(false);
        jButton_ModificarRegistro.setVisible(true);
        jButton_EliminarRegistro.setVisible(true);
        
     int seleccion=jTable_TablaProveedores.rowAtPoint(evt.getPoint());
     
     jTextField_txtCodigo_Proveedor.setText(String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 0)));
     jTextField_Empresa.setText (String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 1)));    
     jTextField1_txtNombreApellido_Proveedor.setText (String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 2)));
     jTextField1_txtCalle_Proveedor.setText (String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 3)));
     jTextField1_txtCalle_Numero_Proveedor.setText (String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 4)));
     jTextField1_txtTelefonoFijo_Proveedor.setText (String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 5))); 
     jTextField2_txtTelefonoMovil_Proveedor.setText (String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 6)));
     jTextField1_txtPiso_Proveedor.setText (String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 7)));    
     jTextField1_txtEntreCalles_Proveedor.setText (String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 8)));
     jTextField1_txtGoogleMaps_Proveedor.setText (String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 9)));
     jTextField1_txtCODPOSTAL_Proveedor.setText (String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 10)));
     jTextField1_txtProvincia_Proveedor.setText (String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 11)));    
     jTextField1_txtCiudad_Proveedor.setText (String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 12))); 
     jTextField1_txtEmail_Proveedor.setText (String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 13))); 
     jTextArea1_txtAnotacionl_Proveedor.setText (String.valueOf(jTable_TablaProveedores.getValueAt(seleccion, 14)));
     jTextField_Empresa.requestFocus();
        
    }//GEN-LAST:event_jTable_TablaProveedoresMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_CerrarVentanAbierta;
    private javax.swing.JButton jButton_AgregarRegistro;
    private javax.swing.JButton jButton_EliminarRegistro;
    private javax.swing.JButton jButton_ModificarRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel_Requerido_Empresa;
    private javax.swing.JLabel jLabel_Requerido_NombreyApellido;
    private javax.swing.JLabel jLabel_Requerido_Telefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_TablaProveedores;
    private javax.swing.JTextArea jTextArea1_txtAnotacionl_Proveedor;
    private javax.swing.JTextField jTextField1_txtCODPOSTAL_Proveedor;
    private javax.swing.JTextField jTextField1_txtCalle_Numero_Proveedor;
    private javax.swing.JTextField jTextField1_txtCalle_Proveedor;
    private javax.swing.JTextField jTextField1_txtCiudad_Proveedor;
    private javax.swing.JTextField jTextField1_txtEmail_Proveedor;
    private javax.swing.JTextField jTextField1_txtEntreCalles_Proveedor;
    private javax.swing.JTextField jTextField1_txtGoogleMaps_Proveedor;
    private javax.swing.JTextField jTextField1_txtNombreApellido_Proveedor;
    private javax.swing.JTextField jTextField1_txtPiso_Proveedor;
    private javax.swing.JTextField jTextField1_txtProvincia_Proveedor;
    private javax.swing.JTextField jTextField1_txtTelefonoFijo_Proveedor;
    private javax.swing.JTextField jTextField2_txtTelefonoMovil_Proveedor;
    private javax.swing.JTextField jTextField_Empresa;
    private javax.swing.JTextField jTextField_txtCodigo_Proveedor;
    // End of variables declaration//GEN-END:variables

 
    private void Validar() 
    {   
          if(jTextField_Empresa.getText().equals(""))
        {
            jLabel_Requerido_Empresa.setVisible(true);
            contador_de_error++;
            System.out.println("+ Empresa");
        }else
        {
            jLabel_Requerido_Empresa.setVisible(false);
                        System.out.println("- Empresa");
        }
        if(jTextField1_txtNombreApellido_Proveedor.getText().equals(""))
        {
            jLabel_Requerido_NombreyApellido.setVisible(true);
            contador_de_error++;
            System.out.println("+ NombreAmpellido");
        }else
        {
            jLabel_Requerido_NombreyApellido.setVisible(false);
                        System.out.println("- NombreAmpellido");
        }
            
        if(jTextField1_txtCalle_Proveedor.getText().equals(""))
        {
            jLabel_Requerido_CalleNumero.setVisible(true);
            contador_de_error++;
                        System.out.println("+ Calle");
        }else
        {
            jLabel_Requerido_CalleNumero.setVisible(false);
                                    System.out.println("- Calle");
        }
        if(jTextField1_txtCalle_Numero_Proveedor.getText().equals(""))
        {
            jLabel_Requerido_CalleNumero.setVisible(true);
            contador_de_error++;
                        System.out.println("+ Numero");
        }else
        {
            jLabel_Requerido_CalleNumero.setVisible(false);
                                    System.out.println("- Numero");
        }
        if(jTextField1_txtTelefonoFijo_Proveedor.getText().equals("")|| (jTextField2_txtTelefonoMovil_Proveedor.getText().equals("")))
        {
            jLabel_Requerido_Telefono.setVisible(true);
            contador_de_error++;
                                    System.out.println("+ TelefonoFijoyCelular");
        }else
        {
            jLabel_Requerido_Telefono.setVisible(false);
            System.out.println("- TelefonoFijoyCelular");
        }
//               if(jTextField2_txtTelefonoMovil_Proveedor.getText().equals(""))
//        {
//            jLabel_Requerido_Telefono.setVisible(true);
//            contador_de_error++;
//                                    System.out.println("+ celular");
//        }else
//        {
//            jLabel_Requerido_Telefono.setVisible(false);
//            System.out.println("- celular");
//        }
    
              System.out.println("Contador de Error = "+contador_de_error);  
    }
    
    public int id_incrementable()
{
    int id=1;
    PreparedStatement ps =null;
    cone2= conex.CargarDB_Base_datos_Proveedores();
    try
    {
      Statement orden = cone2.createStatement();
      ResultSet r = orden.executeQuery("Select MAX(Codigo_Proveedor) From ListadeProveedores");
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
    
    
    
void EliminarRegistro()

{
    cone2= conex.CargarDB_Base_datos_Proveedores();
   if(cone2!=null) {
        try
        {
       String TextoFantasma=jTextField1_txtNombreApellido_Proveedor.getText();
            try ( // Esto sirve para eleminar y actualizar vista de datos de la tabla.!! :9
                    Statement orden = cone2.createStatement())
            {
                String Eliminar = "Delete From ListadeProveedores  Where Codigo_Proveedor="+jTextField_txtCodigo_Proveedor.getText();
                orden.executeUpdate (Eliminar);       
            }
            SeBorroRegistro="Si";
       PropiedadesTabla();
           
       
       JOptionPane.showMessageDialog(this, "El Proveedor: ("+TextoFantasma+") se ha Eliminado con Exito");
        }
        catch (SQLException ex)
        {
        JOptionPane.showMessageDialog(this, "Error, no se pudo eliminar el registro: "+ex);
        }
       
   }
}
void Modificar_Proveedor()
{
    initComponents();
    conex.CrearDB_Base_datos_Proveedores();
    cone2= conex.CargarDB_Base_datos_Proveedores();
   if(cone2!=null)
   {
      PropiedadesTabla();
   }
}

    private void Editar_Registro()
    {
       cone2= conex.CargarDB_Base_datos_Proveedores();
       
       
       if (cone2!=null)
       {
           try    
           {
               Statement orden = cone2.createStatement();
               String editar="Update ListadeProveedores set "
                        + "Empresa='"+jTextField_Empresa.getText()+"',"
                        + "NombreyApellidoProveedor='"+jTextField1_txtNombreApellido_Proveedor.getText()+"',"
                        + "Calle_Proveedor='"+jTextField1_txtCalle_Proveedor.getText()+"',"
                        + "Calle_Numero_Proveedor="+jTextField1_txtCalle_Numero_Proveedor.getText()+","
                        + "TelefonoFijo_Proveedor="+jTextField1_txtTelefonoFijo_Proveedor.getText()+","
                        + "TelefonoMovil_Proveedor="+jTextField2_txtTelefonoMovil_Proveedor.getText()+","
                        + "Piso_Proveedor='"+jTextField1_txtPiso_Proveedor.getText()+"',"
                        + "EntreCalles_Proveedor='"+jTextField1_txtEntreCalles_Proveedor.getText()+"',"
                        + "GoogleMaps_Proveedor='"+jTextField1_txtGoogleMaps_Proveedor.getText()+"',"
                        + "CODPOSTAL_Proveedor='"+jTextField1_txtCODPOSTAL_Proveedor.getText()+"',"
                        + "Provincia_Proveedor='"+jTextField1_txtProvincia_Proveedor.getText()+"',"
                        + "Ciudad_Proveedor='"+jTextField1_txtCiudad_Proveedor.getText()+"',"
                        + "Email_Proveedor='"+jTextField1_txtEmail_Proveedor.getText()+"',"
                        + "Anotacionl_Proveedor='"+jTextArea1_txtAnotacionl_Proveedor.getText()+"'"
                       + "Where Codigo_Proveedor="+jTextField_txtCodigo_Proveedor.getText();
               
               orden.executeUpdate(editar);
               JOptionPane.showMessageDialog(this, "El Registro ("+jTextField1_txtNombreApellido_Proveedor.getText()+") se ha Modificado");
               PropiedadesTabla();
           }
           catch (SQLException ex)
           {
           JOptionPane.showMessageDialog(this, "No se puede Modificar el registro:"+ex);
           }
       }
        
    }
     private void PropiedadesTabla()
 {
cone2= conex.CargarDB_Base_datos_Proveedores();
     if(SeBorroRegistro!="NO"){
int id=id_incrementable();
jTextField_txtCodigo_Proveedor.setText(String.valueOf(id));
jTextField_Empresa.setText("");
jTextField1_txtNombreApellido_Proveedor.setText("");
jTextField1_txtCalle_Proveedor.setText("");
jTextField1_txtCalle_Numero_Proveedor.setText("");
jTextField1_txtTelefonoFijo_Proveedor.setText("");
jTextField2_txtTelefonoMovil_Proveedor.setText("");
jTextField1_txtPiso_Proveedor.setText("");
jTextField1_txtEntreCalles_Proveedor.setText("");
jTextField1_txtGoogleMaps_Proveedor.setText("");
jTextField1_txtCODPOSTAL_Proveedor.setText("");
jTextField1_txtProvincia_Proveedor.setText("");
jTextField1_txtCiudad_Proveedor.setText("");
jTextField1_txtEmail_Proveedor.setText("");
jTextArea1_txtAnotacionl_Proveedor.setText("");

}
     String Columnas[]=
     {
         "cod",
         "Empresa",
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
         ResultSet r=orden.executeQuery("Select* From ListadeProveedores");
         
         while(r.next())
         {
         Object Filas[] = 
         {
             r.getString("Codigo_Proveedor"),
             r.getString("Empresa"),
             r.getString("NombreyApellidoProveedor"),
             r.getString("Calle_Proveedor"),
             r.getString("Calle_Numero_Proveedor"),
             r.getString("TelefonoFijo_Proveedor"),
             r.getString("TelefonoMovil_Proveedor"),
             r.getString("Piso_Proveedor"),
             r.getString("EntreCalles_Proveedor"),
             r.getString("GoogleMaps_Proveedor"),
             r.getString("CODPOSTAL_Proveedor"),
             r.getString("Provincia_Proveedor"),
             r.getString("Ciudad_Proveedor"),
             r.getString("Email_Proveedor"),
             r.getString("Anotacionl_Proveedor")
         };
         dft.addRow(Filas);
         }
         jTable_TablaProveedores.setModel(dft);
     }
     catch (SQLException ex)
     {
         Logger.getLogger(Ventana_Proveedores.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("No Anda Carga de la tabla");
     }
     
 }

    
    }