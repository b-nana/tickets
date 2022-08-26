package ru.netology.javaqa;

import java.util.Arrays;

public class TicketManager {

    protected TicketRepository repository;

    public TicketManager(TicketRepository repo) {
        this.repository = repo;
    }

    public Ticket[] findAll(String from, String to) {
        int newLength = 0;
        Ticket[] tickets = repository.getTickets();

        Ticket[] tmp = new Ticket[tickets.length];
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i].getFrom() == from && tickets[i].getTo() == to) {
                tmp[newLength] = tickets[i];
                newLength++;
            }
        }
        Ticket[] result = new Ticket[newLength];
        for (int i = 0; i < newLength; i++) {

            result[i] = tmp[i];

        }

        Arrays.sort(result);

        return result;
    }
}
