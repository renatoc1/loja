package br.com.microsservice.loja.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Compra {

	private Long pedidoId;
	
	private Integer tempoDePreparo;
	
	private String enderecoDestino;
	
}
