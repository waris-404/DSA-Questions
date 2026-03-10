public class MaxProductSubarray {
    public static void main(String[] args) {

        int nums[]={2,3,-2,4};

        int max=nums[0];
        int prod=1;

        for(int i=0;i<nums.length;i++){

            prod*=nums[i];

            if(prod>max)
                max=prod;

            if(prod==0)
                prod=1;
        }

        System.out.println(max);
    }
}