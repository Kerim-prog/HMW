package homework;

import javax.swing.*;

public class FindUglyNumbers {
    public static void main(String[] args) {
        primeNumbers(315);

    }

    private static int[] primeNumbers(int num){
        int[] pn=new int[15];
        int j=0;
        for(int i = 2; i< num; i++) {
            while(num%i == 0) {
                System.out.println(i+" ");
                num = num/i;
            }
        }
        if(num >2) {
            System.out.println("ok"+num);
        }
        return pn;

    }

}
