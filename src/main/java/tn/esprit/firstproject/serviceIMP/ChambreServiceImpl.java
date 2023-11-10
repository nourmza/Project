package tn.esprit.firstproject.serviceIMP;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entity.Chambre;
import tn.esprit.firstproject.repositories.ChambreRepository;
import tn.esprit.firstproject.serviceInterface.ChambreInterface;

import java.util.List;
@AllArgsConstructor
@Service
public class ChambreServiceImpl implements ChambreInterface {
    ChambreRepository chambreRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(Integer idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }
}
