package med.voll.api.domain.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
		
		@NotBlank(message="O campo Logradouro é obrigatório!")
		String logradouro, 
		
		@NotBlank(message="O campo Bairro é obrigatório!")
		String bairro, 
		
		@NotBlank(message="O campo CEP é obrigatório!")
		@Pattern(regexp = "\\d{8}")
		String cep, 
		
		@NotBlank(message="O campo Cidade é obrigatório!")
		String cidade, 
		
		@NotBlank(message="O campo UF é obrigatório!")
		String uf, 
		
		String complemento, 
		
		String numero) {

}
