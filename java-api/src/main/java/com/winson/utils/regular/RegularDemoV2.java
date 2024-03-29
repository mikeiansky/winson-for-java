package com.winson.utils.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author winson
 * @date 2021/8/12
 **/
public class RegularDemoV2 {

    public void regular(){
        String source = "xyyz";
        String reg = "xy{1,3}yz";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(source);
        int index = 0;
        while (matcher.find()){
            index ++;
            System.out.println(index + ": '"+matcher.group()+"'");
        }
    }

    private void regular2(){
        System.out.println("RegularDemoV2 :: private:regular2");
    }

    public static void main(String[] args) {

        String source = "xyyz";
        String reg = "xy{1,3}yz";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(source);
        int index = 0;
        while (matcher.find()){
            index ++;
            System.out.println(index + ": '"+matcher.group()+"'");
        }

    }

}
