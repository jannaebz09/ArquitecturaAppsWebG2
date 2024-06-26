package pe.edu.upc.qalikay.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.qalikay.entities.Sale;
import pe.edu.upc.qalikay.repositories.ISaleRepository;
import pe.edu.upc.qalikay.servicesinterfaces.ISaleService;

import java.util.List;

@Service
public class SaleServiceImplement implements ISaleService {
    @Autowired
    private ISaleRepository sR;
    @Override
    public void insert(Sale sale){sR.save(sale);}

    @Override
    public List<Sale> list(){
        return sR.findAll();
    }
}
