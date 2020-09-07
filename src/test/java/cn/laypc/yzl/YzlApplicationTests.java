package cn.laypc.yzl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class YzlApplicationTests {

    public static void main(String[] args) {
        System.err.println(romanToInt("II"));//2
        System.err.println(romanToInt("XII"));//12
        System.err.println(romanToInt("XXVII"));//27
        System.err.println(romanToInt("IV"));//4
        System.err.println(romanToInt("IX"));//9
        System.err.println(romanToInt("DM"));//500
        System.err.println(romanToInt("LD"));//450
    }

    public static int romanToInt(String s) {

        /*HashMap<Character, Integer> map = new HashMap(7);
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int a = map.get(s.charAt(s.length()-1));
        for (int i = 0;i < s.length()-1;i++){
            int r = map.get(s.charAt(i));
            if (map.get(s.charAt(i+1)) > r){
                r = -r;
            }
            a += r;
        }
        return a;*/

        char[] carr = s.toCharArray();

        int[] arr = new int[90];
        arr['I'] = 1;
        arr['V'] = 5;
        arr['X'] = 10;
        arr['L'] = 50;
        arr['C'] = 100;
        arr['D'] = 500;
        arr['M'] = 1000;

        int a = arr[carr[carr.length-1]];

        for (int i = 0;i < s.length()-1;i++){
            int r = arr[carr[i]];
            if (arr[carr[i+1]] > r){
                r = -r;
            }
            a += r;
        }
        return a;
    }

    @Test
    void contextLoads() {
    }

}
