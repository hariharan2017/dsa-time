const nums1 = [1,2,3,4];
const nums2 = [1,1,1,1,1];
const nums3 = [3,1,2,10,1];

function runningSum (arr) {
  for (let i=1; i<arr.length; i++) {
    arr[i] = arr[i] + arr[i-1];
  };

  return arr;
}

console.log(runningSum(nums1));
console.log(runningSum(nums2));
console.log(runningSum(nums3));