package smartcon.dashboard2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import smartcon.dashboard2.model.Module;
import smartcon.dashboard2.service.CrudService;
import smartcon.dashboard2.service.ModuleService;

@RestController
@RequestMapping("modules")
public class ModuloController extends CrudController<Module, Long> {

	@Autowired
	private ModuleService moduloService;

	@Override
	protected CrudService<Module, Long> getService() {
		return this.moduloService;
	}

}
