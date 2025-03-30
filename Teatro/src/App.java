package src;
import src.packages.*;

/* Nessa execução, podemos ver que utilizando Threads, a sequência de ações pode variar quando o código está sendo
executado*/
public class App {

    public static void main(String[] args) {
        Ticket ticket = new Ticket(20, "18721321");
        Ticket ticket2 = new Ticket(30, "1872121321");
        Ticket ticket3 = new Ticket(40, "187313421321");
        Thread thread = new Participant(ticket);
        Thread thread2 = new Participant(ticket2);
        Thread thread3 = new Participant(ticket3);
        thread.start();
        thread2.start();
        thread3.start();
    }
}