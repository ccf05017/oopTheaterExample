package com.jbj.theaterExample;

public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

//    public Bag getBag() {
//        return bag;
//    }

    public Long buy(Ticket ticket) {
        if (this.bag.hasInvitation()) {
            // 초대장이 있는 경우
            this.bag.setTicket(ticket);
            return 0L;
        } else {
            // 초대장이 없는 경우
            this.bag.setTicket(ticket);
            this.bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
