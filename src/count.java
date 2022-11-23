
import java.util.*;

class get_count {
    public int white_space_count(String string){
        int space=0;
        for(int i=0; i<string.length(); i++){
            char ch=string.charAt(i);
            if(ch==' '){
                space++;
            }
        }
        return space;
    }
    public int word_count(String s)
    {
        int word=0;
        for (int i = 0;i<=(s.length()-1);i++)
        {
            if(  ( (i>0)&& (s.charAt(i)!=' ') &&(s.charAt(i-1)==' ')) || ((s.charAt(i)!=' ')&&(i==0)) )
                word++;
        }
        return word;
    }
}

public class count {
    public static void main(String[] args){
        int s_count = 0,w_count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the strings(type 0 to stop): ");
        ArrayList<String> str=new ArrayList<>(1000);
        String str1 = null;


        do {
            str1=sc.nextLine();
            if(!str1.equals("0")) {
                str.add(str1);
            }
        }while(!str1.equals("0"));



        System.out.println("\nno lines in the given text: "+str.size());
        get_count g1=new get_count();


        for(int i=0;i<str.size();i++){
            int c= g1.white_space_count(str.get(i));
            int l=g1.word_count(str.get(i));
            s_count+=c;
            w_count+=l;
        }
        System.out.println("number of white space:"+s_count);
        System.out.println("number of words:"+w_count);
    }
}

