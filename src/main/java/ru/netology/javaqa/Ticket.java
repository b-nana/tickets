package ru.netology.javaqa;

public class Ticket implements Comparable<Ticket> {

    protected int id;
    protected int price;
    protected String airportFrom;
    protected String airportTo;
    protected int time;

    public Ticket(int id, int price, String airportFrom, String airportTo, int time) {

        this.id = id;
        this.price = price;
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
        this.time = time;

    }

    public int getId() {
        return id;
    }

    public String getFrom() {
        return airportFrom;
    }

    public String getTo() {
        return airportTo;
    }


    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        }
        if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
