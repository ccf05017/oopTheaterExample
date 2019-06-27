package com.jbj.theaterExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {

    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ...tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    // audience와의 의존성이 추가됨
    // 트레이드오프의 결과물
    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }
}
