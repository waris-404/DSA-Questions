import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {

        int nums1[]={1,2,3};
        int nums2[]={2,5,6};

        int m=nums1.length;
        int n=nums2.length;

        int result[]=new int[m+n];

        int i=0,j=0,k=0;

        while(i<m && j<n){

            if(nums1[i]<nums2[j])
                result[k++]=nums1[i++];
            else
                result[k++]=nums2[j++];
        }

        while(i<m)
            result[k++]=nums1[i++];

        while(j<n)
            result[k++]=nums2[j++];

        System.out.println(Arrays.toString(result));
    }
}