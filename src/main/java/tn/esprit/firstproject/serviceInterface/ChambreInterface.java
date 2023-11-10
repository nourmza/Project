package tn.esprit.firstproject.serviceInterface;

import tn.esprit.firstproject.entity.Bloc;
import tn.esprit.firstproject.entity.Chambre;

import java.util.List;

public interface ChambreInterface {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c); // ajouter l’équipe avec son détail

    Chambre updateChambre (Chambre c);

    Chambre retrieveChambre (Integer idChambre);
}
