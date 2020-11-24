package br.com.microsservice.loja.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.microsservice.loja.model.dto.InfoEntregaDTO;
import br.com.microsservice.loja.model.dto.VoucherDTO;

@FeignClient("transportador")
public interface TransportadorClient {

	@PostMapping("/entrega")
	public VoucherDTO reservaEntrega(InfoEntregaDTO pedidoDTO);
	
}
