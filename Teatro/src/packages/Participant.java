package src.packages;

public class Participant extends Thread{
    private Ticket ticket;

    public Participant(Ticket ticket) {
        super();
        this.ticket = ticket;
    }

    public void run(){
        System.out.println("O ID do meu ingresso é " + ticket.getId() + ". Comprei ele por " + ticket.getPrice() + "R$.");
    }
}
