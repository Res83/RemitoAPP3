/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntornoGrafico;

import CodigoFuente.Conexion;

/**
 *
 * @author Res
 */
public class Panel_Inicio extends javax.swing.JFrame
{

    private boolean Ingreso_en_Contador;
    
    Conexion conexion_BaseDatosCategorias = new Conexion();
    Conexion conexion_BaseDatosUbicaciones = new Conexion();
    Conexion conexion_BaseDatosProductos = new Conexion();
    

// Conexion conexion_BaseDatosClientes = new Conexion();
    

public Panel_Inicio()
{
    initComponents();


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
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_Productos_Agregar_Nuevo = new javax.swing.JMenuItem();
        jMenuItem_Productos_Categorias = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RemitoAPP");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("RemitoAPP 1.0");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido, para comenzar elija una de las opciones.");

        jMenu4.setText("Remitos");

        jMenuItem11.setText("Generar Nuevo");
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Buscar - Re-Imprimir");
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Listado de Remitos");
        jMenu4.add(jMenuItem13);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Provedores");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Productos");

        jMenuItem_Productos_Agregar_Nuevo.setText("Productos");
        jMenuItem_Productos_Agregar_Nuevo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem_Productos_Agregar_NuevoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_Productos_Agregar_Nuevo);

        jMenuItem_Productos_Categorias.setText("Categorias");
        jMenuItem_Productos_Categorias.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem_Productos_CategoriasActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_Productos_Categorias);

        jMenuItem1.setText("Ubicaciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Clientes");

        jMenuItem2.setText("Agregar Nuevo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Modificar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Ayuda");

        jMenuItem15.setText("Como se usa esta Aplicación");
        jMenu5.add(jMenuItem15);

        jMenuItem14.setText("Acerca de RemitosAPP");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem3ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem3ActionPerformed
// Modificar Cliente
        
        // Abrir Formulario Clientes_Agregar.java
       // new Clientes_Agregar(this,true).setVisible(true);
     //   this.setVisible(false);
        Panel_Inicio VB = new Panel_Inicio();
        Modificar_Clientes ventanabierta = new Modificar_Clientes();
        ventanabierta.setLocationRelativeTo(getParent());
        ventanabierta.setVisible(true);
     //  this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem2ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem2ActionPerformed
// Abrir Formulario Clientes_Agregar.java
       // new Clientes_Agregar(this,true).setVisible(true);
     //   this.setVisible(false);
        Panel_Inicio VB = new Panel_Inicio();
        Clientes_Agregar ventanabierta = new Clientes_Agregar();
        ventanabierta.setLocationRelativeTo(getParent());
        ventanabierta.setVisible(true);
     //  this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);     
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem14ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem14ActionPerformed
// Abrir Acerca_de_RemitoAPP.java

        Panel_Inicio VB = new Panel_Inicio();
        Acerca_de_RemitoAPP ventanabierta = new Acerca_de_RemitoAPP();
        ventanabierta.setLocationRelativeTo(getParent());
        ventanabierta.setVisible(true);
    //   this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem1ActionPerformed
        conexion_BaseDatosUbicaciones.CrearDB_Base_datos_Ubicaciones();
        Panel_Inicio VB = new Panel_Inicio();
        Ventana_Ubicaciones ventanabierta = new Ventana_Ubicaciones();
        ventanabierta.setLocationRelativeTo(getParent());
        ventanabierta.setVisible(true);
        // this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem_Productos_CategoriasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem_Productos_CategoriasActionPerformed
    {//GEN-HEADEREND:event_jMenuItem_Productos_CategoriasActionPerformed
        conexion_BaseDatosCategorias.CrearDB_Lista_de_Categorias();
        Panel_Inicio VB = new Panel_Inicio();
        Ventana_Categorias ventanabierta = new Ventana_Categorias();
        ventanabierta.setLocationRelativeTo(getParent());
        ventanabierta.setVisible(true);
        // this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem_Productos_CategoriasActionPerformed

    private void jMenuItem_Productos_Agregar_NuevoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem_Productos_Agregar_NuevoActionPerformed
    {//GEN-HEADEREND:event_jMenuItem_Productos_Agregar_NuevoActionPerformed
        // Modificar Provedor
        // Abrir Formulario Provedor_Agregar.java
        // new Provedor_Agregar(this,true).setVisible(true);
        //   this.setVisible(false);
        conexion_BaseDatosUbicaciones.CrearDB_Base_datos_Ubicaciones();
        conexion_BaseDatosCategorias.CrearDB_Lista_de_Categorias();
        Panel_Inicio VB = new Panel_Inicio();
        Ventana_Productos ventanabierta = new Ventana_Productos();
        ventanabierta.setLocationRelativeTo(getParent());
        ventanabierta.setVisible(true);
        //  this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem_Productos_Agregar_NuevoActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu2MouseClicked
    {//GEN-HEADEREND:event_jMenu2MouseClicked
// Abrir Formulario Clientes_Agregar.java
       // new Clientes_Agregar(this,true).setVisible(true);
     //   this.setVisible(false);
        Panel_Inicio VB = new Panel_Inicio();
        Ventana_Proveedores ventanabierta = new Ventana_Proveedores();
        ventanabierta.setLocationRelativeTo(getParent());
        ventanabierta.setVisible(true);
   //    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenu2MouseClicked

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
        java.util.logging.Logger.getLogger(Panel_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() ->
    {
        new Panel_Inicio().setVisible(true);
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem_Productos_Agregar_Nuevo;
    private javax.swing.JMenuItem jMenuItem_Productos_Categorias;
    // End of variables declaration//GEN-END:variables
}
