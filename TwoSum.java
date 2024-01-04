public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 5, 1, 7, 2, 3 };
        int[] res = twoSum(nums, 3);
        System.out.println(res[0] + " " + res[1]);
    }

    static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return arr;
    }
}
