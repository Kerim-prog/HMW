package homework;

public class faktorial {
    public static void main(String[] args) {
        System.out.println(findFaktorial(6));

    }

    public static int findFaktorial(int a)
    {
        if(a!=1){return a*findFaktorial(a-1);}
        else return 1;
    }
}
