import java.util.*;

public class MaxMarksSemester {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no of semester: ");
        int sem=sc.nextInt();

        for(int i=1;i<=sem;i++){

            System.out.print("Enter subjects in semester "+i+": ");
            int sub=sc.nextInt();

            int max=0;

            System.out.println("Enter marks:");

            for(int j=1;j<=sub;j++){

                int marks=sc.nextInt();

                if(marks<0 || marks>100){
                    System.out.println("You have entered invalid mark.");
                    return;
                }

                if(marks>max)
                    max=marks;
            }

            System.out.println("Maximum mark in "+i+" semester: "+max);
        }
    }
}