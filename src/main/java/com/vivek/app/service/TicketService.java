package com.vivek.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.app.entity.Ticket;

@Service
public class TicketService {

	@Autowired
	private TicketDao ticketDao;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketDao.save(ticket);
	}

	public Ticket getTicket(Integer ticketId) {
		// TODO Auto-generated method stub
		return ticketDao.findOne(ticketId);
	}

	public List<Ticket> getTicketByDestination(String station) {
		return ticketDao.findBySourceStation(station);
		// TODO Auto-generated method stub
		
	}
	
}
