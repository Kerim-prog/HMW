package homework;

public class FindSmallest {
    public static void main(String[] args) {
        int[] myNum = {5,7,-8,5,14,1};
        int sm1 = findSmallest(myNum);
        System.out.println("Smallest element is: "+ sm1);
        System.out.println("Second smallest element is: "+findSmallestExcept(myNum,sm1));

    }

    public static int findSmallest(int[] arr)
    {
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        return smallest;
    }

    public static int findSmallestExcept(int[] arr,int sm)
    {
        int smallest;
        if(sm==arr[0])
        {
            smallest=arr[1];
        }
        else
            smallest = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=sm)
            {
                if(arr[i]<smallest)
                    {
                    smallest=arr[i];
                    }
            }
        }
        return smallest;
    }

}
