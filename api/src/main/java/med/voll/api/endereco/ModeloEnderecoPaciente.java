package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import med.voll.api.pacientes.DadosCadastroPaciente;

@Embeddable
public class ModeloEnderecoPaciente {
	
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String UF;  
	private String CEP;
	
	
	public ModeloEnderecoPaciente() {
	}


	public ModeloEnderecoPaciente(DadosCadastroPaciente dadosPaciente) {
		this.logradouro = dadosPaciente.endereco().logradouro();
		this.numero = dadosPaciente.endereco().numero();
		this.complemento =  dadosPaciente.endereco().complemento();
		this.bairro =  dadosPaciente.endereco().bairro();
		this.cidade =  dadosPaciente.endereco().cidade();
		this.UF =  dadosPaciente.endereco().UF();
		this.CEP =  dadosPaciente.endereco().cep();
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUF() {
		return UF;
	}


	public void setUF(String uf) {
		UF = uf;
	}


	public String getCEP() {
		return CEP;
	}


	public void setCEP(String cep) {
		CEP = cep;
	}
	
	public void atualizarEnderecoPaciente(EnderecoPaciente paciente) {
		if(logradouro != null) {
			this.logradouro = paciente.logradouro();
		}
		
		if(numero != null) {
			this.numero = paciente.numero();
		}
		
		if(complemento != null) {
			this.complemento = paciente.complemento();
		}
		
		if(bairro != null) {
			this.bairro = paciente.bairro();
		}
		
		if(cidade != null) {
			this.cidade = paciente.cidade();
		}
		
		if(UF != null) {
			this.UF = paciente.UF();
		}
		
		if(CEP != null) {
			this.CEP = paciente.cep();
		}
	}
	
}
