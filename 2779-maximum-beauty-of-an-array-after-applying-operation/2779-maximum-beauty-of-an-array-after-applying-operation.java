class Solution {
    public int maximumBeauty(int[] nums, int k) {
        
        int[] freq = new int[300001];
        for(int i=0; i<nums.length; i++){
		//from this number we can make this range of numbers
            int left = Math.max(nums[i]-k,0); 
            int right = nums[i]+k;
            freq[left]++;
            freq[right+1]--;
        }
        int max = freq[0];
        for(int i=1; i<freq.length; i++){
			//add to have final frequency
            freq[i]+=freq[i-1];
            max = Math.max(freq[i],max);
        }
        return max;
        
        
        
    }
}