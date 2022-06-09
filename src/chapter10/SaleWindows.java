package chapter10;

/**
        * 售票窗口
        */
class SaleWindows extends Thread {

    private Ticket ticket;

    public SaleWindows(String name, Ticket ticket) {
        super(name);
        this.ticket = ticket;
    }

    @Override
    public void run() {
        super.run();
        ticket.sale();
    }
}