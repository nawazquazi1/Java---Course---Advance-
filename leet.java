import java.util.Arrays;

public class leet {
// [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    public static int[] ToSum(int [] arr, int target){
        int[]arrr;
        arrr=new int[2];
        for (int i=0;i<arr.length-1;i++){
//            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] + arr[i+1] == target) {
                    arr[0] = i;
                    arrr[1] = i+1;
                }
            }
//        }
        return arrr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ToSum(new int[]{2,11,15,7}, 9)));
    }

}
