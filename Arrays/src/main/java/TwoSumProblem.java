import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        int[] output = twoSum(nums, 6);
        for (int i : output) {
            System.out.println("first:"+i);
        }
        int[] output2 = twoSumTwoPointer(nums, 6);
        for (int i : output2) {
            System.out.println("second:"+i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i=0;i<nums.length;i++) {
            for(int j = i+1; j<nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
        return output;
    }

    /**
     * This is two pointer technique where we need to sort the array because of which indexes of the elements are changed.
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumTwoPointer(int[] nums, int target) {
        int[] output = new int[2];
        int i = 0;
        int j = nums.length - 1;
        int element1 = 0;
        int element2 = 0;
        int[] copyArray = Arrays.copyOf(nums, nums.length);

        for (int i1 : copyArray) {
            System.out.print(i1 + " ");
        }

        while(i < j) {
            int sum = nums[i] + nums[j];
            System.out.println("Sum:"+sum);
            if (sum == target) {
                element1 = nums[i];
                element2 = nums[j];
            } else if(sum > target) {
                i++;
            } else {
                j--;
            }
        }

        for(int index=0;index<copyArray.length;index++) {
            if(element1 == copyArray[index]) {
                output[0] = index;
            }
            if(element2 == copyArray[index]) {
                output[1] = index;
            }
        }

        return output;
    }
}
