package simple.search;

/**
 * @author yangy
 * @description: 搜索插入位置
 * @date 2022/10/11 9:29 下午
 */
public class SearchInsertPosition {


    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 7;

        System.out.println(searchInsert(nums,target));

    }

    public static int searchInsert(int[] nums, int target) {

        // 二分法
        int num = nums.length;
        int left = 0, right = num - 1;

        while(left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
