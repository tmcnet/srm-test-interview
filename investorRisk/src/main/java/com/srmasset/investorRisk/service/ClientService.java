package com.srmasset.investorRisk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srmasset.investorRisk.domain.Client;
import com.srmasset.investorRisk.repository.ClientRepository;

/**
 * Business logic class.
 * 
 * @author Thiago Melo (falecom@thiagomelo.com.br)
 */
@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public Client save(Client newClient) {
		
		this.assessInterestRate(newClient);
		
		return this.repository.save(newClient);
	}
	
	private void assessInterestRate(Client client) {
		
		switch (client.getRisk()) {
		case "B":
			client.setInterestRate(10);
			break;
			
		case "C":
			client.setInterestRate(20);
			break;

		default:
			break;
		}
	}
}
