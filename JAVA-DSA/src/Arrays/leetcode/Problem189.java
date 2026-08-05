package Arrays.leetcode;

class Solution {

    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        int j = nums.length - 1;

        reverse(nums, 0, j);
        reverse(nums, 0, k - 1);
        reverse(nums, k, j);
    }

    private void reverse(int[] nums, int i, int j) {

        while (i < j) {

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}