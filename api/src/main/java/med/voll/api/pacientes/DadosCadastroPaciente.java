package med.voll.api.pacientes;

import med.voll.api.endereco.EnderecoPaciente;

public record DadosCadastroPaciente(
		String nome,
		String email, 
		String telefone, 
		String cpf, 
		EnderecoPaciente endereco) {
}
