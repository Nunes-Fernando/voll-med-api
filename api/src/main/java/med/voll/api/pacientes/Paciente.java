package med.voll.api.pacientes;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import med.voll.api.endereco.ModeloEnderecoPaciente;

@Entity
@Table(name = "tb_paciente")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	
	private String nome;
	private String email;
	private String cpf;
	
	@Embedded
	private ModeloEnderecoPaciente endereco;
	

	public Paciente() {
	}

	public Paciente(DadosCadastroPaciente dadosPaciente) {
		this.nome = dadosPaciente.nome();;
		this.email = dadosPaciente.email();
		this.cpf = dadosPaciente.cpf();
		this.endereco = new ModeloEnderecoPaciente(dadosPaciente);
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ModeloEnderecoPaciente getEndereco() {
		return endereco;
	}

	public void setEndereco(ModeloEnderecoPaciente endereco) {
		this.endereco = endereco;
	} 
	
	public void atualizarPaciente(AtualizaDadosPaciente paciente) {
		if(paciente.nome() != null) {
			this.nome = paciente.nome();
		}
		
		if(paciente.email() != null) {
			this.email = paciente.email();
		}
		
		if(paciente.endereco() != null) {
			this.endereco.atualizarEnderecoPaciente(paciente.endereco());
		}
	}
}
