/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp2.systemgestionetudiant;
import java.util.ArrayList;
import com.eniso.tp2.systemgestionetudiant.Etudiant;
import com.eniso.tp2.systemgestionetudiant.SystemGestionEtudiant;
/**
 *
 * @author aziz
 */
public class TP2SystemGestionEtudiant {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Etudiant e1 = new Etudiant("ali","salah",123456789,"ehfezio@jhfzk");
        Etudiant e2 = new Etudiant("samir","azedhazk",123456,"aze@aze");
        Etudiant e3 = new Etudiant("qsd","fgh",123,"qsd@qsd");
        SystemGestionEtudiant l= new SystemGestionEtudiant();
        l.ajouterEtudiant(e1);
        l.ajouterEtudiant(e2);
        l.ajouterEtudiant(e3);
        l.afficherEtudiants();
        l.modifierEmailEtudiant(123, "azerty@azerty");
        l.supprimerEtudiant(123);
        l.afficherEtudiants();
        Livre l1= new Livre ("aze","ber");
        Livre l2= new Livre ("nbn","azert",2020);
        Livre l3= new Livre ("qsdfg","azerty",2022,123456);
        System.out.println(l1.toString());
        l2.toString();
        l3.toString();
        
        

    }
    
}
