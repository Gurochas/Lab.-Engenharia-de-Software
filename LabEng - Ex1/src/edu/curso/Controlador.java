package edu.curso;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

	@GetMapping("/hello")
	public String hello() {
		
		return "index";
	}
	
	@GetMapping("/medico")
		public ModelAndView medico() {
			
			Medico m1 = new Medico();
			m1.setCrm("2742");
			m1.setEspecialidade("Dematologista - Medicão auau");
			m1.setNome("Josenildo Santana Pinto");
			
			Medico m2 = new Medico();
			m2.setCrm("001");
			m2.setEspecialidade("Otorrinolaringologista - Médico meio forte");
			m2.setNome("Adalberto Cardoso Brito ll");
			
			Medico m3 = new Medico();
			m3.setCrm("2130");
			m3.setEspecialidade("Pediatra - Médico meio fraco");
			m3.setNome("Ricarinho Augusto Ludgero");
			
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("medico");
			mv.addObject("medico1", m1);
			mv.addObject("medico2", m2);
			mv.addObject("medico3", m3);
			return mv;
		}
	
	@GetMapping("/agendamentos")
	public ModelAndView agendamentos() {
		
		
		Cliente c1 = new Cliente();
		c1.setCpf("02");
		c1.setNome("Ronival Denilson Murilo Silva");
		c1.setDataag("13/01/2021");
		
		Cliente c2 = new Cliente();
		c2.setCpf("01");
		c2.setNome("Ronivan Fontanes de Venildo");
		c2.setDataag("13/01/2021");
		
		Cliente c3 = new Cliente();
		c3.setCpf("08765931315");
		c3.setNome("Ronivon do Carmo Santos");
		c3.setDataag("13/01/2021");
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("agendamentos");
		mv.addObject("cliente1",c1);
		mv.addObject("cliente2",c2);
		mv.addObject("cliente3",c3);
		return mv;
	}
}
