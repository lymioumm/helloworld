package sell.com.hit;

public class SellTicket2 implements Runnable {
    //    定义100张票
    private int tickets = 100;

    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");

            }
        }
    }
}
