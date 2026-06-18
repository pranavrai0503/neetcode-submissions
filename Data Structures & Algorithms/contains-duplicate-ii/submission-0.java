class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

       int l=0;
       Set<Integer> set = new HashSet<>();
       for(int r=0; r<nums.length; r++){
        if(r-l+1 > k+1){
            set.remove(nums[l]);
            l++;
        }
        if(set.contains(nums[r])){
            return true;
        }
        set.add(nums[r]);
       }
       return false;
    }
}