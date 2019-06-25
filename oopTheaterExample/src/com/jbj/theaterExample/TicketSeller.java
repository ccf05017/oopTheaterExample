package com.jbj.theaterExample;

public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

//    없애버리고 자율적으로 접근할 것
//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

    public void sellTo(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            // 초대장이 있는 경우
            // 초대장이 있는데 왜 티켓 판매원한테 티켓을 삼?
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            // 초대장이 없는 경우
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketOffice.plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }

}
