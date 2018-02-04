package com.vivek.app.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vivek.app.entity.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

	List<Ticket> findBySourceStation(String station);
	
//	List<Ticket> findByDestinationStation(String station);

}
