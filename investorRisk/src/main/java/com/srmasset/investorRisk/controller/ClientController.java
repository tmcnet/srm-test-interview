package com.srmasset.investorRisk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srmasset.investorRisk.domain.Client;
import com.srmasset.investorRisk.service.ClientService;

/**
 * A Controller class.
 * Responsible to interact with client requests and responses on the server-side.
 * 
 * @author Thiago Melo (falecom@thiagomelo.com.br)
 */
@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*")
@RestController
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@PostMapping(path = "/client/add", consumes = "application/json", produces = "application/json")
	public Client addClient(@RequestBody Client newClient) {
		
		return service.save(newClient);
	}
}
