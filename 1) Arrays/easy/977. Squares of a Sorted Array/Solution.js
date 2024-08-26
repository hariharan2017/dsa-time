//Map to create new square array and then sort

var sortedSquares = function(nums) {
  return nums.map((num) => num * num).sort((a,b) => a-b)
};



//Optimized approach

var sortedSquares = function(nums) {
  let newNums = [];
  let start = 0, end = nums.length - 1;

  for (let i=nums.length-1; i>=0; i--) {
      if (Math.abs(nums[start]) > Math.abs(nums[end])) {
          newNums[i] = nums[start] * nums[start];
          start++;
      } else {
          newNums[i] = nums[end] * nums[end];
          end--;
      }
  }

  return newNums;
};