class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue <Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            minHeap.offer(nums[i]);
            }

            while(k>0){
                int s=minHeap.poll();
                minHeap.offer(s+1);
                k--;
            }
            long mod=1000000007;
            long product=1;
            while(!minHeap.isEmpty()){
                product=(product*minHeap.poll())%mod;
            }
        return (int)product;
    
}
    }
