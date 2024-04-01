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
public class Agent extends Contact{
    Connexion co = new Connexion();
     Connection connect;
    Statement stat;
    ResultSet res;
    PreparedStatement pr_stat;
     private double salaire;
    private String statut;
    private String categorie;
    private int indiceSalaire;
    private String occupation;

    public Agent(int code, String nom, Date dateNaissance, String address, String email, int telNumber, double salaire, String statut, String categorie, int indiceSalaire, String occupation) {
        super(code, nom, dateNaissance, address, email, telNumber);
        this.salaire = salaire;
        this.statut = statut;
        this.categorie = categorie;
        this.indiceSalaire = indiceSalaire;
        this.occupation = occupation;
    }
    
        public Agent(int code, String nom, Date dateNaissance, String address, String email, int telNumber) {
        super(code, nom, dateNaissance, address, email, telNumber);
        
    }
    

      public double getsalaire(){
        return salaire;
    }
    
    public void setsalaire(double salaire){
        this.salaire=salaire;
    }
    
      public String getstatut(){
        return statut;
    }
    
    public void setstatut(String statut){
        this.statut=statut;
    }
    
      public String getcategorie(){
        return categorie;
    }
    
    public void setcategorie(String categorie){
        this.categorie=categorie;
    }
    
      public int getindiceSalaire(){
        return indiceSalaire;
    }
    
    public void setindiceSalaire(int indiceSalaire){
        this.indiceSalaire=indiceSalaire;
    }
    
      public String getoccupation(){
        return occupation;
    }
    
    public void setoccupation(String occupation){
        this.occupation=occupation;
    }

    @Override
    public void insererDansBaseDeDonnees() throws SQLException {
             String query = "INSERT INTO Agent (Code, Nom, Date_naissance, Address, Email,TelNumber,Salaire,Statut,Categorie,IndiceSalaire,Occupation) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";
             
        try {
            
             connect=co.GetConnection();
             pr_stat = connect.prepareStatement(query);
             
           pr_stat.setInt(1, this.getcode());
             pr_stat.setString(2, this.getnom());
             pr_stat.setDate(3, (java.sql.Date) this.getdateNaissance());
             pr_stat.setString(4, this.getaddress());
             pr_stat.setString(5, this.getemail());
           
             pr_stat.setInt(6, this.gettelNumber());
             pr_stat.setDouble(7, this.getsalaire());
             pr_stat.setString(8, this.getstatut());
             pr_stat.setString(9, this.getcategorie());
             pr_stat.setInt(10, this.getindiceSalaire());
             pr_stat.setString(11, this.getoccupation());
            
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
