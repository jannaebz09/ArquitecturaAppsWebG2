package pe.edu.upc.qalikay.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.qalikay.entities.Sp_recipe;
import pe.edu.upc.qalikay.repositories.ISp_recipeRepository;
import pe.edu.upc.qalikay.servicesinterfaces.ISp_recipeService;

import java.util.List;

@Service
public class Sp_recipeServiceImplement implements ISp_recipeService {


    @Override
    public void insert(Sp_recipe sp_recipe) {

    }

    @Override
    public List<Sp_recipe> list() {
        return null;
    }
}
