package smartcon.dashboard2.service.Impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import smartcon.dashboard2.Repository.ModuleRepository;
import smartcon.dashboard2.service.ModuleService;
import smartcon.dashboard2.model.Module;

@Service
public class ModuleServiceImpl extends CrudServiceImpl<Module, Long> 
	implements ModuleService {

	private ModuleRepository moduleRepository;
	
	public ModuleServiceImpl(ModuleRepository moduleRepository) {
		this.moduleRepository = moduleRepository;
	}
	
	@Override
	protected JpaRepository<Module, Long> getRepository() {
		return this.moduleRepository;
	}

	@Override
	public List<Module> findByOpeningDate(LocalDate begin, LocalDate end) {
		// TODO Auto-generated method stub
		return null;
	}

}
