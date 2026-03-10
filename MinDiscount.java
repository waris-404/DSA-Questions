import java.util.*;

public class MinDiscount {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();

        int min=Integer.MAX_VALUE;
        String product="";

        for(int i=0;i<n;i++){

            String line=sc.nextLine();
            String arr[]=line.split(",");

            String name=arr[0];
            int price=Integer.parseInt(arr[1]);
            int discount=Integer.parseInt(arr[2]);

            int discAmount=price*discount/100;

            if(discAmount<min){
                min=discAmount;
                product=name;
            }
        }

        System.out.println(product);
    }
}