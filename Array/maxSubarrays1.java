public class maxSubarrays1 {

    public static void maxSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                int currSum = 0;

                for (int k = start; k <= end; k++) {
                    currSum += nums[k];
                }

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 6, 8, 10};
        maxSum(nums);
    }
}
