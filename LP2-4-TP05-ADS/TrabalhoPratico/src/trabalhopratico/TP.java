/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalhopratico;

import javax.swing.JLabel;

/**
 *
 * @author Gabriel Faustino Marcelino dos Santos
 */
public class TP extends javax.swing.JFrame {

    /**
     * Creates new form TP
     */
    public TP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelMaximo = new javax.swing.JLabel();
        LabelPrioridade1 = new javax.swing.JLabel();
        LabelPrioridade2 = new javax.swing.JLabel();
        jTextFieldmax = new javax.swing.JTextField();
        jTextFieldPri1 = new javax.swing.JTextField();
        jTextFieldPri2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelFinal = new javax.swing.JLabel();
        jLabelFinal2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTh1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListTh2 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelMaximo.setText("Máximo: ");

        LabelPrioridade1.setText("Prioridade 1:");

        LabelPrioridade2.setText("Prioridade 2:");

        jTextFieldmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldmaxActionPerformed(evt);
            }
        });

        jTextFieldPri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPri1ActionPerformed(evt);
            }
        });

        jTextFieldPri2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPri2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelFinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelFinal.setText("Final");

        jLabelFinal2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelFinal2.setText("Final");

        jListTh1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListTh1);

        jListTh2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListTh2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelPrioridade2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPri2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelPrioridade1)
                                    .addComponent(LabelMaximo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPri1)
                                    .addComponent(jTextFieldmax)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabelFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelFinal2)
                .addGap(237, 237, 237))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelMaximo)
                    .addComponent(jTextFieldmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPrioridade1)
                    .addComponent(jTextFieldPri1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPrioridade2)
                    .addComponent(jTextFieldPri2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFinal)
                    .addComponent(jLabelFinal2))
                .addGap(174, 174, 174))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldmaxActionPerformed


    }//GEN-LAST:event_jTextFieldmaxActionPerformed


    private void jTextFieldPri1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPri1ActionPerformed

    }//GEN-LAST:event_jTextFieldPri1ActionPerformed


    private void jTextFieldPri2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPri2ActionPerformed

    }//GEN-LAST:event_jTextFieldPri2ActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    //Logica do thread. Precisa colocar max no lugar do 10 e colocar a prioridade 
    private static Runnable thread1 = new Runnable() {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 1: " + i);
            }
        }
    };
    private static Runnable thread2 = new Runnable() {
        public void run() {
            for (int j = 0; j < 10; j++) {
                System.out.println("Thread 2: " + j);
            }
        }
    };

    public static void main(String args[]) {
        new Thread(thread1).start();
        new Thread(thread2).start();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMaximo;
    private javax.swing.JLabel LabelPrioridade1;
    private javax.swing.JLabel LabelPrioridade2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelFinal;
    private javax.swing.JLabel jLabelFinal2;
    private javax.swing.JList<String> jListTh1;
    private javax.swing.JList<String> jListTh2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldPri1;
    private javax.swing.JTextField jTextFieldPri2;
    private javax.swing.JTextField jTextFieldmax;
    // End of variables declaration//GEN-END:variables
}
