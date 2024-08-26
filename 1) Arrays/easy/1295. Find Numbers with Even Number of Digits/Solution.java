class Solution {
  public int findDigitsLength (int n) {
      int len = 0;
      while (n != 0) {
          n = n/10;
          len++;
      };
      return len;
  }

  public int findNumbers(int[] nums) {
      int evenNums = 0;

      for (int el: nums) {
          if (findDigitsLength(el) % 2 == 0) {
              evenNums++;
          }
      }

      return evenNums;
  }
}



//Alternative

class Solution {
  public int findDigitsLength (int n) {
      int len = 0;
      while (n != 0) {
          n = n/10;
          len++;
      };
      return len;
  }

  public int findNumbers(int[] nums) {
      int evenNums = 0;

      for (int el: nums) {
          if (String.valueOf(el).length() % 2 == 0) {
              evenNums++;
          }
      }

      return evenNums;
  }
}