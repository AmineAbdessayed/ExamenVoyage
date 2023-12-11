package com.example.abdessayedamineexblanc.Repository;

import com.example.abdessayedamineexblanc.Entities.EtatReservation;
import com.example.abdessayedamineexblanc.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository  extends JpaRepository<Reservation,String> {


    Reservation findByEtatReservation_Confirmee( );
}
