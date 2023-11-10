package tn.esprit.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entity.Chambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Integer> {
    List<Chambre> findAllByNumeroChambreIn(List<Long> numChambre);

}
