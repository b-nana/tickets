package ru.netology.javaqa;

import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    public int compare(Ticket o1, Ticket o2) {
        if (o1.time < o2.price) {
            return -1;
        }
        if (o1.price > o2.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
