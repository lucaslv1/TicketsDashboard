package smartcon.dashboard2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import smartcon.dashboard2.model.Module;


public interface ModuleRepository extends JpaRepository<Module, Long>{
	
}
