package smartcon.dashboard2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
import smartcon.dashboard2.model.Client;
import smartcon.dashboard2.service.ClienteService;
import smartcon.dashboard2.service.ModuleService;
import smartcon.dashboard2.service.TicketService;
import smartcon.dashboard2.model.Module;
import smartcon.dashboard2.model.Ticket;

@Slf4j
@SpringBootTest
class TicketServiceTest {
	
	private TicketService ticketService;
	private ModuleService moduloService;
	private ClienteService clienteService;
	
	@Autowired
	public TicketServiceTest(TicketService ticketService, ModuleService moduloService, ClienteService clienteService) {
		this.ticketService = ticketService;
		this.moduloService = moduloService;
		this.clienteService = clienteService;
	}




	@Test
	void creationTest() {
		
		//for de 500 tickets 
		List<String> titulos = new ArrayList<String>();
		List<LocalDate> datas = new ArrayList<LocalDate>();
		List<Integer> inteiros = new ArrayList<Integer>();
		
		List<Client> clients = clienteService.findAll();
		List<Module> modules = moduloService.findAll();
		
		titulos.add("Aenean aliquam molestie");
		titulos.add("Mussum Ipsum cacilds vidis litro");
		titulos.add("Praesent malesuada urna nisi");
		titulos.add("Sapien in monti palavris");
		titulos.add("Interessantiss quisso pudia");
		titulos.add("In elementis mé pra quem");
		titulos.add("Em pé sem cair deitado");
		titulos.add("Sapien in monti palavris");
		titulos.add("Político agrega valor ao");
		titulos.add("Procedimentos normalmente adotados");
		titulos.add("Desenvolvimento contínuo de distintas formas");
		titulos.add("Regras de conduta normativas");
		titulos.add("Podemos já vislumbrar o modo pelo qual");
		titulos.add("A valorização de fatores subjetivos");
		titulos.add("Modos de operação convencionais");
		titulos.add("Aprovar a manutenção do processo");
		titulos.add("Nunca é demais lembrar");
		titulos.add("O empenho em analisar o julgamento");
		
		datas.add(LocalDate.of(2020, 05, 20));
		datas.add(LocalDate.of(2019, 02, 10));
		datas.add(LocalDate.of(2017, 06, 15));
		datas.add(LocalDate.of(2021, 03, 05));
		datas.add(LocalDate.of(2020, 04, 23));
		datas.add(LocalDate.of(2022, 01, 30));
		datas.add(LocalDate.of(2015, 02, 07));
		datas.add(LocalDate.of(2017, 04, 25));
		datas.add(LocalDate.of(2016, 07, 20));
		datas.add(LocalDate.of(2016, 12, 05));
		datas.add(LocalDate.of(2017, 01, 02));
		datas.add(LocalDate.of(2019, 07, 04));
		datas.add(LocalDate.of(2020, 12, 28));
		datas.add(LocalDate.of(2021, 10, 29));
		datas.add(LocalDate.of(2020, 02, 18));
		datas.add(LocalDate.of(2019, 11, 20));
		datas.add(LocalDate.of(2021, 10, 07));
		datas.add(LocalDate.of(2018, 07, 10));
		datas.add(LocalDate.of(2017, 05, 29));
		datas.add(LocalDate.of(2018, 05, 10));
		datas.add(LocalDate.of(2019, 11, 15));
		datas.add(LocalDate.of(2020, 05, 13));
		datas.add(LocalDate.of(2019, 10, 24));
		datas.add(LocalDate.of(2021, 07, 06));
		datas.add(LocalDate.of(2018, 06, 10));
		datas.add(LocalDate.of(2017, 03, 29));
		datas.add(LocalDate.of(2020, 03, 20));
		datas.add(LocalDate.of(2019, 03, 10));
		datas.add(LocalDate.of(2017, 03, 15));
		datas.add(LocalDate.of(2021, 10, 05));
		datas.add(LocalDate.of(2020, 03, 23));
		datas.add(LocalDate.of(2022, 03, 30));
		datas.add(LocalDate.of(2015, 03, 07));
		datas.add(LocalDate.of(2017, 03, 25));
		datas.add(LocalDate.of(2016, 03, 20));
		datas.add(LocalDate.of(2016, 03, 05));
		datas.add(LocalDate.of(2017, 03, 02));
		datas.add(LocalDate.of(2019, 03, 04));
		datas.add(LocalDate.of(2020, 03, 28));
		datas.add(LocalDate.of(2021, 03, 29));
		datas.add(LocalDate.of(2020, 03, 18));
		datas.add(LocalDate.of(2019, 03, 20));
		datas.add(LocalDate.of(2021, 03, 07));
		datas.add(LocalDate.of(2018, 03, 10));
		datas.add(LocalDate.of(2017, 03, 29));
		datas.add(LocalDate.of(2018, 03, 10));
		datas.add(LocalDate.of(2019, 03, 15));
		datas.add(LocalDate.of(2020, 03, 13));
		datas.add(LocalDate.of(2019, 03, 24));
		datas.add(LocalDate.of(2021, 03, 06));
		datas.add(LocalDate.of(2018, 03, 10));
		datas.add(LocalDate.of(2017, 10, 29));
		datas.add(LocalDate.of(2020, 04, 20));
		datas.add(LocalDate.of(2019, 04, 10));
		datas.add(LocalDate.of(2017, 04, 15));
		datas.add(LocalDate.of(2021, 04, 05));
		datas.add(LocalDate.of(2020, 10, 23));
		datas.add(LocalDate.of(2022, 04, 30));
		datas.add(LocalDate.of(2015, 04, 07));
		datas.add(LocalDate.of(2017, 10, 25));
		datas.add(LocalDate.of(2016, 04, 20));
		datas.add(LocalDate.of(2016, 04, 05));
		datas.add(LocalDate.of(2017, 04, 02));
		datas.add(LocalDate.of(2019, 04, 04));
		datas.add(LocalDate.of(2020, 04, 28));
		datas.add(LocalDate.of(2021, 04, 29));
		datas.add(LocalDate.of(2020, 04, 18));
		datas.add(LocalDate.of(2019, 04, 20));
		datas.add(LocalDate.of(2021, 04, 07));
		datas.add(LocalDate.of(2018, 04, 10));
		datas.add(LocalDate.of(2017, 04, 29));
		datas.add(LocalDate.of(2018, 04, 10));
		datas.add(LocalDate.of(2019, 04, 15));
		datas.add(LocalDate.of(2020, 04, 13));
		datas.add(LocalDate.of(2019, 04, 24));
		datas.add(LocalDate.of(2021, 04, 06));
		datas.add(LocalDate.of(2018, 04, 10));
		datas.add(LocalDate.of(2017, 04, 29));
		
		inteiros.add(2);
		inteiros.add(3);
		inteiros.add(4);
		inteiros.add(5);
		inteiros.add(6);
		inteiros.add(7);
		inteiros.add(8);
		inteiros.add(9);
		inteiros.add(10);
		inteiros.add(11);
		inteiros.add(12);
		inteiros.add(13);
		inteiros.add(14);
		inteiros.add(15);
		inteiros.add(16);
		inteiros.add(17);
		inteiros.add(18);
		
		int tamanho = 200;
		for(int i=0; i<tamanho; i++) {
	         
			int indexT = (int)(Math.random() * titulos.size());
			int indexD = (int)(Math.random() * datas.size());
			int indexI = (int)(Math.random() * inteiros.size());
			int indexC = (int)(Math.random() * clients.size());
			int indexM = (int)(Math.random() * modules.size());
	        
			
	        ticketService.save(new Ticket(null, titulos.get(indexT), clients.get(indexC), modules.get(indexM), datas.get(indexD),
	        												datas.get(indexD).plusDays(indexI)));
		}
		
		List<Ticket> tickets = ticketService.findAll();
		
		log.info("CLIENTES: " + clients);
		log.info("MODULOS: " + modules);
		log.info("TICKETS: " + tickets);
		
		//criar uma lista de strings para representar os possiveis titulos do ticket
		//criar uma lista de inteiros com os ids dos clientes
		//criar uma lista de inteiros com os ids dos modulos
		
		//gerar um ramdom de 0 até o size-1 do array de possiveis titulos
		//pegar o titulo na posição do ramdom gerado
		
		//gerar um radom de 0 até o size-1 do array de ids de clientes
		//pegar o id na posição do ramdom gerado
		
		//gerar um radom de 0 até o size-1 do array de ids de modulos
		//pegar o id na posição do ramdom gerado
		
		//criar um cliente com o id recuperado
		//criar um modulo com o id recuperado
		//criar um ticket com o cliente, modulo criados e com o titulo recuperado
		
		//ticketService.save(null);
	
			
	}

}
