/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yggdrasil.vue;

import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JLabel;
import yggdrasil.Artefact;
import yggdrasil.Ennemis.Ennemis;
import yggdrasil.Monde.Ile;
import yggdrasil.Partie;

/**
 *
 * @author Mathias
 */
public class EcranPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form EcranPrincipal
     */
    private JFrame page;
    private Partie partie;
    private JLabel[] tabGeant;

    public EcranPrincipal(JFrame page, Partie partie) {
        this.page = page;
        this.partie = partie;
        this.tabGeant = new JLabel[16];

        initComponents();


        switch (partie.getTb().getVanePostion()) {
            case 0:
                vanpo0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/vane.png")));
                break;
            case 1:
                vanpo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/vane.png")));
                break;
            case 2:
                vanpo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/vane.png")));
                break;
            case 3:
                vanpo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/vane.png")));
                break;
            case 4:
                vanpo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/vane.png")));
                break;
            case 5:
                vanpo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/vane.png")));
                break;
        }
        Ennemis[] tabEn = partie.getTabEnnemis();
        int longu = tabEn.length;

        switch (tabEn[0].getPosition()) {
            case 0:
                hel0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/hel.png")));
                break;
            case 1:
                hel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/hel.png")));
                break;
            case 2:
                hel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/hel.png")));
                break;
            case 3:
                hel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/hel.png")));
                break;
            case 4:
                hel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/hel.png")));
                break;
            case 5:
                hel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/hel.png")));
                break;
            case 6:
                hel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/hel.png")));
                break;
            case 7:
                hel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/hel.png")));
                break;

        }

        switch (tabEn[1].getPosition()) {
            case 0:
                surt0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;
            case 1:
                surt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;
            case 2:
                surt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;
            case 3:
                surt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;
            case 4:
                surt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;
            case 5:
                surt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;
            case 6:
                surt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;
            case 7:
                surt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;

        }
        switch (tabEn[2].getPosition()) {
            case 0:
                jorgumand0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/jormungand.png")));
                break;
            case 1:
                jorgumand1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/jormungand.png")));
                break;
            case 2:
                jorgumand2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/jormungand.png")));
                break;
            case 3:
                jorgumand3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/jormungand.png")));
                break;
            case 4:
                jorgumand4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/jormungand.png")));
                break;
            case 5:
                jorgumand5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/jormungand.png")));
                break;
            case 6:
                jorgumand6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/jormungand.png")));
                break;
            case 7:
                jorgumand7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/jormungand.png")));
                break;

        }
        switch (tabEn[3].getPosition()) {
            case 0:
                loki0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/loki.png")));
                break;
            case 1:
                loki1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/loki.png")));
                break;
            case 2:
                loki2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/loki.png")));
                break;
            case 3:
                loki3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/loki.png")));
                break;
            case 4:
                loki4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/loki.png")));
                break;
            case 5:
                loki5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/loki.png")));
                break;
            case 6:
                loki6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/loki.png")));
                break;
            case 7:
                loki7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/loki.png")));
                break;

        }
        switch (tabEn[4].getPosition()) {
            case 0:
                Nidhogg0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/nidhogg.png")));
                break;
            case 1:
                Nidhogg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/nidhogg.png")));
                break;
            case 2:
                Nidhogg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/nidhogg.png")));
                break;
            case 3:
                Nidhogg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/nidhogg.png")));
                break;
            case 4:
                Nidhogg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/nidhogg.png")));
                break;
            case 5:
                Nidhogg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/nidhogg.png")));
                break;
            case 6:
                Nidhogg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/nidhogg.png")));
                break;
            case 7:
                Nidhogg7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/nidhogg.png")));
                break;

        }
        switch (tabEn[5].getPosition()) {
            case 0:
                Fenrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/fenrir.png")));
                break;
            case 1:
                Fenrir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/fenrir.png")));
                break;
            case 2:
                Fenrir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/fenrir.png")));
                break;
            case 3:
                Fenrir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/fenrir.png")));
                break;
            case 4:
                Fenrir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/fenrir.png")));
                break;
            case 5:
                Fenrir5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/fenrir.png")));
                break;
            case 6:
                Fenrir6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/fenrir.png")));
                break;
            case 7:
                Fenrir7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/fenrir.png")));
                break;

        }
        switch (tabEn[1].getPosition()) {
            case 0:
                surt0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;
            case 1:
                surt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;
            case 2:
                surt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;
            case 3:
                surt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;
            case 4:
                surt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;
            case 5:
                surt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;
            case 6:
                surt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;
            case 7:
                surt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/surt.png")));
                break;

        }
        int nbArt = partie.getDieuActuel().getlArtefact().size();
        Iterator it = partie.getDieuActuel().getlArtefact().values().iterator();
        while (it.hasNext()) {
            JLabel jl = new JLabel();
            Artefact a = (Artefact) it.next();
            jl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/" + a.getEnnemi() + a.getNiveau() + ".png")));// NOI18N
            panelArtefact.add(jl);
        }
        switch (partie.getMg().getValkyrie().getPosition()) {
            case 0:
                ileArcEnCiel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/valkyrie.png")));
                break;
            case 1:
                ileBlanche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/valkyrie.png")));
                break;
            case 2:
                ileBleue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/valkyrie.png")));
                break;
            case 3:
                ileVerte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/valkyrie.png")));
                break;
            case 4:
                ileNoire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/valkyrie.png")));
                break;

        }
        Ile[] tabIle = partie.getMg().getTabIle();

        if (tabIle[1].isSubmergee()) {
            ileBlancheSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/ileSub.png")));
        } else if (tabIle[2].isSubmergee()) {
            ileBleueSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/ileSub.png")));
        } else if (tabIle[3].isSubmergee()) {
            ileVerteSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/ileSub.png")));
        } else if (tabIle[4].isSubmergee()) {
            ileNoireSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/ileSub.png")));
        }
        tabGeant[0] = jLabel28;
        tabGeant[1] = jLabel29;
        tabGeant[2] = jLabel30;
        tabGeant[3] = jLabel31;
        tabGeant[4] = jLabel32;
        tabGeant[5] = jLabel33;
        tabGeant[6] = jLabel34;
        tabGeant[7] = jLabel35;
        tabGeant[8] = jLabel36;
        tabGeant[9] = jLabel37;
        tabGeant[10] = jLabel38;
        tabGeant[11] = jLabel39;
        tabGeant[12] = jLabel40;
        tabGeant[13] = jLabel41;
        tabGeant[14] = jLabel42;
        tabGeant[15] = jLabel43;
        int tailleGeanDef = partie.getFdg().getGeantDeffausse().size();
        for (int i = 0; i < tailleGeanDef; i++) {
            tabGeant[i].setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getFdg().getGeantDeffausse().get(i).getCheminImage())));
            if (!partie.getFdg().getGeantDeffausse().get(i).isActif()) {
                tabGeant[i].setText("Battu!");
            }
            tabGeant[i].setHorizontalTextPosition(JLabel.CENTER);
            tabGeant[i].setVerticalTextPosition(JLabel.CENTER);

        }


    }

    private void verifFinTour() {
        if (partie.getDieuActuel().getPartieRestanteAjouer() == 0) {
            int j = partie.getlDieu().indexOf(partie.getDieuActuel());
            partie.getDieuActuel().reset();
            if ((j + 1) == partie.getlDieu().size()) {
                partie.setDieuActuel(partie.getlDieu().get(0));
            } else {
                partie.setDieuActuel(partie.getlDieu().get(j + 1));

            }
            page.getContentPane().removeAll();
            page.getContentPane().add(new EcranPrincipal(page, partie));
            page.revalidate();
            String e = partie.getPileCarteEnnemis().get(0);
            DieuTire dt = new DieuTire(page, true, e);
            dt.setLocationRelativeTo(page);
            dt.setVisible(true);
            partie.getPileCarteEnnemis().remove(0);
            partie.appliquerEnnemi(page, e);
        }
        page.getContentPane().removeAll();
        page.getContentPane().add(new EcranPrincipal(page, partie));
        page.revalidate();
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
        text1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelArtefact = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        boutonDeumeureDesElfes = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labelNombreElfes = new javax.swing.JLabel();
        imageElfe = new javax.swing.JLabel();
        boutonTerreBenite = new javax.swing.JButton();
        boutonMidgard = new javax.swing.JButton();
        boutonForgeDesNains = new javax.swing.JButton();
        boutonDomaineDesMort = new javax.swing.JButton();
        boutonRoyaumeDuFeu = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        boutonMondeDesTenebres = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        labelnombreGeantDeFeuRestant = new javax.swing.JLabel();
        boutonForteresseDeGlace = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vanpo0 = new javax.swing.JLabel();
        vanpo1 = new javax.swing.JLabel();
        vanpo2 = new javax.swing.JLabel();
        vanpo3 = new javax.swing.JLabel();
        vanpo4 = new javax.swing.JLabel();
        vanpo5 = new javax.swing.JLabel();
        boutonAsgard = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        Fenrir1 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jorgumand1 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        Nidhogg3 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        loki3 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        Fenrir3 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        surt5 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        Nidhogg6 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jorgumand6 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        surt7 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        Nidhogg7 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        loki7 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        hel7 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        Fenrir7 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jorgumand7 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        Fenrir6 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        loki6 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        hel6 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        surt6 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        hel5 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        Nidhogg5 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        Fenrir5 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jorgumand5 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        loki5 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        surt4 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        Fenrir4 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        loki4 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        Nidhogg4 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jorgumand4 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        hel4 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        surt3 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        hel3 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jorgumand3 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        Nidhogg2 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        loki2 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        Fenrir2 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        hel2 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        surt2 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jorgumand2 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        surt1 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        Nidhogg1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        loki1 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        hel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        surt0 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jorgumand0 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        loki0 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Nidhogg0 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        Fenrir = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        hel0 = new javax.swing.JLabel();
        ileArcEnCiel = new javax.swing.JLabel();
        ileBlanche = new javax.swing.JLabel();
        ileBleue = new javax.swing.JLabel();
        ileVerte = new javax.swing.JLabel();
        ileNoire = new javax.swing.JLabel();
        ileNoireSub = new javax.swing.JLabel();
        ileVerteSub = new javax.swing.JLabel();
        ileBlancheSub = new javax.swing.JLabel();
        ileBleueSub = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setAutoscrolls(true);
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        text1.setFont(new java.awt.Font("Yggdrasil", 0, 24)); // NOI18N
        text1.setForeground(new java.awt.Color(0, 255, 255));
        text1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        text1.setText("En votre possession : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        jPanel1.add(text1, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Yggdrasil", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/elfe.png"))); // NOI18N
        jLabel8.setText(" : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Yggdrasil", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/viking50.png"))); // NOI18N
        jLabel11.setText(" : ");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel11, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Yggdrasil", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText(Integer.toString(partie.getDieuActuel().getlElfes().size()));
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 24));
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 24));
        jLabel2.setVerifyInputWhenFocusTarget(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Yggdrasil", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText(Integer.toString(partie.getDieuActuel().getlVikings().size()));
        jLabel7.setMinimumSize(new java.awt.Dimension(50, 24));
        jLabel7.setPreferredSize(new java.awt.Dimension(50, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getDieuActuel().getCheminImage())));
        jLabel9.setMinimumSize(new java.awt.Dimension(150, 150));
        jLabel9.setPreferredSize(new java.awt.Dimension(150, 150));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setFont(new java.awt.Font("Yggdrasil", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Il vous reste "+partie.getDieuActuel().getPartieRestanteAjouer()+" parties a jouer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        jPanel1.add(jLabel10, gridBagConstraints);

        panelArtefact.setAutoscrolls(true);
        panelArtefact.setLayout(new javax.swing.BoxLayout(panelArtefact, javax.swing.BoxLayout.LINE_AXIS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 8;
        jPanel1.add(panelArtefact, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel7.setBackground(new java.awt.Color(255, 102, 204));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel57.setBackground(new java.awt.Color(255, 51, 51));
        jPanel57.setOpaque(false);
        jPanel57.setLayout(new java.awt.GridLayout(4, 4));

        jLabel28.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel28.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel28.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel28);

        jLabel29.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel29.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel29.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel29);

        jLabel30.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel30.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel30.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel30);

        jLabel31.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel31.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel31.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel31);

        jLabel32.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel32.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel32.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel32);

        jLabel33.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel33.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel33.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel33);

        jLabel34.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel34.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel34.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel34);

        jLabel35.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel35.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel35.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel35);

        jLabel36.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel36.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel36.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel36);

        jLabel37.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel37.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel37.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel37);

        jLabel38.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel38.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel38.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel38);

        jLabel39.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel39.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel39.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel39);

        jLabel40.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel40.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel40.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel40);

        jLabel41.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel41.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel41.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel41);

        jLabel42.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel42.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel42.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel42);

        jLabel43.setFont(new java.awt.Font("Yggdrasil", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setMaximumSize(new java.awt.Dimension(80, 125));
        jLabel43.setMinimumSize(new java.awt.Dimension(80, 125));
        jLabel43.setPreferredSize(new java.awt.Dimension(80, 125));
        jPanel57.add(jLabel43);

        jPanel7.add(jPanel57, java.awt.BorderLayout.CENTER);

        add(jPanel7, java.awt.BorderLayout.EAST);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yggdrasil", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(Integer.toString(partie.getRdf().getlGeantDeFeu().size()));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 30, 30));

        boutonDeumeureDesElfes.setToolTipText("<html>\n<h3>Jouer en demeure des Elfes</h3>\nPrendre un Elfe présent dans la Demeure des Elfes.<br/>\nCette action est impossible s’il n’y plus d’Elfe dans la Demeure des Elfes.\n</html>");
        boutonDeumeureDesElfes.setActionCommand("boutonDemeureDesElfes");
        boutonDeumeureDesElfes.setBorderPainted(false);
        boutonDeumeureDesElfes.setContentAreaFilled(false);
        boutonDeumeureDesElfes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonDeumeureDesElfes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonDeumeureDesElfesMouseClicked(evt);
            }
        });
        jPanel3.add(boutonDeumeureDesElfes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 90));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombreElfes.setFont(new java.awt.Font("Yggdrasil", 1, 24)); // NOI18N
        labelNombreElfes.setForeground(new java.awt.Color(0, 255, 255));
        labelNombreElfes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombreElfes.setText(Integer.toString(partie.getDde().getlElfes().size()));
        jPanel4.add(labelNombreElfes, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 14, 40, 30));

        imageElfe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/elfe.png"))); // NOI18N
        imageElfe.setText("jLabel3");
        imageElfe.setToolTipText("");
        jPanel4.add(imageElfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 50, 50));

        boutonTerreBenite.setToolTipText("<html>\n<h3>Jouer en Terre bénite</h3>\nAvancer le Vane d’une case vers la droite sur l’échelle de renfort<br/>\nou</br>\nAppliquer l’effet indiqué sous la case où se trouve le Vane ou sous une des</br>\ncases à sa gauche puis le remettre sur la première case de l’échelle de renfort.\n</html>");
        boutonTerreBenite.setActionCommand("boutonTerreBenite");
        boutonTerreBenite.setBorderPainted(false);
        boutonTerreBenite.setContentAreaFilled(false);
        boutonTerreBenite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonTerreBenite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonTerreBeniteMouseClicked(evt);
            }
        });
        jPanel3.add(boutonTerreBenite, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 3, 200, 110));

        boutonMidgard.setToolTipText("<html>\n<h3>Midgard</h3>\n<h4>1. Déplacer éventuellement les Valkyries</h4>\nVous pouvez déplacer les Valkyries d’une île vers une île immédiatement<br/>\nvoisine. Cela est possible même si l’île d’arrivée ou de départ est submergée.<br/>\n<h4>2. Puis chercher les âmes vikings sur l’île où se trouvent les Valkyries.</h4>\nVous pouvez chercher les âmes sur l’île où se trouvent les Valkyries, à condition<br/>\nque cette île ne soit pas submergée. L’île de l’Arc-en-ciel est l’île de départ des<br/>\nValkyries, aucune recherche ne peut y être réalisée.<br/>\nChercher les âmes revient à piocher 3 pions dans le sac de l’île sur laquelle<br/>\nse trouvent les Valkyries. S’il y a moins de 3 pions présents dans ce sac, alors<br/>\npiocher tous les pions restants.<br/>\nLes Vikings éventuellement piochés sont conservés par le Dieu actif et les<br/>\nGéants de Feu sont remis dans le sac.</html>");
        boutonMidgard.setActionCommand("boutonMidgard");
        boutonMidgard.setBorderPainted(false);
        boutonMidgard.setContentAreaFilled(false);
        boutonMidgard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonMidgard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonMidgardMouseClicked(evt);
            }
        });
        jPanel3.add(boutonMidgard, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 270, 110));

        boutonForgeDesNains.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/carteArte.png"))); // NOI18N
        boutonForgeDesNains.setToolTipText("<html>\n<h3>Forge des nains</h3>\nRécupérer un Artefact de niveau 1 au choix dans la Forge des Nains.<br/>\nou<br/>\nRemettre un Artefact de niveau 1 ou 2 dans la Forge des Nains afin de récupérer<br/>\nun Artefact de niveau directement supérieur, à condition que ces 2 Artefacts<br/>\naffectent le même Ennemi.<br/>\nIl faut noter que l’effet des Artefacts s’applique dès qu’ils ont été récupérés.<br/>\nUn Dieu peut posséder plusieurs Artefacts différents. Deux Dieux peuvent<br/>\nposséder le même Artefact mais à des niveaux différents.<br/></html>");
        boutonForgeDesNains.setActionCommand("boutonForgeDesNains");
        boutonForgeDesNains.setBorderPainted(false);
        boutonForgeDesNains.setContentAreaFilled(false);
        boutonForgeDesNains.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonForgeDesNains.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonForgeDesNainsMouseClicked(evt);
            }
        });
        jPanel3.add(boutonForgeDesNains, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 60, 90));

        boutonDomaineDesMort.setToolTipText("<html>\n<h3>Domaines des morts</h3>\nAjouter dans le sac Île de votre choix 5 Vikings pris sur le Domaine des</br>\nMorts. S’il reste moins de 5 Vikings sur le Domaine des Morts, ajouter ceux</br>\nqui sont disponibles.\n</html>");
        boutonDomaineDesMort.setActionCommand("boutonDomaineDesMorts");
        boutonDomaineDesMort.setBorderPainted(false);
        boutonDomaineDesMort.setContentAreaFilled(false);
        boutonDomaineDesMort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonDomaineDesMort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonDomaineDesMortMouseClicked(evt);
            }
        });
        jPanel3.add(boutonDomaineDesMort, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 100, 120));

        boutonRoyaumeDuFeu.setToolTipText("<html>\n<h3>Royaume du feu</h3>\nPiocher 5 pions dans le sac Île de votre choix. Placer les Géants de Feu piochés<br/>\nsur le Royaume du Feu. Remettre les Vikings piochés dans le sac.<br/>\n</html>");
        boutonRoyaumeDuFeu.setActionCommand("boutonRoyaumeDeFeu");
        boutonRoyaumeDuFeu.setBorderPainted(false);
        boutonRoyaumeDuFeu.setContentAreaFilled(false);
        boutonRoyaumeDuFeu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonRoyaumeDuFeu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonRoyaumeDuFeuMouseClicked(evt);
            }
        });
        jPanel3.add(boutonRoyaumeDuFeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 90, 110));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/GeantDeFeu.png"))); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 50, 50));

        boutonMondeDesTenebres.setToolTipText("<html>\n<h3>Monde des ténèbres</h3>\nPrendre, donner ou échanger des Elfes et/ou Vikings avec un seul autre Dieu.</br>\n</html>");
        boutonMondeDesTenebres.setActionCommand("BoutonMondeDesTenebres");
        boutonMondeDesTenebres.setBorderPainted(false);
        boutonMondeDesTenebres.setContentAreaFilled(false);
        boutonMondeDesTenebres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonMondeDesTenebres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonMondeDesTenebresMouseClicked(evt);
            }
        });
        jPanel3.add(boutonMondeDesTenebres, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 100, 100));

        jPanel6.setOpaque(false);

        labelnombreGeantDeFeuRestant.setFont(new java.awt.Font("Yggdrasil", 1, 24)); // NOI18N
        labelnombreGeantDeFeuRestant.setForeground(new java.awt.Color(0, 255, 255));
        labelnombreGeantDeFeuRestant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelnombreGeantDeFeuRestant.setText(Integer.toString(partie.getFdg().getPileGeantDeGivre().size()));

        boutonForteresseDeGlace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/carteGeantDeFeuDos.png"))); // NOI18N
        boutonForteresseDeGlace.setToolTipText("<html>\n<h3>Forteresse de glaces</h3>\nCombattre un Géant actif (voir Loki) ou le premier Géant de la pioche face<br/>\ncachée sans le retourner. Tous les Géants de Givre ont une force de combat<br/>\nde 3. (Voir la section «COMBAT»).<br/>\nSi le combat est gagné par le Dieu, le Géant est alors placé à l’écart du plateau<br/>\net son effet cesse immédiatement de s’appliquer. Cette défausse est commune<br/>\nà tous les Dieux.<br/>\nSi le combat est perdu, le Géant reste sur le dessus de la pile s’il était face<br/>\ncachée ou, s’il était actif (face visible), son effet continue de s’appliquer.<br/>\nLorsque les 4 Géants correspondant à une même Rune ont été vaincus, le<br/>\nDieu actif applique immédiatement le pouvoir de cette Rune.<br/>\n</html>");
        boutonForteresseDeGlace.setActionCommand("boutonForteresseDeGlace");
        boutonForteresseDeGlace.setBorderPainted(false);
        boutonForteresseDeGlace.setContentAreaFilled(false);
        boutonForteresseDeGlace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonForteresseDeGlace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonForteresseDeGlaceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(14, Short.MAX_VALUE)
                    .addComponent(labelnombreGeantDeFeuRestant, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(boutonForteresseDeGlace, javax.swing.GroupLayout.PREFERRED_SIZE, 49, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(31, Short.MAX_VALUE)
                    .addComponent(labelnombreGeantDeFeuRestant)
                    .addGap(25, 25, 25)))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(boutonForteresseDeGlace, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 50, 80));

        jLabel6.setFont(new java.awt.Font("Yggdrasil", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(Integer.toString(partie.getDm().getlViking().size()));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 506, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/viking.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 494, 50, 50));

        vanpo0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(vanpo0, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 64, 30, 30));
        jPanel3.add(vanpo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 44, 30, 30));
        jPanel3.add(vanpo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 14, 30, 30));
        jPanel3.add(vanpo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 4, 30, 30));
        jPanel3.add(vanpo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 14, 30, 30));
        jPanel3.add(vanpo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 14, 30, 30));

        boutonAsgard.setToolTipText("<html>\n<h3>Asgard</h3>\nLes Ennemis ont une force variable en fonction de la zone où ils se trouvent.<br/>\n<span style=\"font-weight:bold;\">\nC o m b a t</span><br/>\n- Désigner votre adversaire parmi les 6 Ennemis.<br/>\n- Envoyer au Domaine des Morts  un nombre de Vikings de votre<br/>\nchoix à partir de votre stock (il est possible de n’en envoyer aucun).<br/>\n- Lancer le dé.<br/>\n- Ajouter le nombre de symboles « Marteau» présents sur la face du dé<br/>\nau nombre de Vikings défaussés.<br/>\n- Ajouter éventuellement au résultat le bonus de l’Artefact correspondant<br/>\nà l’Ennemi visé. Il n’y a pas d’Artefact visant les Géants.<br/>\n- Envoyer à la Demeure des Elfes  un nombre d’Elfes de votre choix<br/>\nà partir votre stock (il est possible de n’en envoyer aucun).<br/>\n- Ajouter au résultat précédent le nombre d’Elfes défaussés.<br/>\n- Si le total est supérieur ou égal à la force de l’Ennemi désigné, alors<br/>\nvous gagnez le combat ; dans le cas contraire, vous le perdez.<br/>\nSi le combat est gagné, il faut alors reculer le pion de l’Ennemi vaincu d’une caseSi le combat est<br/> gagné, il faut alors reculer le pion de l’Ennemi vaincu d’une case<br/>\nvers la gauche (il ne faut jamais appliquer l’effet de l’Ennemi lorsqu’il recule).<br/>");
        boutonAsgard.setActionCommand("boutonAsgard");
        boutonAsgard.setBorderPainted(false);
        boutonAsgard.setContentAreaFilled(false);
        boutonAsgard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonAsgard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonAsgardMouseClicked(evt);
            }
        });
        jPanel3.add(boutonAsgard, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 370, 190));

        jPanel19.setOpaque(false);
        jPanel19.setLayout(new java.awt.BorderLayout());
        jPanel19.add(Fenrir1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 30, 30));

        jPanel16.setOpaque(false);
        jPanel16.setLayout(new java.awt.BorderLayout());
        jPanel16.add(jorgumand1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 30, 30));

        jPanel27.setOpaque(false);
        jPanel27.setLayout(new java.awt.BorderLayout());
        jPanel27.add(Nidhogg3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 30, 30));

        jPanel28.setOpaque(false);
        jPanel28.setLayout(new java.awt.BorderLayout());
        jPanel28.add(loki3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 30, 30));

        jPanel29.setOpaque(false);
        jPanel29.setLayout(new java.awt.BorderLayout());
        jPanel29.add(Fenrir3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 30, 30));

        jPanel39.setOpaque(false);
        jPanel39.setLayout(new java.awt.BorderLayout());

        surt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel39.add(surt5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 30, 30));

        jPanel48.setOpaque(false);
        jPanel48.setLayout(new java.awt.BorderLayout());
        jPanel48.add(Nidhogg6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 30, 30));

        jPanel49.setOpaque(false);
        jPanel49.setLayout(new java.awt.BorderLayout());
        jPanel49.add(jorgumand6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 30, 30));

        jPanel56.setOpaque(false);
        jPanel56.setLayout(new java.awt.BorderLayout());

        surt7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel56.add(surt7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 30, 30));

        jPanel51.setOpaque(false);
        jPanel51.setLayout(new java.awt.BorderLayout());
        jPanel51.add(Nidhogg7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 30, 30));

        jPanel54.setOpaque(false);
        jPanel54.setLayout(new java.awt.BorderLayout());
        jPanel54.add(loki7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 30, 30));

        jPanel55.setOpaque(false);
        jPanel55.setLayout(new java.awt.BorderLayout());
        jPanel55.add(hel7, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 30, 30));

        jPanel53.setOpaque(false);
        jPanel53.setLayout(new java.awt.BorderLayout());
        jPanel53.add(Fenrir7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 30, 30));

        jPanel52.setOpaque(false);
        jPanel52.setLayout(new java.awt.BorderLayout());
        jPanel52.add(jorgumand7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 30, 30));

        jPanel47.setOpaque(false);
        jPanel47.setLayout(new java.awt.BorderLayout());
        jPanel47.add(Fenrir6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 30, 30));

        jPanel50.setOpaque(false);
        jPanel50.setLayout(new java.awt.BorderLayout());
        jPanel50.add(loki6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 30, 30));

        jPanel46.setOpaque(false);
        jPanel46.setLayout(new java.awt.BorderLayout());
        jPanel46.add(hel6, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 30, 30));

        jPanel45.setOpaque(false);
        jPanel45.setLayout(new java.awt.BorderLayout());

        surt6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel45.add(surt6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 30, 30));

        jPanel44.setOpaque(false);
        jPanel44.setLayout(new java.awt.BorderLayout());
        jPanel44.add(hel5, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 30, 30));

        jPanel42.setOpaque(false);
        jPanel42.setLayout(new java.awt.BorderLayout());
        jPanel42.add(Nidhogg5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 30, 30));

        jPanel40.setOpaque(false);
        jPanel40.setLayout(new java.awt.BorderLayout());
        jPanel40.add(Fenrir5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 30, 30));

        jPanel43.setOpaque(false);
        jPanel43.setLayout(new java.awt.BorderLayout());
        jPanel43.add(jorgumand5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 30, 30));

        jPanel41.setOpaque(false);
        jPanel41.setLayout(new java.awt.BorderLayout());
        jPanel41.add(loki5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 30, 30));

        jPanel33.setOpaque(false);
        jPanel33.setLayout(new java.awt.BorderLayout());

        surt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel33.add(surt4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 30, 30));

        jPanel38.setOpaque(false);
        jPanel38.setLayout(new java.awt.BorderLayout());
        jPanel38.add(Fenrir4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 30, 30));

        jPanel36.setOpaque(false);
        jPanel36.setLayout(new java.awt.BorderLayout());
        jPanel36.add(loki4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 30, 30));

        jPanel35.setOpaque(false);
        jPanel35.setLayout(new java.awt.BorderLayout());
        jPanel35.add(Nidhogg4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 30, 30));

        jPanel34.setOpaque(false);
        jPanel34.setLayout(new java.awt.BorderLayout());
        jPanel34.add(jorgumand4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 30, 30));

        jPanel37.setOpaque(false);
        jPanel37.setLayout(new java.awt.BorderLayout());
        jPanel37.add(hel4, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 30, 30));

        jPanel30.setOpaque(false);
        jPanel30.setLayout(new java.awt.BorderLayout());

        surt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel30.add(surt3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 30, 30));

        jPanel31.setOpaque(false);
        jPanel31.setLayout(new java.awt.BorderLayout());
        jPanel31.add(hel3, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 30, 30));

        jPanel32.setOpaque(false);
        jPanel32.setLayout(new java.awt.BorderLayout());
        jPanel32.add(jorgumand3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 30, 30));

        jPanel24.setOpaque(false);
        jPanel24.setLayout(new java.awt.BorderLayout());
        jPanel24.add(Nidhogg2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 30, 30));

        jPanel25.setOpaque(false);
        jPanel25.setLayout(new java.awt.BorderLayout());
        jPanel25.add(loki2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 30, 30));

        jPanel23.setOpaque(false);
        jPanel23.setLayout(new java.awt.BorderLayout());
        jPanel23.add(Fenrir2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 30, 30));

        jPanel26.setOpaque(false);
        jPanel26.setLayout(new java.awt.BorderLayout());
        jPanel26.add(hel2, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 30, 30));

        jPanel21.setOpaque(false);
        jPanel21.setLayout(new java.awt.BorderLayout());

        surt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel21.add(surt2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 30, 30));

        jPanel22.setOpaque(false);
        jPanel22.setLayout(new java.awt.BorderLayout());
        jPanel22.add(jorgumand2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 30, 30));

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.BorderLayout());

        surt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel15.add(surt1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 30, 30));

        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.BorderLayout());
        jPanel18.add(Nidhogg1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 30, 30));

        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.BorderLayout());
        jPanel17.add(loki1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 30, 30));

        jPanel20.setOpaque(false);
        jPanel20.setLayout(new java.awt.BorderLayout());
        jPanel20.add(hel1, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 30, 30));

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.BorderLayout());

        surt0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(surt0, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 30, 30));

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout());
        jPanel11.add(jorgumand0, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 30, 30));

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.BorderLayout());
        jPanel12.add(loki0, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 30, 30));

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new java.awt.BorderLayout());
        jPanel13.add(Nidhogg0, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 30, 30));

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.BorderLayout());
        jPanel10.add(Fenrir, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 30, 30));

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.BorderLayout());
        jPanel14.add(hel0, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 30, 30));
        jPanel3.add(ileArcEnCiel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 50, 40));
        jPanel3.add(ileBlanche, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 50, 60));
        jPanel3.add(ileBleue, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 60, 50));
        jPanel3.add(ileVerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 70, 40));
        jPanel3.add(ileNoire, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 50, 50));
        jPanel3.add(ileNoireSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 50, 30));
        jPanel3.add(ileVerteSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 60, 30));
        jPanel3.add(ileBlancheSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 50, 30));
        jPanel3.add(ileBleueSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 50, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yggdrasil/vue/plateau.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void boutonDeumeureDesElfesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonDeumeureDesElfesMouseClicked
        // TODO add your handling code here:
        partie.jouerEnDemeureDesElfes(page);
        verifFinTour();



    }//GEN-LAST:event_boutonDeumeureDesElfesMouseClicked

    private void boutonDomaineDesMortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonDomaineDesMortMouseClicked
        // TODO add your handling code here:
        partie.jouerEnDomaineDesMort(page);
        verifFinTour();
      
    }//GEN-LAST:event_boutonDomaineDesMortMouseClicked

    private void boutonRoyaumeDuFeuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonRoyaumeDuFeuMouseClicked
        // TODO add your handling code here:
        partie.jouerEnRoyaumeDuFeu(page);
        verifFinTour();
      
    }//GEN-LAST:event_boutonRoyaumeDuFeuMouseClicked

    private void boutonMidgardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonMidgardMouseClicked
        // TODO add your handling code here:
        partie.jouerEnMidgard(page);
        verifFinTour();
      
    }//GEN-LAST:event_boutonMidgardMouseClicked

    private void boutonAsgardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonAsgardMouseClicked
        // TODO add your handling code here:
        partie.jouerAsgard(page);
        verifFinTour();
       
    }//GEN-LAST:event_boutonAsgardMouseClicked

    private void boutonForgeDesNainsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonForgeDesNainsMouseClicked
        // TODO add your handling code here:
        partie.jouerEnForgeDesNains(page);
        verifFinTour();
    }//GEN-LAST:event_boutonForgeDesNainsMouseClicked

    private void boutonMondeDesTenebresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonMondeDesTenebresMouseClicked
        // TODO add your handling code here:
        partie.jouerMondeDesTenebres(page);
        verifFinTour();
    }//GEN-LAST:event_boutonMondeDesTenebresMouseClicked

    private void boutonTerreBeniteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonTerreBeniteMouseClicked
        // TODO add your handling code here:
        partie.jouerEnTerreBenite(page);
        verifFinTour();
    }//GEN-LAST:event_boutonTerreBeniteMouseClicked

    private void boutonForteresseDeGlaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonForteresseDeGlaceMouseClicked
        // TODO add your handling code here:
        partie.jouerEnForteresseDeGlace(page);
        verifFinTour();
    }//GEN-LAST:event_boutonForteresseDeGlaceMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fenrir;
    private javax.swing.JLabel Fenrir1;
    private javax.swing.JLabel Fenrir2;
    private javax.swing.JLabel Fenrir3;
    private javax.swing.JLabel Fenrir4;
    private javax.swing.JLabel Fenrir5;
    private javax.swing.JLabel Fenrir6;
    private javax.swing.JLabel Fenrir7;
    private javax.swing.JLabel Nidhogg0;
    private javax.swing.JLabel Nidhogg1;
    private javax.swing.JLabel Nidhogg2;
    private javax.swing.JLabel Nidhogg3;
    private javax.swing.JLabel Nidhogg4;
    private javax.swing.JLabel Nidhogg5;
    private javax.swing.JLabel Nidhogg6;
    private javax.swing.JLabel Nidhogg7;
    private javax.swing.JButton boutonAsgard;
    private javax.swing.JButton boutonDeumeureDesElfes;
    private javax.swing.JButton boutonDomaineDesMort;
    private javax.swing.JButton boutonForgeDesNains;
    private javax.swing.JButton boutonForteresseDeGlace;
    private javax.swing.JButton boutonMidgard;
    private javax.swing.JButton boutonMondeDesTenebres;
    private javax.swing.JButton boutonRoyaumeDuFeu;
    private javax.swing.JButton boutonTerreBenite;
    private javax.swing.JLabel hel0;
    private javax.swing.JLabel hel1;
    private javax.swing.JLabel hel2;
    private javax.swing.JLabel hel3;
    private javax.swing.JLabel hel4;
    private javax.swing.JLabel hel5;
    private javax.swing.JLabel hel6;
    private javax.swing.JLabel hel7;
    private javax.swing.JLabel ileArcEnCiel;
    private javax.swing.JLabel ileBlanche;
    private javax.swing.JLabel ileBlancheSub;
    private javax.swing.JLabel ileBleue;
    private javax.swing.JLabel ileBleueSub;
    private javax.swing.JLabel ileNoire;
    private javax.swing.JLabel ileNoireSub;
    private javax.swing.JLabel ileVerte;
    private javax.swing.JLabel ileVerteSub;
    private javax.swing.JLabel imageElfe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jorgumand0;
    private javax.swing.JLabel jorgumand1;
    private javax.swing.JLabel jorgumand2;
    private javax.swing.JLabel jorgumand3;
    private javax.swing.JLabel jorgumand4;
    private javax.swing.JLabel jorgumand5;
    private javax.swing.JLabel jorgumand6;
    private javax.swing.JLabel jorgumand7;
    private javax.swing.JLabel labelNombreElfes;
    private javax.swing.JLabel labelnombreGeantDeFeuRestant;
    private javax.swing.JLabel loki0;
    private javax.swing.JLabel loki1;
    private javax.swing.JLabel loki2;
    private javax.swing.JLabel loki3;
    private javax.swing.JLabel loki4;
    private javax.swing.JLabel loki5;
    private javax.swing.JLabel loki6;
    private javax.swing.JLabel loki7;
    private javax.swing.JPanel panelArtefact;
    private javax.swing.JLabel surt0;
    private javax.swing.JLabel surt1;
    private javax.swing.JLabel surt2;
    private javax.swing.JLabel surt3;
    private javax.swing.JLabel surt4;
    private javax.swing.JLabel surt5;
    private javax.swing.JLabel surt6;
    private javax.swing.JLabel surt7;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel vanpo0;
    private javax.swing.JLabel vanpo1;
    private javax.swing.JLabel vanpo2;
    private javax.swing.JLabel vanpo3;
    private javax.swing.JLabel vanpo4;
    private javax.swing.JLabel vanpo5;
    // End of variables declaration//GEN-END:variables
}
