package com.gce.patterns.movietickets.controllers;

import com.gce.patterns.movietickets.DAO.TicketDAO;
import com.gce.patterns.movietickets.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TicketController {

    @Autowired
    private TicketDAO dao;

    @GetMapping("/showCreateTicket")
    public String showCreateTicket() {
        return "createTicket";
    }

    @PostMapping("/createTicket")
    public String createTicket(Ticket ticket, ModelMap modelMap) {
        dao.create(ticket);
        modelMap.addAttribute("msg", "Ticket Purchased successfully");
        return "createTicket";
    }
}
