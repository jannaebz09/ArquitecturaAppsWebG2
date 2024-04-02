package pe.edu.upc.qalikay.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.qalikay.entities.Client;
import pe.edu.upc.qalikay.repositories.IClientRepository;
import pe.edu.upc.qalikay.servicesinterfaces.IClientService;

import java.util.List;

@Service
public class ClientServiceImplement implements IClientService {
    @Autowired
    private IClientRepository sR;

    @Override
    public void insert(Client client){sR.save(client);}
    @Override
    public List<Client> list(){return sR.findAll();}
}
