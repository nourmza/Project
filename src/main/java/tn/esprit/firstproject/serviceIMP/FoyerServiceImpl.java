package tn.esprit.firstproject.serviceIMP;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entity.Foyer;
import tn.esprit.firstproject.repositories.FoyerRepository;
import tn.esprit.firstproject.serviceInterface.FoyerInterface;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerServiceImpl implements FoyerInterface {
    FoyerRepository foyerRepository;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(Integer idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(Integer idFoyer) {
        foyerRepository.deleteById(idFoyer);

    }
}
