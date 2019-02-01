



class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);   //排序数组
        for (int i = 0; i < nums.length - 1; i += 2){
            //找到不相等的一组，直接返回
            if (nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        //如果没有找到不相等的一组数据，直接返回数组的最后一个数字
        return nums[nums.length - 1];
        
    }
}
