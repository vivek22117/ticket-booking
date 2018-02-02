package com.vivek.app.service;

import org.springframework.data.repository.CrudRepository;

import com.vivek.app.entity.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
