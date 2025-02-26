package com.example.demo.service;

import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;

@Service
public class BavardService {

    private String nom = "Le Grand Bavard";

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String parler() {
        System.out.println(nom + " parle depuis " + this.getClass().getSimpleName());
        return null;
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("BavardService a été initialisé !");
    }
}
