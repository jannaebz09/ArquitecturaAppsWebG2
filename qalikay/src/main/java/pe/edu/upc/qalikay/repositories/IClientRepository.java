package pe.edu.upc.qalikay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.qalikay.entities.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client, Integer> {
}
