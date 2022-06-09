package chapter10;

public class TicketDemo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        SaleWindows windows1 = new SaleWindows("窗口1", ticket);
        SaleWindows windows2 = new SaleWindows("窗口2", ticket);
        SaleWindows windows3 = new SaleWindows("窗口3", ticket);

        windows1.start();
        windows2.start();
        windows3.start();
    }
}