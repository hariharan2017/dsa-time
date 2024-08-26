class Solution {
  public int[] sortedSquares(int[] nums) {
      for (int i=0; i<nums.length; i++) {
          nums[i] = nums[i] * nums[i];
      }

      Arrays.sort(nums);
      return nums;
  }
}


//Optimized approach

class Solution {
  public int[] sortedSquares(int[] nums) {
      int[] newNums = new int[nums.length];
      int start = 0, end = nums.length - 1;

      for (int i=nums.length-1; i>=0; i--) {
          if (Math.abs(nums[start]) > Math.abs(nums[end])) {
              newNums[i] = nums[start] * nums[start];
              start++;
          } else {
              newNums[i] = nums[end] * nums[end];
              end--;
          }
      }

      return newNums;
  }
}