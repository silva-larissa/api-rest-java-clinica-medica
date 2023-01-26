package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente (

	@NotBlank(message="O campo Nome é obrigatório!")
	String nome, 
	
	@NotBlank(message="O campo e-mail é obrigatório!")
	@Email
	String email, 
	
	@NotBlank(message="O campo Telefone é obrigatório!")
	String telefone,
	
	@NotBlank(message="O campo CPF é obrigatório!")
	@Pattern(regexp = "\\d{11}")
	String cpf, 
	
	@NotNull(message="O campo Endereco é obrigatório!")
	@Valid
	DadosEndereco endereco) {

}

