package chapter10;
import java.math.BigDecimal;
public class Race extends Thread {
    //比赛的路程
    private int distance=20;
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    //控制浮点数累加运算时的精度
    public static double add(double v1,double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    @Override
    public void run(){
        long time0=System.currentTimeMillis();//记录开始跑的时间
        if(getName().equals("兔子")){
            int i = 0;
            double runTime = 0;
            while (i < distance){
                i++;
                try {
                    //兔子跑一米200ms
                    Thread.sleep(200);
                    runTime = add(0.2,runTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("兔子跑了"+i+"米"+"，"+"用时"+runTime+"s");
                if ( i%5 == 0 && i != 20){
                    try {
                        //兔子跑五米10 000ms
                        Thread.sleep(10000);
                        runTime = add(10,runTime);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }else if(getName().equals("乌龟")){
            int i = 0;
            double runTime = 0;
            while (i < distance){
                i++;
                try {
                    //乌龟跑一米1000ms
                    Thread.sleep(1000);
                    runTime = add(1,runTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("乌龟跑了"+i+"米"+"，"+"用时"+runTime+"s");
                if ( i%5 == 0 && i != 20){
                    try {
                        //乌龟跑五米1 000ms
                        Thread.sleep(1000);
                        runTime = add(1,runTime);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
