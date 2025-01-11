import java.util.*;
public class Arrays
{
    public static void main(String[] args){
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marks[] = new int[n];
        for(int i =0; i<n;i++){
            marks[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(" ENTERE THE MARKS TO BE FOUND:");
        for(int i =0; i<marks.length;i++){            
            // System.out.println(marks[i]);
            // System.out.println("value of i is "+i);
            if(marks[i]==x){
                System.out.println("THE MARKS "+x+" IS FOUND AT INDEX "+i);
            }
            // else{
            //     System.out.println("THE MARKS "+x+" IS NOT FOUND");
            // }
        }
        sc.close();
    }
}