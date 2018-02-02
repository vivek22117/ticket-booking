package com.vivek.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vivek.app.entity.Ticket;
import com.vivek.app.service.TicketService;

@SpringBootApplication
public class TicketBookingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TicketBookingApplication.class, args);
		
		TicketService service = context.getBean("ticketService", TicketService.class);
		
		Ticket ticket = new Ticket();
		ticket.setCustomerName("Varun");
		ticket.setDestinationStation("allahabad");
		ticket.setSourceStation("mumbai");
		ticket.setEmail("vijayh@gmail.com");
		
		service.createTicket(ticket);
	}
}
