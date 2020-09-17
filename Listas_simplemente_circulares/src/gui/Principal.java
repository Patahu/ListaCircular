/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.Estudiante;
import clases.ListaCircular;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patro
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    private ListaCircular lista= new ListaCircular();
    
    DefaultTableModel modelo = new DefaultTableModel();
    private static int id=1;
    public Principal() {
        initComponents();
        teId.setText(""+id);
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Edad");
        tabla.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        teId = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        teNombre = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        teApellidos = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        teEdad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnIngresarFinal = new javax.swing.JButton();
        btnIngresarInicio = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnMenorNumero = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tnText = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(970, 1200));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(4, 1));

        jPanel1.setLayout(new java.awt.GridLayout(4, 0));

        jPanel7.setLayout(new java.awt.GridLayout(1, 2));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("id:");
        jPanel7.add(jLabel4);

        teId.setEditable(false);
        jPanel7.add(teId);

        jPanel1.add(jPanel7);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombres:");
        jPanel3.add(jLabel1);
        jPanel3.add(teNombre);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Apellidos:");
        jPanel4.add(jLabel2);
        jPanel4.add(teApellidos);

        jPanel1.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Edad:");
        jPanel5.add(jLabel3);
        jPanel5.add(teEdad);

        jPanel1.add(jPanel5);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(1, 7));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar);

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrar);

        btnIngresarFinal.setText("Insertar al final");
        btnIngresarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarFinalActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresarFinal);

        btnIngresarInicio.setText("Insertar al inicio");
        btnIngresarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarInicioActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresarInicio);

        jButton6.setText("Eliminar Inicio");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        btnMenorNumero.setText("Eliminar Final");
        btnMenorNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorNumeroActionPerformed(evt);
            }
        });
        jPanel2.add(btnMenorNumero);

        getContentPane().add(jPanel2);

        jPanel8.setLayout(new java.awt.GridLayout());

        tnText.setColumns(20);
        tnText.setRows(5);
        jScrollPane2.setViewportView(tnText);

        jPanel8.add(jScrollPane2);

        getContentPane().add(jPanel8);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel6.add(jScrollPane1);

        getContentPane().add(jPanel6);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        
        lista.insertarInicio(new Estudiante(id,teNombre.getText(),teApellidos.getText(),Integer.parseInt(teEdad.getText())));
        teNombre.setText("");
        teApellidos.setText("");
        teEdad.setText("");
        id++;
        teId.setText(""+id);
        System.out.println("Se ha ingresado un elemento a la lista");
    }//GEN-LAST:event_btnAgregarActionPerformed

    
    
    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
       if(lista.longitud()!=0){
            modelo = new DefaultTableModel();
            modelo.addColumn("Nombres");
            modelo.addColumn("Apellidos");
            modelo.addColumn("Edad");
            tabla.setModel(modelo);
          for(int i=0;i<lista.longitud();i++){
              Estudiante e1=( Estudiante) lista.buscarElemento(i);
              String[] datos=new String[3];
              datos[0]=e1.getNombre();
              datos[1]=e1.getApellido();
              datos[2]=""+e1.getEdad();
              modelo.addRow(datos);
          }
       }
       tnText.setText(lista.visualizar());
    }//GEN-LAST:event_btnMostrarActionPerformed

    
    
    
    
    
    
    private void btnIngresarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarInicioActionPerformed
        // TODO add your handling code here:
        
        lista.insertarInicio(new Estudiante(id,teNombre.getText(),teApellidos.getText(),Integer.parseInt(teEdad.getText())));
        teNombre.setText("");
        teApellidos.setText("");
        teEdad.setText("");
        id++;
        teId.setText(""+id);
        System.out.println("Se ha ingresado un elemento a la lista");
    }//GEN-LAST:event_btnIngresarInicioActionPerformed

    
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        lista.eliminarInicio();
        System.out.println("Se ha eliminado un elemento a la lista");
        
    }//GEN-LAST:event_jButton6ActionPerformed

    
    
    
    private void btnIngresarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarFinalActionPerformed
        // TODO add your handling code here:

        lista.insertarFinal(new Estudiante(id,teNombre.getText(),teApellidos.getText(),Integer.parseInt(teEdad.getText())));
        teNombre.setText("");
        teApellidos.setText("");
        teEdad.setText("");
        id++;
        teId.setText(""+id);
        System.out.println("Se ha ingresado un elemento a la lista");
    }//GEN-LAST:event_btnIngresarFinalActionPerformed

    private void btnMenorNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenorNumeroActionPerformed
        lista.eliminarFinal();
        System.out.println("Se ha eliminado un elemento a la lista");
    }//GEN-LAST:event_btnMenorNumeroActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnIngresarFinal;
    private javax.swing.JButton btnIngresarInicio;
    private javax.swing.JButton btnMenorNumero;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField teApellidos;
    private javax.swing.JTextField teEdad;
    private javax.swing.JTextField teId;
    private javax.swing.JTextField teNombre;
    private javax.swing.JTextArea tnText;
    // End of variables declaration//GEN-END:variables
}