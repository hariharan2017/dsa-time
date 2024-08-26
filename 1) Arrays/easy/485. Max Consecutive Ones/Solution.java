class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
      int maxCons = 0;
      int currLen = 0;

      for (int i=0; i<nums.length; i++) {
          if (nums[i] == 1) {
              currLen += 1;
          } else {
              maxCons = Math.max(maxCons, currLen);
              currLen = 0;
          }
      }

      return Math.max(maxCons, currLen);
  }
}