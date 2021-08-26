package StrategyPattern;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        int index = 0;
        Ticket ticket = null;
        System.out.println("Vé");
        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            ticket = new Ticket();
            ticket.setName("ticket "+i);
            ticket.setPrice(50d * i);//giá gốc là 50 * i

            GeneratePromotedStrategy(ticket, rand);
            LogTicketDetails(ticket);

            GeneratePromotedStrategy(ticket, rand);
            LogTicketDetails(ticket);
        }
    }

    private static void LogTicketDetails(Ticket ticket) {
        System.out.println("Giá sau khi giảm của "+ ticket.getName()+" là "+ ticket.getPromotedPrice() +
                           " "+ ticket.getPromoteStrategy().getClass().getSimpleName());
    }

    /**
     * 
     * @param ticket
     * @param rand
     */
    private static void GeneratePromotedStrategy(Ticket ticket, Random rand) {
        int index;
        index = rand.nextInt(3);//ramdom từ 0<= x < 3
        switch (index){
            case 0:
                ticket.setPromoteStrategy(new NoDiscountStrategy());
                break;
            case 1:
                ticket.setPromoteStrategy(new QuarterDiscountStrategy());
                break;
            case 2:
                ticket.setPromoteStrategy(new HalfDiscountStrategy());
                break;
        }
    }
}
