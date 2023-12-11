package com.example.abdessayedamineexblanc.Services;

import com.example.abdessayedamineexblanc.Entities.*;
import com.example.abdessayedamineexblanc.Repository.ReservationRepository;
import com.example.abdessayedamineexblanc.Repository.VolRepository;
import com.example.abdessayedamineexblanc.Repository.VoyageurRepository;
import jakarta.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ServiceExamenImpl implements ServiceExamen {

    @Autowired
    VolRepository volRepository;

    @Autowired
    VoyageurRepository voyageurRepository;

    @Autowired
    ReservationRepository reservationRepository;
    @Override
    public String AjouterVolETAeroport(Vol vol) {
         List<Vol> arrive=new ArrayList<>();
         List<Vol> depart=new ArrayList<>();



        volRepository.save(vol);


        return "le vol est ajouté avec succes" ;
    }

    @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {

        return voyageurRepository.saveAll(voyageurs);
    }
/*
    @Override
    public String reserverVol(int voyageurID, int vollId, ClassPlace classPlace) {
        int nbmaxplaceBusiness=2;
        int nbmaxplaceECONIMIQUE=3;

        Voyageur v = voyageurRepository.findById(voyageurID).orElse(null);

        Vol vol= volRepository.findById(vollId).orElse(null);

            Reservation reservations = new Reservation();
            reservations.setVoyageur(v);
            reservations.setVol(vol);

            reservations.setIdReservation(reservations.getClassPlace(),vol.getIdVol(),v.getIdVoyageur());
            reservations.setEtatReservation(EtatReservation.ENCOURS);
            if ()






        return null;
    }


 */
    @Override
    public Reservation confirmerReservation(String resId) {


        Reservation reservationvoyageur=reservationRepository.findById(resId).orElse(null);
        List<Reservation>reservations=reservationRepository.findAll();
        Reservation resultat = null;

        for(Reservation r :reservations){

            if(!(r.getIdReservation().equals(reservationvoyageur))){

                resultat=r;

            }



        }
        return resultat;
    }

    /*
    @Override
    public Map<Integer, List<Voyageur>> getVoyageursByVol() {


        List<Voyageur> voyageurs=voyageurRepository.findAll();
        List<Reservation> reservations=reservationRepository.findAll();
        List<Voyageur> ResultatVoyageur = new ArrayList<>();


       for( Reservation r: reservations){

           if (r.getEtatReservation().equals(EtatReservation.CONFIRMEE)){

               r.getVoyageur();
               ResultatVoyageur.add(r);

           }
       }



        return        Map<Vol,ResultatVoyageur> ;
        ;
    }
/*

//




}







