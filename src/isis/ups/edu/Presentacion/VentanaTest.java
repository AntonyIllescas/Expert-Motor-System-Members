package isis.ups.edu.Presentacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Antony
 */
import CLIPSJNI.Environment;
import CLIPSJNI.PrimitiveValue;
import java.awt.BorderLayout;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class VentanaTest extends javax.swing.JFrame {

    /**
     * Variables 
     */
    private Environment clips;
    public int Valorpregunta1, Valorpregunta2, Valorpregunta3, Valorpregunta4, Valorpregunta5 ,Valorpregunta6, Valorpregunta7, Valorpregunta8, Valorpregunta9, Valorpregunta10;

    public VentanaTest() {
        initComponents();
        ///this.setTitle("IPCA");
        this.setSize(1850, 950);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        clips = new Environment();
        clips.load("ReglasPersonalidad.clp");
        clips.reset();
        clips.run();
        this.crearIcono();
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Este metodo crea un icono personalisado para la ventana
     */
private void crearIcono(){
            Image icono = null;
            
            try {
                icono = ImageIO.read(getClass().getResource("IpcaIcon.png"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            setIconImage(icono);  

        } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBotones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        PanelRedesSociales = new javax.swing.JPanel();
        lblJoseIllescas = new javax.swing.JLabel();
        lblOscarMora = new javax.swing.JLabel();
        lblFacebook = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        btnIngresar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnVerAlumnos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btnEliminar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        btmEstadisticas = new javax.swing.JMenuItem();
        MenuInicio = new javax.swing.JMenu();
        btnTest = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        btnTestRealizados = new javax.swing.JMenuItem();
        MenuReportes = new javax.swing.JMenu();
        btnReporte = new javax.swing.JMenuItem();
        MenuAcerca = new javax.swing.JMenu();
        btnInformacion = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        btnManual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelBotones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/paciente.png"))); // NOI18N
        jButton1.setText("Alumnos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/test.png"))); // NOI18N
        jButton2.setText("Realizar Test");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/estadistica.png"))); // NOI18N
        jButton3.setText("Estadisticas");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/imprimir.png"))); // NOI18N
        jButton4.setText("imprimir");

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelRedesSociales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblJoseIllescas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/user.png"))); // NOI18N
        lblJoseIllescas.setText("   Jose Illescas");

        lblOscarMora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/user.png"))); // NOI18N
        lblOscarMora.setText("   Oscar Mora");

        lblFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/iconoFacebook.png"))); // NOI18N

        javax.swing.GroupLayout PanelRedesSocialesLayout = new javax.swing.GroupLayout(PanelRedesSociales);
        PanelRedesSociales.setLayout(PanelRedesSocialesLayout);
        PanelRedesSocialesLayout.setHorizontalGroup(
            PanelRedesSocialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRedesSocialesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJoseIllescas, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOscarMora, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelRedesSocialesLayout.setVerticalGroup(
            PanelRedesSocialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRedesSocialesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFacebook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRedesSocialesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelRedesSocialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJoseIllescas)
                    .addComponent(lblOscarMora))
                .addGap(27, 27, 27))
        );

        PanelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/ipca.png"))); // NOI18N

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(533, 533, 533)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(529, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        MenuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/adelante.png"))); // NOI18N
        MenuArchivo.setText("Archivo");

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/paciente.png"))); // NOI18N
        btnIngresar.setText("Ingresar Alumno");
        MenuArchivo.add(btnIngresar);
        MenuArchivo.add(jSeparator1);

        btnVerAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/paciente.png"))); // NOI18N
        btnVerAlumnos.setText("Ver Alumnos");
        MenuArchivo.add(btnVerAlumnos);
        MenuArchivo.add(jSeparator2);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/paciente.png"))); // NOI18N
        btnEliminar.setText("Eliminar Alumnos");
        MenuArchivo.add(btnEliminar);
        MenuArchivo.add(jSeparator3);

        btmEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/estadistica.png"))); // NOI18N
        btmEstadisticas.setText("Ver Estadisticas");
        btmEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEstadisticasActionPerformed(evt);
            }
        });
        MenuArchivo.add(btmEstadisticas);

        BarraMenu.add(MenuArchivo);

        MenuInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/atras.png"))); // NOI18N
        MenuInicio.setText("Inicio");

        btnTest.setText("Realizar Test");
        MenuInicio.add(btnTest);
        MenuInicio.add(jSeparator4);

        btnTestRealizados.setText("Ver Test Realizados");
        MenuInicio.add(btnTestRealizados);

        BarraMenu.add(MenuInicio);

        MenuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/listar.gif"))); // NOI18N
        MenuReportes.setText("Reportes");

        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/pdf.jpg"))); // NOI18N
        btnReporte.setText("Generar Reporte");
        MenuReportes.add(btnReporte);

        BarraMenu.add(MenuReportes);

        MenuAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/helpmediumfw.png"))); // NOI18N
        MenuAcerca.setText("Acerca");

        btnInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/user_blue_32.png"))); // NOI18N
        btnInformacion.setText("Informacion");
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });
        MenuAcerca.add(btnInformacion);

        BarraMenu.add(MenuAcerca);

        MenuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/ayuda.gif"))); // NOI18N
        MenuAyuda.setText("Ayuda");

        btnManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isis/ups/Imagenes/pdf.jpg"))); // NOI18N
        btnManual.setText("Ver Manual");
        MenuAyuda.add(btnManual);

        BarraMenu.add(MenuAyuda);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelRedesSociales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelRedesSociales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        // TODO add your handling code here:
        new Acerca().setVisible(true);
    }//GEN-LAST:event_btnInformacionActionPerformed

    private void btmEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEstadisticasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btmEstadisticasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                ListarAlumnos p4 = new ListarAlumnos();
        p4.setSize(1525,730);
        p4.setLocation(20,20);
         PanelPrincipal.removeAll();
         PanelPrincipal.add(p4, BorderLayout.CENTER);
         PanelPrincipal.revalidate();
         PanelPrincipal.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                        PanelTest p5 = new PanelTest();
        p5.setSize(1525,730);
        p5.setLocation(20,20);
         PanelPrincipal.removeAll();
         PanelPrincipal.add(p5, BorderLayout.CENTER);
         PanelPrincipal.revalidate();
         PanelPrincipal.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu MenuAcerca;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenu MenuInicio;
    private javax.swing.JMenu MenuReportes;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelRedesSociales;
    private javax.swing.JMenuItem btmEstadisticas;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JMenuItem btnInformacion;
    private javax.swing.JMenuItem btnIngresar;
    private javax.swing.JMenuItem btnManual;
    private javax.swing.JMenuItem btnReporte;
    private javax.swing.JMenuItem btnTest;
    private javax.swing.JMenuItem btnTestRealizados;
    private javax.swing.JMenuItem btnVerAlumnos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel lblFacebook;
    private javax.swing.JLabel lblJoseIllescas;
    private javax.swing.JLabel lblOscarMora;
    // End of variables declaration//GEN-END:variables
}
