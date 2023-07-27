class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n= nums.length;
         int ans[] = new int[n];
      PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->a-b);
        
        for(int i=0; i<n; i++){
            if(pq.size()<k){
                  pq.add(nums[i]);        
            }else if(nums[i] > pq.peek()){
                   pq.remove();
                pq.add(nums[i]);
            }
        
           if(pq.size() >k){
               ans[i] = -1;
           }else{
               ans[i] = pq.peek();
           }
        }
        
      return pq.peek();  
        
    }
}