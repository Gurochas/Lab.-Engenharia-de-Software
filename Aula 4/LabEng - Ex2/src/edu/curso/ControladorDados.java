package edu.curso;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorDados {
	
	@RequestMapping(value="/medicosJSON",
			method=RequestMethod.GET,
			produces=MediaType.APPLICATION_PROBLEM_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<List <Medico>> dadosMedico(HttpServletResponse response) {
		response.addHeader("Content-Type", "application/json");
		
		Medico m1 = new Medico();
		m1.setCrm("2242");
		m1.setEspecialidade("Cantora - Até que canta");
		m1.setNome("Josemilda Luiz Correia Lima Pereira - DKZ");
		
		Medico m2 = new Medico();
		m2.setCrm("011");
		m2.setEspecialidade("Leitera - Dona de fazenda");
		m2.setNome("Ana Rosangëla Leite Silva - Leitinho");
		
		Medico m3 = new Medico();
		m3.setCrm("2170");
		m3.setEspecialidade("Humorista - Faz os oto ri");
		m3.setNome("Carmem Lucinda Visnadi Constantino Ri Alto - Ela ri bem alto");
		

		List<Medico> medicos = new ArrayList<Medico>();
		medicos.add(m1);
		medicos.add(m2);
		medicos.add(m3);
		return ResponseEntity.ok(medicos);
	}
}