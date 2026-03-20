import java.util.*;
public class ArrayExceptionss {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[] =new int[4];
        System.out.println("Enter 5 numbers");
        for(int i=0; i<5;i++){
        try{
            a[i]=sc.nextInt();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception"+e);
        }

        }

    }

}
