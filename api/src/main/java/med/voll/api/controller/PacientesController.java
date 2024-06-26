package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.pacientes.DadosCadastroPaciente;
import med.voll.api.pacientes.Paciente;
import med.voll.api.pacientes.PacientesRepository;

@RestController
@RequestMapping("/pacientes")
public class PacientesController {

	
	@Autowired
	private PacientesRepository repo;
	
	@PostMapping()
	@Transactional
	public void cadastrarPaciente(@RequestBody DadosCadastroPaciente dadosPaciente) {
		repo.save(new Paciente(dadosPaciente));
	}
}