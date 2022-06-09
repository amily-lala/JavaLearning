package chapter10;

/**
 * 三个窗口同时卖票
 */

/**
 * 票
 */
class Ticket {
    private int count = 1;
    public void sale() {
        while (true) {
            synchronized (this) {
                if (count > 100) {
                    System.out.println("票已经卖完啦");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "卖的第 " + count++ + " 张票");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}




