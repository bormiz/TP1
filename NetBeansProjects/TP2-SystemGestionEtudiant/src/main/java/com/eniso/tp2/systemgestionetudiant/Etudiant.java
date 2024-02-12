/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemgestionetudiant;

/**
 *
 * @author aziz
 */
public class Etudiant {
    private String nom;
    private String prenom;
    private int numeroDinscription;
    private String mail;
    public Etudiant(String nom,String prenom,int numero,String mail){
        this.nom=nom;
        this.prenom=prenom;
        this.numeroDinscription=numero;
        this.mail=mail;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String ali){
        this.nom = ali;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String ch){
        this.prenom = ch;
    }
    public int getNumero(){
    return this.numeroDinscription;
    }
    public void setNumero(int x){
    this.numeroDinscription=x;
    }
    public String getMail(){
        return this.mail;
    }
    public void setMail(String mail1 ){
    this.mail=mail1;
    }
    public String toString (){
    return "nom:"+this.nom +"prenom:"+this.prenom+"numero:"+this.numeroDinscription+"mail:"+this.mail;
    }
    
}
