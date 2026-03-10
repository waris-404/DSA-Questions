import java.util.*;

public class SecondElement {

    public static void main(String[] args) {

        int arr[]={1,2,4,7,7,5};

        Arrays.sort(arr);

        int secondSmall=arr[1];
        int secondLarge=arr[arr.length-2];

        System.out.println("Second Smallest : "+secondSmall);
        System.out.println("Second Largest : "+secondLarge);
    }
}