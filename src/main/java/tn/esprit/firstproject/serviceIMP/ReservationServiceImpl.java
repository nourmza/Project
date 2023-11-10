package tn.esprit.firstproject.serviceIMP;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entity.Reservation;
import tn.esprit.firstproject.repositories.ReservationRepository;
import tn.esprit.firstproject.serviceInterface.ReservationInterface;

import java.util.List;
@AllArgsConstructor
@Service
public class ReservationServiceImpl implements ReservationInterface {
    ReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(Integer idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }
}
