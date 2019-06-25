package com.jbj.theaterExample;

public class Theater {

//    일종의 interface 역할을 하게 됨
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
//        더 이상 ticketOffice에 접근하지 않는다
        ticketSeller.sellTo(audience);
    }
}
