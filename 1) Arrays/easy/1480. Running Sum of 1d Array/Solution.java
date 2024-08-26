class Solution {
  static int[] runningSum(int[] nums) {
      for (int i=1; i<nums.length; i++) {
          nums[i] = nums[i] + nums[i-1];
      }
      
      for (int el: nums) {
        System.out.print(el + " - ");
      }
      return nums;
  }

  public static void main(String[] args) {
    runningSum(new int[]{1,2,3,4});
  }
}