package sell.com.hit;

public class SellTicket extends Thread {
    //    定义100张票
//    private int tickets=100;
//    为了让多个线程对象共享这100张票，故用静态修饰
    private static int tickets = 100;

    public void run() {
//        定义100张票
//        每个线程进来都会走这里，这样的话，每个线程相当于买的是自己的那100
//        张票，这不合理，所以应该定义到外面
//        int tickets=100;
//        为了模拟一直有票
        while (true) {
            if (tickets > 0) {
                System.out.println(getName() + "正在出售第" + (tickets--) + "张票");
            }
        }
    }
}
