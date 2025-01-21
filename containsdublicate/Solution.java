package containsdublicate;

import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer , Integer>dublicate=new HashMap<>();

        for (int i =0;i<nums.length;i++){
            int count=0;
            if (dublicate.containsKey(nums[i])){
                return  true;

            }
            dublicate.put(nums[i],++count);
        }

        return  false;
    }
    public  static  void main(String...x){
         int [] nums = {1,2,3};
         Solution solu =new Solution();
         boolean b =solu.containsDuplicate(nums);
         System.out.println("The Given number has the duplicate number : " + b);
    }
}