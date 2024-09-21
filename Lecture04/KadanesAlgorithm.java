package Lecture04;

public class KadanesAlgorithm {
    //Maximum Sum Ques 53 on leetcode
    //1. Brute force: Generate all subarrays
    //2. Kadane's Algo
    public int kadanesAlgo(int[] nums) {
        int currsum=0,maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currsum = currsum + nums[i];
            maxsum = Math.max(maxsum,currsum);
            if(currsum<=0){
                currsum=0;
            }
        }
        return maxsum;
    }

}
