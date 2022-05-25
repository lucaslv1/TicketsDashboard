package smartcon.dashboard2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import smartcon.dashboard2.model.Module;
import smartcon.dashboard2.service.ModuleService;

@SpringBootTest
class ModuleServiceTest {

	private ModuleService moduloService;

	@Autowired
	public ModuleServiceTest(ModuleService moduloService) {
		this.moduloService = moduloService;
	}

	@Test
	void CreationTest() {
		List<String> moduleNames = new ArrayList<String>();

		moduleNames.add("Financeiro");
		moduleNames.add("Vendas");
		moduleNames.add("Expedição");
		moduleNames.add("Foguetes");

		moduleNames.forEach(moduleName -> moduloService.save(new Module(null, moduleName)));
	}
	
	@Test
	void listAll() {
		Iterable<Module> modules = moduloService.findAll();
		assertEquals(((Collection<Module>) modules).size(), 4);
	}

}
