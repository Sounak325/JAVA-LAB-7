import java.util.*;
class NegativeNumberException extends Exception{
    public String toString(){
        return "Invalid input";
    }
}
 class ExceptInput1 {
    public int ProcessInput(int num) {
        if (num > 0) {
            return num * 2;
        } else
            try {
                throw new NegativeNumberException();
            }
            catch (NegativeNumberException e) {
                System.out.println(e.toString());
                 return -1;
            }
    }
}
class ExceptInput{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         ExceptInput1 ob=new ExceptInput1();
         System.out.println("Enter a number");
         int num=sc.nextInt();
         int result=ob.ProcessInput(num);
         System.out.println("Result:"+result);
     }

}
