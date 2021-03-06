package gestion.trelux.metier;
// Generated 24 mai 2018 11:55:21 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Devis generated by hbm2java
 */
public class Devis  implements java.io.Serializable {


     private String codedevis;
     private Commandestock commandestock;
     private String datedevis;
     private Integer montantdevis;
     private Set lignedevises = new HashSet(0);

    public Devis() {
    }

	
    public Devis(String codedevis) {
        this.codedevis = codedevis;
    }
    public Devis(String codedevis, Commandestock commandestock, String datedevis, Integer montantdevis, Set lignedevises) {
       this.codedevis = codedevis;
       this.commandestock = commandestock;
       this.datedevis = datedevis;
       this.montantdevis = montantdevis;
       this.lignedevises = lignedevises;
    }
   
    public String getCodedevis() {
        return this.codedevis;
    }
    
    public void setCodedevis(String codedevis) {
        this.codedevis = codedevis;
    }
    public Commandestock getCommandestock() {
        return this.commandestock;
    }
    
    public void setCommandestock(Commandestock commandestock) {
        this.commandestock = commandestock;
    }
    public String getDatedevis() {
        return this.datedevis;
    }
    
    public void setDatedevis(String datedevis) {
        this.datedevis = datedevis;
    }
    public Integer getMontantdevis() {
        return this.montantdevis;
    }
    
    public void setMontantdevis(Integer montantdevis) {
        this.montantdevis = montantdevis;
    }
    public Set getLignedevises() {
        return this.lignedevises;
    }
    
    public void setLignedevises(Set lignedevises) {
        this.lignedevises = lignedevises;
    }




}


