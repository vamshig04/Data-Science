class Solution {
    public static int gcd(int a, int b){
        if (b==0)
        return a;
        return gcd(b,a%b);
    }
    public boolean isGoodArray(int[] nums) {
        int gcdval=nums[0];
    for(int i=1;i<nums.length;i++){
        gcdval=gcd(gcdval,nums[i]);
    }
    return gcdval==1;
    }
    }
