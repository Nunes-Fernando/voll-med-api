package med.voll.api.pacientes;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.EnderecoPaciente;

public record AtualizaDadosPaciente(
		@NotNull 
		Integer id, 
		String nome, 
		String email, 
		EnderecoPaciente endereco) {
}
