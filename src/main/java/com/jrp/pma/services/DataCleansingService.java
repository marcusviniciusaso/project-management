package com.jrp.pma.services;

import org.springframework.stereotype.Service;

@Service
/*
 * @Service, @Repository e @Component são escaneados e criados no
 * start da aplicação da mesma forma. A diferença está mais para uma
 * questão de design. @Repository para quando estamos trabalhando com 
 * dados. @Service para serviços. @Component para um componente, algo 
 * reaproveitável da aplicação, que não se encaixa nos dois anteriores.
 */
public class DataCleansingService {

	public DataCleansingService() {
		super();
	}	
}
