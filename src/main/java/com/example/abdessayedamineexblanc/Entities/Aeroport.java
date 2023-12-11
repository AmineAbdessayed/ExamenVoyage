package com.example.abdessayedamineexblanc.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Aeroport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int  idAeroport;
    @Column(nullable = false)
    private String nom;
    private String codeAITA;
    private Long telephone;

    @OneToMany(mappedBy = "aeroport")
    private List<Vol> arrive=new ArrayList<>();

    @OneToMany(mappedBy = "aeroport")
    private List<Vol> depart=new ArrayList<>();



}
