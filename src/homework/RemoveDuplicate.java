package homework;

import javax.swing.*;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] myNum = {0,0,10, 20,20,30,50,50,60, 30, 40};

        int s=0;
        for (int a:myNum)
        {
            if(a==0)
                s=1;
                break;
        }
        for(int n:removeDE(myNum))
        {
            if(n!=0)
                s++;
        }

        System.out.println(s);


    }

    private static int[] removeDE(int[] sampleArray)
    {
        int arrayNength= sampleArray.length;
        int[] arr=new int[arrayNength];
        int j = 0;
        for(int i =0;i<arrayNength;i++)
        {
            int temp = sampleArray[i];
            arr[j]=temp;
            for(int k =0;k<arrayNength;k++)
            {
                if(sampleArray[k]==temp)
                    sampleArray[k]=0;
            }
        j++;
        }

        return arr;

    }
}
