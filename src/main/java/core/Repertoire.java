/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import VUE.Contact_Creation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MAXETTE
 */
public class Repertoire {
    Connexion co = new Connexion();
     Connection connect;
    Statement stat;
    ResultSet res;
    PreparedStatement pr_stat;
    private List<Contact> contacts;

    public Repertoire() {
        contacts = new ArrayList<>();
    }

    public void ajouterContact(Contact contact) {
        contacts.add(contact);
    }
public void supprimerContact(int code ,String type) {
    
    
    if(type.equals("Etudiant")){
    
    try {
        // Établir la connexion à la base de données
    

        // Préparer l'instruction SQL pour supprimer le contact en fonction de son code
        String sql = "DELETE FROM Etudiant WHERE Code = ?";
         connect = co.GetConnection();
         pr_stat = connect.prepareStatement(sql);

        // Définir le code du contact à supprimer comme paramètre de la requête
        pr_stat.setInt(1, code);

        // Exécuter la requête de suppression
        pr_stat.executeUpdate();

        // Fermer la connexion et les ressources
        pr_stat.close();
       
        
        // Supprimer le contact de la liste locale
        

        System.out.println("Le contact a été supprimé avec succès de la base de données.");
         JOptionPane.showMessageDialog(null, "SUPPRESSION EFFECTUE....");
    } catch (SQLException e) {
        System.out.println("Erreur lors de la suppression du contact : " + e.getMessage());
         JOptionPane.showMessageDialog(null, "SUPPRESSION ENTRAVE....");
    }
}else if(type.equals("Enseignant")){
          try {
        // Préparer l'instruction SQL pour supprimer le contact en fonction de son code
        String sql = "DELETE FROM Enseignat WHERE Code = ?";
         connect = co.GetConnection();
         pr_stat = connect.prepareStatement(sql);

        // Définir le code du contact à supprimer comme paramètre de la requête
        pr_stat.setInt(1, code);

        // Exécuter la requête de suppression
        pr_stat.executeUpdate();

        // Fermer la connexion et les ressources
        pr_stat.close();
       
        
        // Supprimer le contact de la liste locale
   

        System.out.println("Le contact a été supprimé avec succès de la base de données.");
         JOptionPane.showMessageDialog(null, "SUPPRESSION EFFECTUE....");
    } catch (SQLException e) {
        System.out.println("Erreur lors de la suppression du contact : " + e.getMessage());
         JOptionPane.showMessageDialog(null, "SUPPRESSION ENTRAVE....");
    }
}else if(type.equals("Agent")){
          try {
        // Préparer l'instruction SQL pour supprimer le contact en fonction de son code
        String sql = "DELETE FROM Agent WHERE Code = ?";
         connect = co.GetConnection();
         pr_stat = connect.prepareStatement(sql);

        // Définir le code du contact à supprimer comme paramètre de la requête
        pr_stat.setInt(1, code);

        // Exécuter la requête de suppression
        pr_stat.executeUpdate();

        // Fermer la connexion et les ressources
        pr_stat.close();
       
        
        // Supprimer le contact de la liste locale
        
        JOptionPane.showMessageDialog(null, "SUPPRESSION EFFECTUE....");
        System.out.println("Le contact a été supprimé avec succès de la base de données.");
    } catch (SQLException e) {
        System.out.println("Erreur lors de la suppression du contact : " + e.getMessage());
        JOptionPane.showMessageDialog(null, "UNE ERREUR EST SURVENUE....");
    }
}
    
}

    
   public List<Contact> rechercherContact(String Nom,String Address,String Email) {
    
       List<Contact> list_recherche =new ArrayList<>();
    String sql = "SELECT Code, Nom, Date_Naissance, Address, Email, TelNumber FROM Etudiant WHERE (Nom LIKE ? OR Address LIKE ? OR Email LIKE ? )";
    try {
        
        connect=co.GetConnection();
        pr_stat=connect.prepareStatement(sql);
        pr_stat.setString(1, Nom.isEmpty() ? Nom : Nom + "%");
        pr_stat.setString(2, Address.isEmpty() ? Address : Address + "%");
        pr_stat.setString(3, Email.isEmpty() ? Email : Email + "%");
        
        res = pr_stat.executeQuery();
        
        while (res.next()) {
            int Code = res.getInt("Code");
            String nom = res.getString("Nom");
            String  dn = res.getString("Date_Naissance"); 
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // Exemple de format AAAA-MM-JJ
        Date dateNaissance = null;
             try {
               dateNaissance = format.parse(dn);
           } catch (ParseException ex) {
               Logger.getLogger(Contact_Creation.class.getName()).log(Level.SEVERE, null, ex);
           }
         java.sql.Date sqlDateNaissance = new java.sql.Date(dateNaissance.getTime());
        
            Address= res.getString("Address");
            Email = res.getString("Email");
            int tel = res.getInt("TelNumber");
            Etudiant individu = new Etudiant(Code, nom, sqlDateNaissance, Address, Email, tel);
            list_recherche.add(individu);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null, "UNE ERREUR EST SURVENUE....");
    }
    
    String sql2 = "SELECT Code, Nom, Date_Naissance, Address, Email, TelNumber FROM Agent WHERE (Nom LIKE ? OR Address LIKE ? OR Email LIKE ? )";
    try {
        
        connect=co.GetConnection();
        pr_stat=connect.prepareStatement(sql2);
        pr_stat.setString(1, Nom.isEmpty() ? Nom : Nom + "%");
        pr_stat.setString(2, Address.isEmpty() ? Address : Address + "%");
        pr_stat.setString(3, Email.isEmpty() ? Email : Email + "%");
        
        res = pr_stat.executeQuery();
        
        while (res.next()) {
            int Code = res.getInt("Code");
            String nom = res.getString("Nom");
            String  dn = res.getString("Date_Naissance"); SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // Exemple de format AAAA-MM-JJ
        Date dateNaissance = null;
             try {
               dateNaissance = format.parse(dn);
           } catch (ParseException ex) {
               Logger.getLogger(Contact_Creation.class.getName()).log(Level.SEVERE, null, ex);
           }
         java.sql.Date sqlDateNaissance = new java.sql.Date(dateNaissance.getTime());
        
            Address= res.getString("Address");
            Email = res.getString("Email");
            int tel = res.getInt("TelNumber");
            Agent individu = new Agent(Code, nom, sqlDateNaissance, Address, Email, tel);
            list_recherche.add(individu);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null, "UNE ERREUR EST SURVENUE....");
    }
    
    String sql3 = "SELECT Code, Nom, Date_Naissance, Address, Email, TelNumber FROM Enseignant WHERE (Nom LIKE ? OR Address LIKE ? OR Email LIKE ? )";
    try {
        
        connect=co.GetConnection();
        pr_stat=connect.prepareStatement(sql3);
        pr_stat.setString(1, Nom.isEmpty() ? Nom : Nom + "%");
        pr_stat.setString(2, Address.isEmpty() ? Address : Address + "%");
        pr_stat.setString(3, Email.isEmpty() ? Email : Email + "%");
        
        res = pr_stat.executeQuery();
        
        while (res.next()) {
            int Code = res.getInt("Code");
            String nom = res.getString("Nom");
            String  dn = res.getString("Date_Naissance"); SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); // Exemple de format AAAA-MM-JJ
        Date dateNaissance = null;
             try {
               dateNaissance = format.parse(dn);
           } catch (ParseException ex) {
               Logger.getLogger(Contact_Creation.class.getName()).log(Level.SEVERE, null, ex);
           }
         java.sql.Date sqlDateNaissance = new java.sql.Date(dateNaissance.getTime());
        
            Address= res.getString("Address");
            Email = res.getString("Email");
            int tel = res.getInt("TelNumber");
            Agent individu = new Agent(Code, nom, sqlDateNaissance, Address, Email, tel);
            list_recherche.add(individu);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null, "UNE ERREUR EST SURVENUE....");
    }
    return  list_recherche;
}
    

   
   
   public void Modifier(String nom, String Adress,String Email , int code, int TEL, String Type){
        
       
       if(Type.equals("Etudiant")){
           
       
       
       String sql = "UPDATE Etudiant SET Nom=?,Address=?,email = ?,TelNumber = ? WHERE Code=?";
    
    try {
            connect=co.GetConnection();
            pr_stat=connect.prepareStatement(sql);
            pr_stat.setString(1, nom);
            pr_stat.setString(2, Adress);
            pr_stat.setString(3, Email);
            pr_stat.setInt(4, TEL);
            pr_stat.setInt(5,code);
            
            pr_stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Contact modifié !!!");

             
        } catch (Exception e) {
            e.printStackTrace();
             JOptionPane.showMessageDialog(null, "MODIFIACTION ENTRAVE.... !!! ");
        }
       }else if(Type.equals("Enseignant")){
            String sql2 = "UPDATE Enseignant SET Nom=?,Address=?,email = ?,TelNumber = ? WHERE Code=?";
    
    try {
            connect=co.GetConnection();
            pr_stat=connect.prepareStatement(sql2);
            pr_stat.setString(1, nom);
            pr_stat.setString(2, Adress);
            pr_stat.setString(3, Email);
            pr_stat.setInt(4, TEL);
            pr_stat.setInt(5,code);
            
            pr_stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Contact modifié !!!");

             
        } catch (Exception e) {
            e.printStackTrace();
             JOptionPane.showMessageDialog(null, "MODIFIACTION ENTRAVE.... !!! ");
        }
       }else if(Type.equals("Agent")){
            String sql3 = "UPDATE Agent SET Nom=?,Address=?,email = ?,TelNumber = ? WHERE Code=?";
    
    try {
            connect=co.GetConnection();
            pr_stat=connect.prepareStatement(sql3);
            pr_stat.setString(1, nom);
            pr_stat.setString(2, Adress);
            pr_stat.setString(3, Email);
            pr_stat.setInt(4, TEL);
            pr_stat.setInt(5,code);
            
            pr_stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Contact modifié !!!");

             
        } catch (Exception e) {
            e.printStackTrace();
             JOptionPane.showMessageDialog(null, "MODIFIACTION ENTRAVE.... !!! ");
        }
       }
}
   
}
