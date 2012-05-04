/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.vue;

import java.util.HashMap;
import yggdrasil.Artefact;

/**
 *
 * @author Mathias
 */
public class ChoixArtefact extends javax.swing.JDialog {

    /**
     * Creates new form ChoixArtefact
     */
    private int[] indexDieux;
    private int choix;

    public ChoixArtefact(java.awt.Frame parent, boolean modal, HashMap<Integer, Artefact> liste) {
        super(parent, modal);
        indexDieux = new int[6];
        initComponents();
        ChoixArtefact.liste = liste;
        for (int i = 0; i < liste.size(); i++) {
            if ("Hel".equals(liste.get(i).getEnnemi())) {
                indexDieux[0]=i;
                imageHel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hel" + liste.get(i).getNiveau() + ".png")));
            } else if ("Surt".equals(liste.get(i).getEnnemi().toString())) {
                indexDieux[1]=i;
                imageSurt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Surt" + liste.get(i).getNiveau() + ".png")));
            } else if ("Fenrir".equals(liste.get(i).getEnnemi().toString())) {
                indexDieux[2]=i;
                imageFenrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fenrir" + liste.get(i).getNiveau() + ".png")));
            } else if ("Jormungand".equals(liste.get(i).getEnnemi().toString())) {
                indexDieux[3]=i;
                imageJormungand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Jormungand" + liste.get(i).getNiveau() + ".png")));
            } else if ("Loki".equals(liste.get(i).getEnnemi().toString())) {
                indexDieux[4]=i;
                imageLoki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Loki" + liste.get(i).getNiveau() + ".png")));
            } else if ("Nidhogg".equals(liste.get(i).getEnnemi().toString())) {
                indexDieux[5]=i;
                imageNidhogg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Nidhogg" + liste.get(i).getNiveau() + ".png")));
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        valider = new javax.swing.JButton();
        Annuler = new javax.swing.JButton();
        imageHel = new javax.swing.JLabel();
        imageSurt = new javax.swing.JLabel();
        imageJormungand = new javax.swing.JLabel();
        imageLoki = new javax.swing.JLabel();
        imageNidhogg = new javax.swing.JLabel();
        imageFenrir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Yggdrasil", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Quel artefact voulez vous");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        valider.setBackground(new java.awt.Color(0, 0, 0));
        valider.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        valider.setForeground(new java.awt.Color(0, 255, 255));
        valider.setText("Valider");
        valider.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        valider.setContentAreaFilled(false);
        valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validerMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(196, 55, 41, 0);
        jPanel1.add(valider, gridBagConstraints);

        Annuler.setBackground(new java.awt.Color(0, 0, 0));
        Annuler.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        Annuler.setForeground(new java.awt.Color(0, 255, 255));
        Annuler.setText("Annuler");
        Annuler.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        Annuler.setContentAreaFilled(false);
        Annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AnnulerMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(196, 17, 41, 56);
        jPanel1.add(Annuler, gridBagConstraints);

        imageHel.setBackground(new java.awt.Color(255, 153, 153));
        imageHel.setMaximumSize(new java.awt.Dimension(80, 125));
        imageHel.setMinimumSize(new java.awt.Dimension(80, 125));
        imageHel.setPreferredSize(new java.awt.Dimension(80, 125));
        imageHel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageHelMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(imageHel, gridBagConstraints);

        imageSurt.setBackground(new java.awt.Color(255, 51, 102));
        imageSurt.setMaximumSize(new java.awt.Dimension(80, 125));
        imageSurt.setMinimumSize(new java.awt.Dimension(80, 125));
        imageSurt.setPreferredSize(new java.awt.Dimension(80, 125));
        imageSurt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageSurtMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel1.add(imageSurt, gridBagConstraints);

        imageJormungand.setBackground(new java.awt.Color(0, 204, 51));
        imageJormungand.setMaximumSize(new java.awt.Dimension(80, 125));
        imageJormungand.setMinimumSize(new java.awt.Dimension(80, 125));
        imageJormungand.setPreferredSize(new java.awt.Dimension(80, 125));
        imageJormungand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageJormungandMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        jPanel1.add(imageJormungand, gridBagConstraints);

        imageLoki.setBackground(new java.awt.Color(255, 51, 0));
        imageLoki.setMaximumSize(new java.awt.Dimension(80, 125));
        imageLoki.setMinimumSize(new java.awt.Dimension(80, 125));
        imageLoki.setPreferredSize(new java.awt.Dimension(80, 125));
        imageLoki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageLokiMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel1.add(imageLoki, gridBagConstraints);

        imageNidhogg.setBackground(new java.awt.Color(0, 153, 153));
        imageNidhogg.setMaximumSize(new java.awt.Dimension(80, 125));
        imageNidhogg.setMinimumSize(new java.awt.Dimension(80, 125));
        imageNidhogg.setPreferredSize(new java.awt.Dimension(80, 125));
        imageNidhogg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageNidhoggMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        jPanel1.add(imageNidhogg, gridBagConstraints);

        imageFenrir.setBackground(new java.awt.Color(204, 204, 255));
        imageFenrir.setMaximumSize(new java.awt.Dimension(80, 125));
        imageFenrir.setMinimumSize(new java.awt.Dimension(80, 125));
        imageFenrir.setPreferredSize(new java.awt.Dimension(80, 125));
        imageFenrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageFenrirMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        jPanel1.add(imageFenrir, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int getChoix()
    {
        return choix;
    }
    private void validerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validerMouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_validerMouseClicked

    private void AnnulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnnulerMouseClicked
        // TODO add your handling code here:
        choix=-1;
        this.dispose();
    }//GEN-LAST:event_AnnulerMouseClicked

    private void imageHelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageHelMouseClicked
        // TODO add your handling code here:
        choix=indexDieux[0];
    }//GEN-LAST:event_imageHelMouseClicked

    private void imageSurtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageSurtMouseClicked
        // TODO add your handling code here:
         choix=indexDieux[1];
    }//GEN-LAST:event_imageSurtMouseClicked

    private void imageFenrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageFenrirMouseClicked
        // TODO add your handling code here:
        choix=indexDieux[2];
    }//GEN-LAST:event_imageFenrirMouseClicked

    private void imageJormungandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageJormungandMouseClicked
        // TODO add your handling code here:
        choix=indexDieux[3];
    }//GEN-LAST:event_imageJormungandMouseClicked

    private void imageLokiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLokiMouseClicked
        // TODO add your handling code here:
        choix=indexDieux[4];
    }//GEN-LAST:event_imageLokiMouseClicked

    private void imageNidhoggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageNidhoggMouseClicked
        // TODO add your handling code here:
        choix=indexDieux[5];
    }//GEN-LAST:event_imageNidhoggMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChoixArtefact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoixArtefact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoixArtefact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoixArtefact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                ChoixArtefact dialog = new ChoixArtefact(new javax.swing.JFrame(), true, liste);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    private static HashMap<Integer, Artefact> liste;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JLabel imageFenrir;
    private javax.swing.JLabel imageHel;
    private javax.swing.JLabel imageJormungand;
    private javax.swing.JLabel imageLoki;
    private javax.swing.JLabel imageNidhogg;
    private javax.swing.JLabel imageSurt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables
}
