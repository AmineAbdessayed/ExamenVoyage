package com.example.abdessayedamineexblanc.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reservation {

    @Id
    private  String idReservation;
    private LocalDate dateReservation;
    @Enumerated(EnumType.STRING)
    private ClassPlace classPlace;
    @Enumerated(EnumType.STRING)
    private   EtatReservation etatReservation;

    @ManyToOne
    private Voyageur voyageur;

    @ManyToOne
    private  Vol vol;



}
