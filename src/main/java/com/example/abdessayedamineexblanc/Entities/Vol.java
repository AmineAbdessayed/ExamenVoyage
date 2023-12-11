package com.example.abdessayedamineexblanc.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Vol {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  Long idVol;
        private LocalDate dateDepart;
        private LocalDate dateArrive;

        @ManyToOne
        private Aeroport aeroport;

        @OneToMany(mappedBy = "vol")
         private  List<Reservation> reservation;




}
