package smartcon.dashboard2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import smartcon.dashboard2.model.Client;


public interface ClienteRepository extends JpaRepository<Client, Long> {

}
