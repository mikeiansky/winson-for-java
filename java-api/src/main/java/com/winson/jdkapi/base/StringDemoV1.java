package com.winson.jdkapi.base;

import java.util.concurrent.CountDownLatch;

/**
 * @author winson
 * @date 2021/9/14
 **/
public class StringDemoV1 {

    // 使用这个会出现空格，为什么会出现空格
    private StringBuilder sb1 = new StringBuilder();
    // 使用这个不会出现空格，为什么不会出现空格
    private StringBuffer sb2 = new StringBuffer();

    public void addStr(String str){
        sb1.append(str);
        sb2.append(str);
    }

    public void run(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    addStr("i:"+i+",");
                }
            }
        }).start();
    }

    public void printlnResult(){
        System.out.println("StringBuilder=> '" + sb1.toString()+"'");
        System.out.println("StringBuffer => '" + sb2.toString()+"'");
    }


    public static void main(String[] args) {
//        StringDemoV1 sd = new StringDemoV1();
//        sd.run();
//        sd.run();
//        sd.run();
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
////        System.out.println(sd.getResult());
//        sd.printlnResult();

//        StringBuilder sb = new StringBuilder();
//        sb.append("1");
//        sb.append("2");
//        sb.append("3");
//        sb.append("4");
//        sb.deleteCharAt(sb.length()-1);
//        System.out.println(sb);

        String date = "2021-10-23 11:32:47";
        String dy = date.substring(0,4);
        String dm = date.substring(0,7);
        String dd = date.substring(0,10);
        System.out.println(dy);
        System.out.println(dm);
        System.out.println(dd);

    }

}
