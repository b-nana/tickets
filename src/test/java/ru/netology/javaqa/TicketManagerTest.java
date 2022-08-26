package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TicketManagerTest {

    @Test

    public void shouldSearch() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, 10_000, "DME", "EGO", 120);
        Ticket ticket2 = new Ticket(2, 15_000, "OGZ", "LED", 180);
        Ticket ticket3 = new Ticket(3, 7_000, "DME", "LED", 30);
        Ticket ticket4 = new Ticket(4, 8_000, "DME", "LED", 35);
        Ticket ticket5 = new Ticket(5, 7_500, "LED", "DME", 30);

        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);

        Ticket[] expected = {ticket3, ticket4};
        Ticket[] actual = manager.findAll("DME", "LED");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldSearchAndSortCorrectly() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, 10_000, "DME", "EGO", 120);
        Ticket ticket2 = new Ticket(2, 15_000, "OGZ", "LED", 180);
        Ticket ticket3 = new Ticket(3, 8_000, "DME", "LED", 30);
        Ticket ticket4 = new Ticket(4, 7_000, "DME", "LED", 35);
        Ticket ticket5 = new Ticket(5, 7_500, "LED", "DME", 30);

        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);

        Ticket[] expected = {ticket4, ticket3};
        Ticket[] actual = manager.findAll("DME", "LED");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldSearchAndSortIfEquals() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, 10_000, "DME", "EGO", 120);
        Ticket ticket2 = new Ticket(2, 15_000, "OGZ", "LED", 180);
        Ticket ticket3 = new Ticket(3, 7_000, "DME", "LED", 30);
        Ticket ticket4 = new Ticket(4, 7_000, "DME", "LED", 35);
        Ticket ticket5 = new Ticket(5, 7_500, "LED", "DME", 30);

        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);

        Ticket[] expected = {ticket3, ticket4};
        Ticket[] actual = manager.findAll("DME", "LED");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldSearchIfNone() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, 10_000, "DME", "EGO", 120);
        Ticket ticket2 = new Ticket(2, 15_000, "OGZ", "LED", 180);
        Ticket ticket3 = new Ticket(3, 7_000, "DME", "LED", 30);
        Ticket ticket4 = new Ticket(4, 7_000, "DME", "LED", 35);
        Ticket ticket5 = new Ticket(5, 7_500, "LED", "DME", 30);

        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("DME", "OGZ");

        Assertions.assertArrayEquals(expected, actual);

    }


}
