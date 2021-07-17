package com.springboot.fundamentals.Repository;

import com.springboot.fundamentals.Entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
