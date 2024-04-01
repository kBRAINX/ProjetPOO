/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author MAXETTE
 */
public abstract class Contact {
    
    private int code;
    private String nom;
    private Date dateNaissance;
    private String address;
    private String email;
    private int telNumber;

    public Contact(int code,String nom, Date dateNaissance, String address, String email, int telNumber) {
        this.code = code;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.address = address;
        this.email = email;
        this.telNumber = telNumber;
    }

    public int getcode(){
        return code;
    }
    
    public void setcode(int code){
        this.code=code;
    }
    
    public String getnom(){
        return nom;
    }
    
    public void setcode(String nom){
        this.nom=nom;
    }
    public Date getdateNaissance(){
        return dateNaissance;
    }
    
    public void setdateNaissance(Date dateNaissance){
        this.dateNaissance=dateNaissance;
    }
    public String getaddress(){
        return address;
    }
    
    public void setaddress(String address){
        this.address=address;
    }
    public String getemail(){
        return email;
    }
    
    public void setemail(String email){
        this.email=email;
    }
    public int gettelNumber(){
        return telNumber;
    }
    
    public void settelNumber(int telNumber){
        this.telNumber=telNumber;
    }
    
     public abstract void insererDansBaseDeDonnees() throws SQLException;
}

    

