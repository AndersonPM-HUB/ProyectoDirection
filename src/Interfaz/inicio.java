/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import gfutria.SearchStateSpaces;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import modelo.*;
import javax.swing.SwingUtilities;

/**
 *
 * @author Lenovo
 */
public class inicio extends javax.swing.JFrame {

    public inicio() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        INIX = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FINALX = new javax.swing.JTextField();
        INITY = new javax.swing.JTextField();
        FINALY = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        TABLA = new javax.swing.JLabel();
        datos_label = new javax.swing.JLabel();
        datos_label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setText("DIRECTION CHANGE VARIATION ");

        INIX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INIXActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel2.setText("POSICIÓN  INICIAL ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel3.setText("POSICIÓN FINAL ");

        FINALX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FINALXActionPerformed(evt);
            }
        });

        jLabel4.setText("X");

        jLabel5.setText("Y");

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jButton1.setText("CALCULAR");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TABLA.setText("jLabel6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TABLA)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TABLA)
                .addContainerGap(341, Short.MAX_VALUE))
        );

        datos_label1.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datos_label1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FINALX, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FINALY, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INIX, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(INITY, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20)
                .addComponent(datos_label)
                .addGap(250, 250, 250))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(INIX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INITY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(FINALX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FINALY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(datos_label1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(144, 144, 144)
                .addComponent(datos_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INIXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INIXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INIXActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Obtener el contenido de los campos de entrada
        String finalXValue = FINALX.getText();
        String finalYValue = FINALY.getText();
        String initYValue = INITY.getText();
        String initXValue = INIX.getText();

        try {
            int finalX = Integer.parseInt(finalXValue);
            int finalY = Integer.parseInt(finalYValue);
            int initY = Integer.parseInt(initYValue);
            int initX = Integer.parseInt(initXValue);

            System.out.println("FINALX: " + finalX);
            System.out.println("FINALY: " + finalY);
            System.out.println("INITY: " + initY);
            System.out.println("INIX: " + initX);

            String cadena = "(" + finalX + "," + finalY + ")";

            //uso de la libreria 
            DirectionChange dcv = new DirectionChange(initX, initY, finalX, finalY);
            SearchStateSpaces sss = new SearchStateSpaces(cadena, dcv, 4);
            ArrayList<String> lst = sss.solve();

            var datos = datosTabla(lst);
            String[][] x = dcv.getWorld();
            actualizarMundo(datos, x);
            actualizarTabla(x, initX, initY, finalX, finalY);

            //mostrar en pantalla el resultado 
            if (lst.size() > 0) {
                StringBuilder infoText = new StringBuilder();
                infoText.append("<html>Numero de pasos: ").append(lst.size()).append("<br>");

                for (int i = 0; i < lst.size(); i++) {
                    System.out.println(lst.get(i));
                    infoText.append(lst.get(i)).append("<br>");
                }
                infoText.append("</html>");
                datos_label1.setText(infoText.toString());
            } else {
                datos_label1.setText(""); // Si no hay elementos, borra el contenido del JLabel
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos en los campos.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void FINALXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FINALXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FINALXActionPerformed

    public void mostrarTabla() {
        DirectionChange dcv = new DirectionChange();
        String[][] world = dcv.getWorld();

        int numRows = world.length;
        int numCols = world[0].length;

        StringBuilder labelText = new StringBuilder("<html><style>table {border: solid;} td {padding: 1px; border: solid; width: 20px; height: 20px}</style><table>");

        // Agregar encabezados de columna
        labelText.append("<tr>");
        labelText.append("<th></th>");
        for (int col = 0; col < numCols; col++) {
            labelText.append("<th>").append(col).append("</th>");
        }
        labelText.append("</tr>");

        // Agregar filas de datos con números consecutivos en el encabezado de fila
        for (int row = 0; row < numRows; row++) {
            labelText.append("<tr>");
            labelText.append("<th>").append(row).append("</th>");
            for (int col = 0; col < numCols; col++) {
                if (world[row][col] != null) {
                    labelText.append("<td>").append(world[row][col]).append("</td>");
                } else {
                    labelText.append("<td></td>");  // Reemplazar null con una celda vacía
                }
            }
            labelText.append("</tr>");
        }

        labelText.append("</table></html>");

        // Establecer el texto generado en el JLabel
        TABLA.setText(labelText.toString());

    }

    public void actualizarTabla(String[][] world, int ix, int iy, int fx , int fy) {

        int numRows = world.length;
        int numCols = world[0].length;

        StringBuilder labelText = new StringBuilder("<html><style>table {border: solid;} td {padding: 1px; border: solid; width: 20px; height: 20px}</style><table>");

        // Agregar encabezados de columna
        labelText.append("<tr>");
        labelText.append("<th></th>");
        for (int col = 0; col < numCols; col++) {
            labelText.append("<th>").append(col).append("</th>");
        }
        labelText.append("</tr>");

        // Agregar filas de datos con números consecutivos en el encabezado de fila
        for (int row = 0; row < numRows; row++) {
            labelText.append("<tr>");
            labelText.append("<th>").append(row).append("</th>");
            for (int col = 0; col < numCols; col++) {
                if (world[row][col] != null) {
                    if (row == ix && col == iy) {
                        labelText.append("<td style='background-color: blue; font-weight: bold;'>").append(world[row][col]).append("</td>");
                    } else if (row == fx && col == fy) {
                        labelText.append("<td style='background-color: red; font-weight: bold;'>").append(world[row][col]).append("E</td>");
                    } else {
                        labelText.append("<td><strong>").append(world[row][col]).append("</strong></td>");
                    }
                } else {
                    labelText.append("<td></td>");  // Reemplazar null con una celda vacía
                }
            }

            labelText.append("</tr>");
        }

        labelText.append("</table></html>");

        // Establecer el texto generado en el JLabel
        TABLA.setText(labelText.toString());

    }

    public ArrayList<String> datosTabla(ArrayList<String> lst) {

        String regex = "\\((\\d+),(\\d+)\\)"; //Se refiere a (integer,integer)
        Pattern patron = Pattern.compile(regex);

        var camino = new ArrayList<int[]>();
        ArrayList<String> listaCadenas = new ArrayList<>();

        for (String next : lst) {
            String result[] = next.trim().split("::");
            Matcher resultado_reges = patron.matcher(result[1].trim());
            int direccion = Character.getNumericValue(result[0].charAt(1));

            System.out.println(result[1]);
            if (resultado_reges.matches()) {
                int c_x = Integer.parseInt(resultado_reges.group(1)); // x
                int c_y = Integer.parseInt(resultado_reges.group(2)); // x
                int[] d_xy = {direccion, c_x, c_y}; //[0] [1] [2]
                camino.add(d_xy);
            }
        }

        for (Iterator<int[]> iterator = camino.iterator(); iterator.hasNext();) {
            int[] paso = iterator.next();
            String cadena = "D: " + paso[0] + " X: " + paso[1] + " Y: " + paso[2];
            listaCadenas.add(cadena);
        }

        return listaCadenas;

    }

    public void actualizarMundo(ArrayList<String> listaCadenas, String[][] world) {
        for (String cadena : listaCadenas) {
            String[] partes = cadena.split(" ");
            int d = Integer.parseInt(partes[1]);
            int xCoord = Integer.parseInt(partes[3]);
            int yCoord = Integer.parseInt(partes[5]);

            String valor;
            if (d == 1) {
                valor = "U";
            } else if (d == 2) {
                valor = "R";
            } else if (d == 3) {
                valor = "D";
            } else if (d == 4) {
                valor = "L";
            } else {
                valor = "";
            }
            world[xCoord][yCoord] = valor;
        }
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FINALX;
    private javax.swing.JTextField FINALY;
    private javax.swing.JTextField INITY;
    private javax.swing.JTextField INIX;
    private javax.swing.JLabel TABLA;
    private javax.swing.JLabel datos_label;
    private javax.swing.JLabel datos_label1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
