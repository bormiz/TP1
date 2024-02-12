/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemgestionetudiant;

/**
 *
 * @author aziz
 */
public class Livre {
    private String titre;
    private String auteur;
    public int année;
    public int isbn;
    public String getTitre(){
    return this.titre;
    }
    public void setTitre(String nouveautitre){
        this.titre=nouveautitre;
    }
    public String getAuteur(){
     return this.auteur;
    }
    public void setAuteur(String nouveauauteur){
    this.auteur=nouveauauteur;
    }
    public Livre (String titre,String auteur,int année,int isbn){
    this.titre=titre;
    this.auteur=auteur;
    this.année=année;
    this.isbn=isbn;
    }
        public Livre (String titre,String auteur){
    this.titre=titre;
    this.auteur=auteur;
    }
        public Livre (String titre,String auteur,int année){
    this.titre=titre;
    this.auteur=auteur;
    this.année=année;
    
    }
    
}
