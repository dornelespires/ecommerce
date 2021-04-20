package com.andre.ecommerce.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDto {
	
	private long id;
	private DadosGeraisDto dadosGerais;
	private EnderecoDto endereco;

}
