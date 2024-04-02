package pe.edu.upc.qalikay.servicesinterfaces;

import pe.edu.upc.qalikay.entities.Client;

import java.util.List;

public interface IClientService {
    public void insert(Client client);
    public List<Client> list();
}
