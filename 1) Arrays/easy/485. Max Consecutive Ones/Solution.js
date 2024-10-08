/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
  let max = 0;
  let currLen = 0;

  for (let i=0; i<nums.length; i++) {
      if (nums[i] == 1) {
          currLen += 1;
      } else {
          max = Math.max(max, currLen);
          currLen = 0;
      }
  }

  return Math.max(max, currLen);
};