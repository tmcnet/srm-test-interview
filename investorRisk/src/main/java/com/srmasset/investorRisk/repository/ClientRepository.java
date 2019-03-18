package com.srmasset.investorRisk.repository;

import org.springframework.data.repository.CrudRepository;

import com.srmasset.investorRisk.domain.Client;

/**
 * A Repository class.
 * Responsible to make access with database using CRUD operations.
 * 
 * @author Thiago Melo (falecom@thiagomelo.com.br)
 */
public interface ClientRepository extends CrudRepository<Client, Long> {

}
