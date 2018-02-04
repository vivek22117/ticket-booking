package com.vivek.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vivek.app.entity.Ticket;
import com.vivek.app.service.TicketService;

@SpringBootApplication
public class TicketBookingApplication implements CommandLineRunner {
	
	@Autowired
	private TicketService ticketService;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TicketBookingApplication.class, args);
		/*TicketService service = context.getBean("ticketService", TicketService.class);
		
		Ticket ticket = new Ticket();
		ticket.setCustomerName("somnath");
		ticket.setDestinationStation("bhopal");
		ticket.setSourceStation("rewa");
		ticket.setEmail("somnath@gmail.com");
		
		service.createTicket(ticket);*/
	}
	@Override
	public void run(String... arg0) throws Exception {
		getTicketByDestination();
		
	}
	
	private void getTicketByDestination() {
	       List<Ticket> tickets = ticketService.getTicketByDestination("pune");
	       tickets.forEach(System.out::println);
		
	}

}
