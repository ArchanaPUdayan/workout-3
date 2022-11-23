import java.util.*;

class array_operations{
    public void display(int[] arr){
        System.out.println(Arrays.toString(arr));
    }


    public void search(int num,int[] arr){
        int flag=0;
        try{
            for (int i = 0; i <arr.length; i++) {
                if(arr[i]==num){
                    flag=1;
                    break;
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException msg){
            System.out.println(msg);

        }
        finally {
            if(flag==1){
                System.out.println("found");
            }
            else{
                System.out.println("Not found");
            }
        }
    }
    public void sort(int[] arr1){
        Arrays.sort(arr1);
        System.out.println("\nsorted element: ");
        display(arr1);
    }

}

public class arrayoperation {
    public static void main(String[] args)
    {
        System.out.println("enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the elements : ");
        try{
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException msg){
            System.out.println(msg);
        }
        array_operations a1=new array_operations();
        System.out.println("the unsorted array is : ");
        a1.display(arr);
        a1.sort(arr);
        System.out.println("\nenter the number to be searched: ");
        int s_num= sc.nextInt();
        a1.search(s_num,arr);
    }
}

