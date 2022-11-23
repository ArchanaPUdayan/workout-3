
import java.util.*;

class InvalidPanException extends Exception {
    public InvalidPanException(String s)
    {

        super(s);
    }
}

public class pancard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name: ");
        String name=sc.nextLine();
        System.out.print("enter your pan number: ");
        String p_number=sc.nextLine();
        try {
            if(name.charAt(0)==p_number.charAt(4)){
                System.out.println("pan num is valid");
            }
            else{
                throw new InvalidPanException("pan num is invalid");
            }
        }
        catch(InvalidPanException m){
            System.out.println(m);
        }
    }
}

