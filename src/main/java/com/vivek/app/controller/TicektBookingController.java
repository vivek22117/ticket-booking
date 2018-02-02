package com.vivek.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.app.entity.Ticket;
import com.vivek.app.service.TicketService;

@RestController
@RequestMapping(value="/api/ticket")
public class TicektBookingController {

	@Autowired
	private TicketService service;
	
	@PostMapping(value="/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return service.createTicket(ticket);
	}
	
	@GetMapping(value="/get/{ticketId}")
	private Ticket getTicket(@PathVariable("ticketId") Integer ticketId){
		return service.getTicket(ticketId);
	}
	
	
}
