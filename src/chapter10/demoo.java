package chapter10;

public class demoo {
    public static void main(String[] args) {
        Thread rabbit=new Race();
        rabbit.setName("兔子");
        Thread turtle=new Race();
        turtle.setName("乌龟");
        //乌龟的优先级设置最大
        turtle.setPriority(Thread.MAX_PRIORITY);
        rabbit.setPriority(Thread.MIN_PRIORITY);
        turtle.start();
        rabbit.start();
    }
}
