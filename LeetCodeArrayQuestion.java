import java.io.IOException;
import java.util.*;

public class LeetCodeArrayQuestion {
    //1 https://leetcode.com/problems/two-sum
    public static int[] TowSum(int[] arr, int target) {
        int[] res = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    //2    https://leetcode.com/problems/remove-duplicates-from-sorted-array
    public static Object[] removeDuplicates(int[] nums) {
        int count = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count++] = nums[i];
                list.add(nums[i]);
            }
        }
        return list.toArray();
    }

    // 3 https://leetcode.com/problems/remove-element
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;

    }

    // 4 https://leetcode.com/problems/search-insert-position
    public static int searchInsert(int[] nums, int target) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (target > nums[i]) {
                pos += 1;
            }
        }
        return pos;
    }

    //   5 https://leetcode.com/problems/maximum-subarray
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        int s = 0;
        int st = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
                st = s;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
                s = i + 1;
            }
        }
        System.out.println(st);
        System.out.println(end);
        return max;

    }

    //    6 https://leetcode.com/problems/plus-one
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
            if (digits[i] == 0) {
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                return result;
            }
        }
        return digits;
    }

    // 7 https://leetcode.com/problems/merge-sorted-array
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[last--] = nums1[p1--];
            } else {
                nums1[last--] = nums2[p2--];
            }
        }
//        System.out.println(Arrays.toString(nums1));
        return nums1;
    }

    public static void mi() {
        HashMap<Integer, Integer> hashSet = new HashMap<Integer, Integer>();
        hashSet.put(5, 23);
        hashSet.put(3, 32);
        hashSet.put(2, 32);
        hashSet.put(4, 35);
        hashSet.put(1, 63);


        System.out.println(hashSet);
    }

    public static void main(String[] args) throws IOException {
        mi();

//        System.out.println(Arrays.toString(merge(new int[]{1, 6, 5, 0, 0, 0}, 3, new int[]{2, 3, 4}, 3)));

//        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9, 9, 9, 9, 9})));

//        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

//        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 4));

//        System.out.println(((removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2))));

//        System.out.println(Arrays.toString(removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5})));

//        System.out.println(Arrays.toString(TowSum(new int[]{2, 11, 15, 7}, 9)));
    }

}
