package br.com.microsservice.loja.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class CompraDTO {
	
	@JsonIgnore
	private Long compraId;
	
	private List<ItemCompraDTO> itens;
	
	private EnderecoDTO endereco;

}
