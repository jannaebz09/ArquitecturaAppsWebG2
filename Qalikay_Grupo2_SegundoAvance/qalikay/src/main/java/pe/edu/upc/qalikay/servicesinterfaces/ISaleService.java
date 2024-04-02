package pe.edu.upc.qalikay.servicesinterfaces;

import pe.edu.upc.qalikay.entities.Sale;

import java.util.List;

public interface ISaleService {
    public void insert(Sale sale);
    public List<Sale> list();
}
