package com.ecommerce.microcommerce.model;

import com.fasterxml.jackson.annotation.JsonFilter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
//@JsonFilter("monFiltreDynamique")
@Entity
public class Product {
    @Id
    //propriétés de base
    private int id;
    private String nom;
    private int prix;

    //informations à cacher

    private int prixAchat;
    //constructeur à vide
    public Product() {
    }
    //constructeur prêt
    public Product(int id, String nom, int prix,int prixAchat) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.prixAchat=prixAchat;
    }

    //Getter

    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }
    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(int prixAchat){
        this.prixAchat=prixAchat;
    }
    //methode to string
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
