package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entity.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
}
