package homework;

public class faktorial {
    public static void main(String[] args) {
        System.out.println(findFaktorial(5));

    }

    public static int findFaktorial(int a)
    {
        int fak=1;
        if(a!=1){
        fak=a*findFaktorial(a-1);
        }
                return fak;
    }
}
