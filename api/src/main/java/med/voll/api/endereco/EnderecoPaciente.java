package med.voll.api.endereco;

public record EnderecoPaciente(
		String logradouro, 
		String numero, 
		String complemento, 
		String bairro, 
		String cidade, 
		String UF, 
		String cep ) {
}
