/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VUE;

import core.Connexion;
import core.Contact;
import core.Repertoire;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MAXETTE
 */
public class Liste_Contact extends javax.swing.JFrame {
 Connexion co = new Connexion();
    Connection connect;
    Statement stat;
    ResultSet res;
    PreparedStatement pr_stat;
    /**
     * Creates new form Liste_Contact
     */
    public Liste_Contact() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TEXT_Gest_Address = new javax.swing.JTextField();
        TEXT_Gest_Date = new javax.swing.JTextField();
        TEXT_Gest_nom = new javax.swing.JTextField();
        TEXT_Gest_Email = new javax.swing.JTextField();
        TEXT_Gest_TelNumber = new javax.swing.JTextField();
        BUT_SUPPRIMER = new javax.swing.JButton();
        BUT_ACTUALISER = new javax.swing.JButton();
        BUT_RECHERCHER = new javax.swing.JButton();
        BUT_MODIFIER = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tableau_contacts = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        TEXT_ID_CONTACT = new javax.swing.JTextField();
        TEXT_TYPE = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Gestion_Contacts");

        jLabel2.setText("Nom");

        jLabel3.setText("Date_naissance");

        jLabel4.setText("Address");

        jLabel5.setText("Email");

        jLabel6.setText("TelNumber");

