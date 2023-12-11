package com.example.abdessayedamineexblanc.Controllers;

import com.example.abdessayedamineexblanc.Entities.ClassPlace;
import com.example.abdessayedamineexblanc.Entities.Vol;
import com.example.abdessayedamineexblanc.Entities.Voyageur;
import com.example.abdessayedamineexblanc.Services.ServiceExamen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExamenController {


    @Autowired
    ServiceExamen serviceExamen;

    @PostMapping("/ajouterVoletAeroport")
    String ajouterVolEtAeroport(@RequestBody Vol vol){

        serviceExamen.AjouterVolETAeroport(vol);

       return "le vol est ajouter avec succes" ;
    }

    @PostMapping("/ajouterVoyageur")
    List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs)

    {
        return  serviceExamen.ajouterVoyageurs(voyageurs);


    }

    @PostMapping("/reserverVol")
String reserverVol(@PathVariable int voyageurId, @PathVariable int volId, ClassPlace classPlace)
    {
        return  serviceExamen.reserverVol(voyageurId, volId,classPlace);


    }
}



