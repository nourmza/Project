package tn.esprit.firstproject.serviceInterface;

import tn.esprit.firstproject.entity.Reservation;

import java.util.List;

public interface ReservationInterface {
    List<Reservation> retrieveAllReservation();
    Reservation addReservation (Reservation res);
    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (Integer idReservation);
}
