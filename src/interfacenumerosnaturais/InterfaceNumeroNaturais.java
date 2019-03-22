/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacenumerosnaturais;

import javax.swing.JOptionPane;
import numerosnaturais.NumerosNaturais;

/**
 *
 * @author aluno
 */
public class InterfaceNumeroNaturais extends javax.swing.JFrame {

    NumerosNaturais valor1 = new NumerosNaturais();
    NumerosNaturais valor2 = new NumerosNaturais();

    /**
     * Creates new form InterfaceNumeroNaturais
     */
    public InterfaceNumeroNaturais() {
        initComponents();
        jButtonGravar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonCalcularFatorial.setEnabled(false);
        jButtonCapicua.setEnabled(false);
        jButtonMMC.setEnabled(false);
        jButtonMDC.setEnabled(false);
        jButtonNumeroPerfeito.setEnabled(false);
        jButtonNumeroPrimo.setEnabled(false);
        jButtonPrimosEntreSi.setEnabled(false);
        jButtonQuadradoPerfeito.setEnabled(false);
        jTextFieldResultadoNumeroNatural2.setEnabled(false);
        jTextFieldResultadoNumeroNatural1.setEnabled(false);
        jTextFieldValor1.setEnabled(false);
        jTextFieldValor2.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldValor1 = new javax.swing.JTextField();
        jButtonCalcularFatorial = new javax.swing.JButton();
        jButtonNumeroPerfeito = new javax.swing.JButton();
        jButtonCapicua = new javax.swing.JButton();
        jButtonQuadradoPerfeito = new javax.swing.JButton();
        jButtonNumeroPrimo = new javax.swing.JButton();
        jButtonMMC = new javax.swing.JButton();
        jButtonMDC = new javax.swing.JButton();
        jButtonPrimosEntreSi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldValor2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonGravar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextFieldResultadoNumeroNatural1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextFieldResultadoNumeroNatural2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCalcularFatorial.setText("Calcular Fatorial");
        jButtonCalcularFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularFatorialActionPerformed(evt);
            }
        });

        jButtonNumeroPerfeito.setText("Nº Perfeito");
        jButtonNumeroPerfeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumeroPerfeitoActionPerformed(evt);
            }
        });

        jButtonCapicua.setText("Verificar se é Capicua");
        jButtonCapicua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCapicuaActionPerformed(evt);
            }
        });

        jButtonQuadradoPerfeito.setText("Verificar( X²) Perfeito");
        jButtonQuadradoPerfeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuadradoPerfeitoActionPerformed(evt);
            }
        });

        jButtonNumeroPrimo.setText("Numero Primo");
        jButtonNumeroPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumeroPrimoActionPerformed(evt);
            }
        });

        jButtonMMC.setText("Calcular MMC");
        jButtonMMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMMCActionPerformed(evt);
            }
        });

        jButtonMDC.setText("Calcular MDC");
        jButtonMDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMDCActionPerformed(evt);
            }
        });

        jButtonPrimosEntreSi.setText("Primos entre si");
        jButtonPrimosEntreSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimosEntreSiActionPerformed(evt);
            }
        });

        jLabel1.setText("1º Numero Natural:");

        jLabel2.setText("2º Numero Natural:");

        jLabel3.setText("Projeto NumerosNaturais");

        jButtonGravar.setText("Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jLabel4.setText("1º Numero Natural:");

        jLabel5.setText("2º Numero Natural:");

        jLabel6.setText("RESULTADO");

        jTextFieldResultadoNumeroNatural1.setColumns(20);
        jTextFieldResultadoNumeroNatural1.setRows(5);
        jScrollPane1.setViewportView(jTextFieldResultadoNumeroNatural1);

        jTextFieldResultadoNumeroNatural2.setColumns(20);
        jTextFieldResultadoNumeroNatural2.setRows(5);
        jScrollPane2.setViewportView(jTextFieldResultadoNumeroNatural2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCalcularFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNumeroPerfeito)
                            .addComponent(jButtonCapicua)
                            .addComponent(jButtonQuadradoPerfeito))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMMC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonMDC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonNumeroPrimo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonPrimosEntreSi, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGravar)))
                .addGap(62, 62, 62))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCalcularFatorial, jButtonCapicua, jButtonMDC, jButtonMMC, jButtonNumeroPerfeito, jButtonNumeroPrimo, jButtonPrimosEntreSi, jButtonQuadradoPerfeito});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonEditar, jButtonGravar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButtonGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCalcularFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNumeroPrimo))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNumeroPerfeito)
                            .addComponent(jButtonMDC))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCapicua)
                            .addComponent(jButtonMMC))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonQuadradoPerfeito)
                            .addComponent(jButtonPrimosEntreSi)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonCalcularFatorial, jButtonCapicua, jButtonMDC, jButtonMMC, jButtonNumeroPerfeito, jButtonNumeroPrimo, jButtonPrimosEntreSi, jButtonQuadradoPerfeito});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularFatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularFatorialActionPerformed
        try {
            int numero1 = Integer.parseInt(jTextFieldValor1.getText());
            int numero2 = Integer.parseInt(jTextFieldValor2.getText());

            valor1.setNumeroNatural(numero1);
            valor2.setNumeroNatural(numero2);

            jTextFieldResultadoNumeroNatural1.setText(Long.toString(valor1.calcularFatorial()));
            jTextFieldResultadoNumeroNatural2.setText(Long.toString(valor2.calcularFatorial()));
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
    }//GEN-LAST:event_jButtonCalcularFatorialActionPerformed

    private void jButtonNumeroPerfeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumeroPerfeitoActionPerformed

        int numero1 = Integer.parseInt(jTextFieldValor1.getText());
        int numero2 = Integer.parseInt(jTextFieldValor2.getText());

        valor1.setNumeroNatural(numero1);
        valor2.setNumeroNatural(numero2);

        jTextFieldResultadoNumeroNatural1.setText(Boolean.toString(valor1.verificarNumeroPerfeito()));
        jTextFieldResultadoNumeroNatural2.setText(Boolean.toString(valor2.verificarNumeroPerfeito()));

    }//GEN-LAST:event_jButtonNumeroPerfeitoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

        jButtonGravar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonCalcularFatorial.setEnabled(false);
        jButtonCapicua.setEnabled(false);
        jButtonMMC.setEnabled(false);
        jButtonMDC.setEnabled(false);
        jButtonNumeroPerfeito.setEnabled(false);
        jButtonNumeroPrimo.setEnabled(false);
        jButtonPrimosEntreSi.setEnabled(false);
        jButtonQuadradoPerfeito.setEnabled(false);
        jTextFieldResultadoNumeroNatural2.setEnabled(false);
        jTextFieldResultadoNumeroNatural1.setEnabled(false);
        jTextFieldValor1.setEnabled(true);
        jTextFieldValor2.setEnabled(true);

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCapicuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCapicuaActionPerformed

        int numero1 = Integer.parseInt(jTextFieldValor1.getText());
        int numero2 = Integer.parseInt(jTextFieldValor2.getText());

        valor1.setNumeroNatural(numero1);
        valor2.setNumeroNatural(numero2);

        jTextFieldResultadoNumeroNatural1.setText(Boolean.toString(valor1.verificarSeCapicua()));
        jTextFieldResultadoNumeroNatural2.setText(Boolean.toString(valor2.verificarSeCapicua()));

    }//GEN-LAST:event_jButtonCapicuaActionPerformed

    private void jButtonQuadradoPerfeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuadradoPerfeitoActionPerformed

        int numero1 = Integer.parseInt(jTextFieldValor1.getText());
        int numero2 = Integer.parseInt(jTextFieldValor2.getText());

        valor1.setNumeroNatural(numero1);
        valor2.setNumeroNatural(numero2);

        jTextFieldResultadoNumeroNatural1.setText(Boolean.toString(valor1.verificarQuadradoPerfeito(numero1)));
        jTextFieldResultadoNumeroNatural2.setText(Boolean.toString(valor2.verificarQuadradoPerfeito(numero2)));

    }//GEN-LAST:event_jButtonQuadradoPerfeitoActionPerformed

    private void jButtonNumeroPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumeroPrimoActionPerformed

        int numero1 = Integer.parseInt(jTextFieldValor1.getText());
        int numero2 = Integer.parseInt(jTextFieldValor2.getText());

        valor1.setNumeroNatural(numero1);
        valor2.setNumeroNatural(numero2);

        jTextFieldResultadoNumeroNatural1.setText(Boolean.toString(valor1.verificarNumeroPrimo()));
        jTextFieldResultadoNumeroNatural2.setText(Boolean.toString(valor2.verificarNumeroPrimo()));

    }//GEN-LAST:event_jButtonNumeroPrimoActionPerformed

    private void jButtonMDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMDCActionPerformed
        try {

            int numero1 = Integer.parseInt(jTextFieldValor1.getText());
            int numero2 = Integer.parseInt(jTextFieldValor2.getText());

            valor1.setNumeroNatural(numero1);

            String saida = "MDC (" + numero1 + " , " + numero2 + ")\n";
            saida += valor1.calcularMDC(numero2);

            jTextFieldResultadoNumeroNatural1.setText(saida);
            jTextFieldResultadoNumeroNatural2.setText("");

        } catch (Exception error) {
            jTextFieldResultadoNumeroNatural1.setText(error.getMessage());
        }
    }//GEN-LAST:event_jButtonMDCActionPerformed

    private void jButtonMMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMMCActionPerformed
        try {

            int numero1 = Integer.parseInt(jTextFieldValor1.getText());
            int numero2 = Integer.parseInt(jTextFieldValor2.getText());

            valor1.setNumeroNatural(numero1);

            String saida = "MMC (" + numero1 + " , " + numero2 + ")\n";
            saida += valor1.calcularMMC(numero2);

            jTextFieldResultadoNumeroNatural1.setText(saida);
            jTextFieldResultadoNumeroNatural2.setText("");

        } catch (Exception error) {
            jTextFieldResultadoNumeroNatural1.setText(error.getMessage());
            jTextFieldResultadoNumeroNatural2.setText("");
        }
    }//GEN-LAST:event_jButtonMMCActionPerformed

    private void jButtonPrimosEntreSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimosEntreSiActionPerformed
        try {
            int numero1 = Integer.parseInt(jTextFieldValor1.getText());
            int numero2 = Integer.parseInt(jTextFieldValor2.getText());

            valor1.setNumeroNatural(numero1);

            if (valor1.calcularMDC(numero2) == 1) {
                String saida = "(" + numero1 + " , " + numero2 + ") \n";
                saida += "São primos entre si";
                jTextFieldResultadoNumeroNatural1.setText(saida);
                jTextFieldResultadoNumeroNatural2.setText("");
            } else {
                String saida = "(" + numero1 + " , " + numero2 + ")" + "\n";
                saida += "Não são primos entre si";
                jTextFieldResultadoNumeroNatural1.setText(saida);
                jTextFieldResultadoNumeroNatural2.setText("");
            }
        } catch (Exception error) {
            jTextFieldResultadoNumeroNatural1.setText("Não são primos entre si, pois um valor é zero");
        }
    }//GEN-LAST:event_jButtonPrimosEntreSiActionPerformed
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        try {
            if ("".equals(jTextFieldValor1.getText()) || "".equals(jTextFieldValor2.getText())) {
                throw new Exception("Coloque um valor nas caixas de texto.");
            }
            int numero1 = Integer.parseInt(jTextFieldValor1.getText());
            int numero2 = Integer.parseInt(jTextFieldValor2.getText());

            valor1.setNumeroNatural(numero1);
            valor2.setNumeroNatural(numero2);

            valor1.verificarNumeroNatural();
            valor2.verificarNumeroNatural();

            jButtonGravar.setEnabled(false);
            jButtonEditar.setEnabled(true);
            jButtonCalcularFatorial.setEnabled(true);
            jButtonCapicua.setEnabled(true);
            jButtonMMC.setEnabled(true);
            jButtonMDC.setEnabled(true);
            jButtonNumeroPerfeito.setEnabled(true);
            jButtonNumeroPrimo.setEnabled(true);
            jButtonPrimosEntreSi.setEnabled(true);
            jButtonQuadradoPerfeito.setEnabled(true);
            jTextFieldResultadoNumeroNatural2.setEditable(true);
            jTextFieldResultadoNumeroNatural1.setEditable(true);
            jTextFieldValor1.setEnabled(false);
            jTextFieldValor2.setEnabled(false);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
    }//GEN-LAST:event_jButtonGravarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceNumeroNaturais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceNumeroNaturais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceNumeroNaturais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceNumeroNaturais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceNumeroNaturais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcularFatorial;
    private javax.swing.JButton jButtonCapicua;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonMDC;
    private javax.swing.JButton jButtonMMC;
    private javax.swing.JButton jButtonNumeroPerfeito;
    private javax.swing.JButton jButtonNumeroPrimo;
    private javax.swing.JButton jButtonPrimosEntreSi;
    private javax.swing.JButton jButtonQuadradoPerfeito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextFieldResultadoNumeroNatural1;
    private javax.swing.JTextArea jTextFieldResultadoNumeroNatural2;
    private javax.swing.JTextField jTextFieldValor1;
    private javax.swing.JTextField jTextFieldValor2;
    // End of variables declaration//GEN-END:variables
}