        TEXT_Gest_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXT_Gest_nomActionPerformed(evt);
            }
        });

        BUT_SUPPRIMER.setText("SUPPRIMER");
        BUT_SUPPRIMER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_SUPPRIMERActionPerformed(evt);
            }
        });

        BUT_ACTUALISER.setText("ACTUALISER");
        BUT_ACTUALISER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_ACTUALISERActionPerformed(evt);
            }
        });

        BUT_RECHERCHER.setText("RECHERCHER");
        BUT_RECHERCHER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_RECHERCHERActionPerformed(evt);
            }
        });

        BUT_MODIFIER.setText("MODIFIER");
        BUT_MODIFIER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT_MODIFIERActionPerformed(evt);
            }
        });

        Tableau_contacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tableau_contacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Tableau_contactsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Tableau_contacts);

        jLabel7.setText("NE RIEN ECRIRE ICI");

        TEXT_ID_CONTACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXT_ID_CONTACTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TEXT_Gest_Date, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(TEXT_Gest_nom)
                                    .addComponent(TEXT_Gest_Address)
                                    .addComponent(TEXT_Gest_TelNumber)
                                    .addComponent(TEXT_Gest_Email))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(128, 128, 128)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(TEXT_ID_CONTACT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addComponent(TEXT_TYPE, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BUT_SUPPRIMER, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(BUT_MODIFIER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BUT_RECHERCHER, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(BUT_ACTUALISER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BUT_ACTUALISER)
                            .addComponent(BUT_MODIFIER))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TEXT_Gest_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TEXT_Gest_TelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(TEXT_Gest_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(TEXT_Gest_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BUT_SUPPRIMER)
                                            .addComponent(BUT_RECHERCHER))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TEXT_ID_CONTACT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)))
                                .addComponent(jLabel4))
                            .addComponent(TEXT_Gest_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(TEXT_TYPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TEXT_Gest_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXT_Gest_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXT_Gest_nomActionPerformed

    private void TEXT_ID_CONTACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXT_ID_CONTACTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXT_ID_CONTACTActionPerformed

    private void Tableau_contactsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tableau_contactsMouseReleased
        // TODO add your handling code here:
         int i = Tableau_contacts.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) Tableau_contacts.getModel();
        TEXT_ID_CONTACT.setText(model.getValueAt(i, 0).toString());
        TEXT_Gest_nom.setText(model.getValueAt(i, 1).toString());
        TEXT_Gest_Date.setText(model.getValueAt(i, 2).toString());
        TEXT_Gest_Address.setText(model.getValueAt(i, 3).toString());
        TEXT_Gest_Email.setText(model.getValueAt(i, 4).toString());
        TEXT_Gest_TelNumber.setText(model.getValueAt(i, 5).toString());
      
        TEXT_TYPE.setText(model.getValueAt(i, 6).toString());
    }//GEN-LAST:event_Tableau_contactsMouseReleased

    private void BUT_ACTUALISERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_ACTUALISERActionPerformed
        // TODO add your handling code here:
        table_contact();
    }//GEN-LAST:event_BUT_ACTUALISERActionPerformed

    private void BUT_SUPPRIMERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_SUPPRIMERActionPerformed
        // TODO add your handling code here:
        int CODE = Integer.parseInt(TEXT_ID_CONTACT.getText());
        String Type = TEXT_TYPE.getText();
        Repertoire R  = new Repertoire();
        R.supprimerContact(CODE, Type);
        // Établir la connexion à la base de données
    

        // Préparer l'instruction SQL pour supprimer le contact en fonction de son code
     
        
        // Supprimer le contact de la liste locale
   
    
        
        
    }//GEN-LAST:event_BUT_SUPPRIMERActionPerformed

    private void BUT_RECHERCHERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_RECHERCHERActionPerformed
        // TODO add your handling code here:
        String Address = TEXT_Gest_Address.getText();
        String nom = TEXT_Gest_nom.getText();
        String email = TEXT_Gest_Email.getText();
        
        Repertoire R = new Repertoire();
        // Appelez la méthode Rechercher avec les paramètres appropriés
        List<Contact> resultats;
        resultats = (List<Contact>)R.rechercherContact(nom,Address,email);
        
    // Créez un nouveau modèle de tableau et ajoutez vos résultats de recherche
    DefaultTableModel tableModel = new DefaultTableModel();

    // Ajoutez des colonnes à votre modèle de tableau
    tableModel.addColumn("Code");
    tableModel.addColumn("Nom");
    tableModel.addColumn("Date_Naissance");
    tableModel.addColumn("Address");
    tableModel.addColumn("Email");
    tableModel.addColumn("TelNumber");
    

    // Parcourez la liste des livres renvoyés par la méthode de recherche
    for (Contact cont : resultats) {
        // Ajoutez chaque livre comme une nouvelle ligne dans votre modèle de tableau
        tableModel.addRow(new Object[]{cont.getcode(),cont.getnom(), cont.getdateNaissance(), cont.getaddress(),cont.getemail(),cont.gettelNumber()});
    }

    // Appliquez le nouveau modèle à votre JTable
    Tableau_contacts.setModel(tableModel);

    }//GEN-LAST:event_BUT_RECHERCHERActionPerformed

    private void BUT_MODIFIERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT_MODIFIERActionPerformed
        // TODO add your handling code here:
        String type  = TEXT_TYPE.getText();
        String nom = TEXT_Gest_nom.getText();
        String Adress= TEXT_Gest_Address.getText();
        String email= TEXT_Gest_Email.getText();
        int code = Integer.parseInt(TEXT_ID_CONTACT.getText());
        int TEL = Integer.parseInt(TEXT_Gest_TelNumber.getText());
        Repertoire R = new Repertoire();        
        R.Modifier(nom, Adress, email,code, TEL,type);
    }//GEN-LAST:event_BUT_MODIFIERActionPerformed

    
     public void table_contact(){
       String [] Contact = {"Code","Nom","Date","Address","Email","TelNumber","Type"};
       String [] afficher_table_2 = new String [8];
       DefaultTableModel model_2 = new DefaultTableModel(null,Contact);
       String sql = "SELECT Code, Nom, Date_Naissance, Address, Email, TelNumber FROM Etudiant";
       try{
           connect = co.GetConnection();
           pr_stat=connect.prepareStatement(sql);
           res = pr_stat.executeQuery();
           
           
           
           while(res.next()){
               afficher_table_2[0]=res.getString("Code");
               afficher_table_2[1]=res.getString("Nom");
               afficher_table_2[2]=res.getString("Date_Naissance");
               afficher_table_2[3]=res.getString("Address");
               afficher_table_2[4]=res.getString("Email");
               afficher_table_2[5]=res.getString("TelNumber");
               afficher_table_2[6] = "Etudiant";
               
               
               model_2.addRow(afficher_table_2);
               
           }
        String sqlEnseignant = "SELECT Code, Nom, Date_Naissance, Address, Email, TelNumber FROM Enseignant";
        pr_stat = connect.prepareStatement(sqlEnseignant);
        res = pr_stat.executeQuery();

        while (res.next()) {
            afficher_table_2[0] = res.getString("Code");
            afficher_table_2[1] = res.getString("Nom");
            afficher_table_2[2] = res.getString("Date_Naissance");
            afficher_table_2[3] = res.getString("Address");
            afficher_table_2[4] = res.getString("Email");
            afficher_table_2[5] = res.getString("TelNumber");
            afficher_table_2[6] = "Enseigant"; // Ajoutez manuellement le type "Etudiant"

            model_2.addRow(afficher_table_2);
        }
         String sqlEtudiant = "SELECT Code, Nom, Date_Naissance, Address, Email, TelNumber FROM Agent";
        pr_stat = connect.prepareStatement(sqlEtudiant);
        res = pr_stat.executeQuery();

        while (res.next()) {
            afficher_table_2[0] = res.getString("Code");
            afficher_table_2[1] = res.getString("Nom");
            afficher_table_2[2] = res.getString("Date_Naissance");
            afficher_table_2[3] = res.getString("Address");
            afficher_table_2[4] = res.getString("Email");
            afficher_table_2[5] = res.getString("TelNumber");
            afficher_table_2[6] = "Agent"; // Ajoutez manuellement le type "Etudiant"

            model_2.addRow(afficher_table_2);
        }
           Tableau_contacts.setModel(model_2);
       }catch(Exception e){
           
         e.printStackTrace();
         JOptionPane.showMessageDialog(null, "Une erreur est survenue...");
           
       }  
    }
     
     
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
            java.util.logging.Logger.getLogger(Liste_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Liste_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Liste_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Liste_Contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
try{
        /* Create and display the form */
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts", "root", "");
        
        // Affichage d'un message de confirmation si la connexion a réussi
        JOptionPane.showMessageDialog(null, "La connexion à la base de données a été établie avec succès.");

        // Création et affichage de la fenêtre principale de l'application
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Liste_Contact().setVisible(true);
            }
        });
    } catch (SQLException e) {
        // Gestion des exceptions en cas d'échec de la connexion
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Une erreur est survenue lors de la connexion à la base de données : " + e.getMessage());
    }
        /* Create and display the form */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUT_ACTUALISER;
    private javax.swing.JButton BUT_MODIFIER;
    private javax.swing.JButton BUT_RECHERCHER;
    private javax.swing.JButton BUT_SUPPRIMER;
    private javax.swing.JTextField TEXT_Gest_Address;
    private javax.swing.JTextField TEXT_Gest_Date;
    private javax.swing.JTextField TEXT_Gest_Email;
    private javax.swing.JTextField TEXT_Gest_TelNumber;
    private javax.swing.JTextField TEXT_Gest_nom;
    private javax.swing.JTextField TEXT_ID_CONTACT;
    private javax.swing.JTextField TEXT_TYPE;
    private javax.swing.JTable Tableau_contacts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
