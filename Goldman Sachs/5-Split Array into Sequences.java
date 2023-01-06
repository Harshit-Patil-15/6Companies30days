class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer,Integer> avalibilityMap=new HashMap<>();
        HashMap<Integer,Integer> vacancyMap=new HashMap<>();
        for (int x:nums){
            avalibilityMap.put(x,avalibilityMap.getOrDefault(x,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(avalibilityMap.getOrDefault(nums[i],0)<=0){
                continue;
            }
            else if(vacancyMap.getOrDefault(nums[i],0)>0){
             avalibilityMap.put(nums[i],avalibilityMap.getOrDefault(nums[i],0)-1);
             vacancyMap.put(nums[i],vacancyMap.getOrDefault(nums[i],0)-1);
            vacancyMap.put(nums[i]+1,vacancyMap.getOrDefault(nums[i]+1,0)+1);
            }
            else if((avalibilityMap.getOrDefault(nums[i]+1,0)>0) && (avalibilityMap.getOrDefault(nums[i]+2,0)>0) && (avalibilityMap.getOrDefault(nums[i],0)>0)){
            avalibilityMap.put(nums[i],avalibilityMap.getOrDefault(nums[i],0)-1);
            avalibilityMap.put(nums[i]+1,avalibilityMap.getOrDefault(nums[i]+1,0)-1);
            avalibilityMap.put(nums[i]+2,avalibilityMap.getOrDefault(nums[i]+2,0)-1);
            vacancyMap.put(nums[i]+3,vacancyMap.getOrDefault(nums[i]+3,0)+1);
            }else{
               return false;
            }
        }
        return true;

    }
}