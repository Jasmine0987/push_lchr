class Solution {
    public boolean uniformArray(int[] nums1) {
        int oddCount = 0;
        for (int num : nums1) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        boolean canMakeEven = (oddCount == 0) || (oddCount >= 2);
        boolean canMakeOdd = (oddCount >= 1);
        return canMakeEven || canMakeOdd;
    }
}