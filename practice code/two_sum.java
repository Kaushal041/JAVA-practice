import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // Return -1 if no solution is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2, 7, 11, 15, 23};
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        sc.close();

        Solution obj = new Solution();
        int[] result = obj.twoSum(nums, target);
        if (result[0] != -1) {
            System.out.println("Indexes: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }
}
