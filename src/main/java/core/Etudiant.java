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
public class Etudiant extends Contact{
    private String cycle;
    private int niveau;
    Connexion co = new Connexion();
     Connection connect;
    Statement stat;
    ResultSet res;
    PreparedStatement pr_stat;

    public Etudiant(int code, String nom, Date dateNaissance, String address, String email, int telNumber, String cycle, int niveau) {
        super(code, nom, dateNaissance, address, email, telNumber);
        this.cycle = cycle;
        this.niveau = niveau;
    }
    
    public Etudiant(int code, String nom, Date dateNaissance, String address, String email, int telNumber) {
        super(code, nom, dateNaissance, address, email, telNumber);
        
    }
    
    public String getcycle(){
        return cycle;
    }
    
    public void setcycle(String cycle){
        this.cycle=cycle;
    }
    
    public int getniveau(){
        return niveau;
    }
    
    public void setniveau(int niveau){
        this.niveau=niveau;
    }

    @Override
    public void insererDansBaseDeDonnees() throws SQLException {
         
      String query = "INSERT INTO Etudiant(Code,Nom, Date_naissance, Address, Email,TelNumber, Cycle, Niveau) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
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
            pr_stat.setString(7, this.getcycle());
            pr_stat.setInt(8, this.getniveau());
           
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

