package com.algaworks.compras;

import org.springframework.stereotype.Component;

@Component
public class ImpressoraHP implements Impressora {

	public void imprimir(String documento) {
		System.out.println(">>>> Imprimindo na HP o " + documento);
		// TODO Auto-generated method stub		
		
	}
	
	
}