/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2.systemgestionetudiant;

import java.util.ArrayList;
import com.eniso.tp2.systemgestionetudiant.Etudiant;
/**
 *
 * @author aziz
 */
public class SystemGestionEtudiant {
    private ArrayList <Etudiant> list;
    public SystemGestionEtudiant(){
    this.list= new ArrayList();
    }
    public void ajouterEtudiant (Etudiant e){
    list.add(e);
    }
    public void afficherEtudiants (){
        for ( Etudiant i : this.list )
        System.out.println(i.toString());
    }
    public void modifierEmailEtudiant(int numeroInscription,String nouvelEmail){
    for (Etudiant i : this.list){
        if (i.getNumero()== numeroInscription)
            i.setMail(nouvelEmail);
                }
    
    }
    public void supprimerEtudiant (int numeroInscription){
    for (int i=0;i<list.size() ;i++){
        if (list.get(i).getNumero() == numeroInscription){
            list.remove(i);
        }
    }
    }
    
}
