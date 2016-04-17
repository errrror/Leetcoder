/**
 * Created by YGZ on 2016/2/22.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m + n - 1;
        int start = m - 1;
        int i=m-1,j=n-1;
        if(m==0){
            for (int k = 0;k<n;k++){
                nums1[k] = nums2[k];
            }
            return;
        }else if (n==0){
            return;
        }
        while (i>=0 && j>=0) {
            if (nums1[i] >= nums2[j]) {
                nums1[end--] = nums1[i--];
            } else {
                nums1[end--] = nums2[j--];
            }
        }
        while (i>=0){
            nums1[end--] = nums1[i--];
        }
        while(j>=0){
            nums1[end--] = nums2[j--];
        }
    }
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {0};
        int[] nums2 = {1};
        mergeSortedArray.merge(nums1,0,nums2,1);
        for (int i = 0;i<nums1.length;i++){
            System.out.print(nums1[i] + " ");
        }
    }
}