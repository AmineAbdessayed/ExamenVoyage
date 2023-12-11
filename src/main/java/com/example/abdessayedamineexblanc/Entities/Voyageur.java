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
public class Voyageur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idVoyageur;
    private String nom;
    private String prenom;
    private Date dateNaissance;

    @OneToMany(mappedBy = "voyageur")
    private List<Reservation> reservations=new ArrayList<>();


}
