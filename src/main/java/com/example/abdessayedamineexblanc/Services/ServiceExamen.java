package com.example.abdessayedamineexblanc.Services;

import com.example.abdessayedamineexblanc.Entities.ClassPlace;
import com.example.abdessayedamineexblanc.Entities.Reservation;
import com.example.abdessayedamineexblanc.Entities.Vol;
import com.example.abdessayedamineexblanc.Entities.Voyageur;

import java.util.List;
import java.util.Map;

public interface ServiceExamen {


    String AjouterVolETAeroport(Vol vol);

    List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs);
    String reserverVol(int voyageurID, int vollId, ClassPlace classPlace);

    Reservation confirmerReservation(String resId);

    Map<Integer,List<Voyageur>> getVoyageursByVol();
}
