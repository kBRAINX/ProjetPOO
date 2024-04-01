/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author MAXETTE
 */
public class Enseignant extends Contact{
    private String statut;
    Connexion co = new Connexion();
     Connection connect;
    Statement stat;
    ResultSet res;
    PreparedStatement pr_stat;

    public Enseignant(int code, String nom, Date dateNaissance, String address, String email, int telNumber, String statut) {
        super(code, nom, dateNaissance, address, email, telNumber);
        this.statut = statut;
    }
    
        public Enseignant(int code, String nom, Date dateNaissance, String address, String email, int telNumber) {
        super(code, nom, dateNaissance, address, email, telNumber);
        
    }
    
    public String getstatut(){
        return statut;
    }
    
    public void setstatut(String statut){
        this.statut=statut;
    }

    @Override
    public void insererDansBaseDeDonnees() throws SQLException {
        String query = "INSERT INTO Enseignant (Code ,Nom, Date_naissance, Address, Email,TelNumber, Statut) VALUES ( ?,?, ?, ?, ?, ?, ?)";
        try  {
            
             connect=co.GetConnection();
             pr_stat = connect.prepareStatement(query);
            
          pr_stat.setInt(1, this.getcode());
            pr_stat.setString(2, this.getnom());
            pr_stat.setDate(3, (java.sql.Date) this.getdateNaissance());
            pr_stat.setString(4, this.getaddress());
           pr_stat.setString(5, this.getemail());
            // Set other parameters...
            pr_stat.setInt(6, this.gettelNumber());
           pr_stat.setString(7, this.getstatut());
            
            pr_stat.executeUpdate();
       System.out.println(" ");
    JOptionPane.showMessageDialog(null,"AJOUT BIEN EFFECTUE....");
 }
    catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"UNE ERREUR EST SURVENUE....");
            }

    }
}
    
