package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.qalikay.dtos.ClientDTO;
import pe.edu.upc.qalikay.entities.Client;
import pe.edu.upc.qalikay.servicesinterfaces.IClientService;

import java.util.List;
import java.util.stream.Collectors;


@RequestMapping("/clients")
@RestController

public class ClientController {
    @Autowired
    private IClientService sS;
    @PostMapping
    public void registrar (@RequestBody ClientDTO s) {
        ModelMapper m=new ModelMapper();
        Client sh=m.map(s,Client.class);
        sS.insert(sh);
    }
    @GetMapping
    public List<ClientDTO> list(){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ClientDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id) {
        sS.delete(id);
    }
    @DeleteMapping
    public ClientDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        ClientDTO dto=m.map(sS.listId(id),ClientDTO.class);
        return dto;
    }

}
