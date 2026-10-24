//https://leetcode.com/problems/search-in-rotated-sorted-array/
// This problem  is taken from the leet code 33.
//You are given an integer array nums sorted in ascending order,
//but it has been rotated at some unknown position.

//You are also given an integer target.
//Find the index of the target in the array. If the target is not present, return -1.


class Solution {
    public int search(int[] nums, int target) {

        // Step 1: Find the pivot (largest element's index)
        int pivot = findpivot(nums);

        // Step 2: If there is no pivot, the array is not rotated.
        // Search the entire array using binary search.
        if (pivot == -1) {
            return binarysearch(nums, target, 0, nums.length - 1);
        }

        // Step 3: If the target is the pivot element, return its index.
        if (nums[pivot] == target) {
            return pivot;
        }

        // Step 4: If target >= first element,
        // search the left sorted half.
        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot - 1);
        }

        // Step 5: Otherwise, search the right sorted half.
        return binarysearch(nums, target, pivot + 1, nums.length - 1);
    }

    // Finds the pivot: the index of the largest element
    // Example: [4, 5, 6, 7, 0, 1, 2]
    // Pivot index = 3, because 7 > 0
    int findpivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            // Find the middle index without risking integer overflow
            int mid = start + (end - start) / 2;

            // Case 1: Mid is the largest element
            // Check that mid + 1 is within array bounds
            if (end > mid && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // Case 2: The element before mid is the largest
            // Check that mid - 1 is within array bounds
            else if (start < mid && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Case 3: Pivot is in the left half
            // Move the end pointer to the left
            else if (nums[mid] <= nums[start]) {
                end = mid - 1;
            }

            // Case 4: Pivot is in the right half
            // Move the start pointer to the right
            else {
                start = mid + 1;
            }
        }

        // No pivot found means the array is not rotated
        return -1;
    }

    // Standard binary search on a sorted range
    int binarysearch(int[] nums, int target, int start, int end) {

        // Continue while the search range is valid
        while (start <= end) {

            // Find the middle index
            int mid = start + (end - start) / 2;

            // Target is smaller: search the left half
            if (nums[mid] > target) {
                end = mid - 1;
            }

            // Target is larger: search the right half
            else if (nums[mid] < target) {
                start = mid + 1;
            }

            // Target found: return its index
            else {
                return mid;
            }
        }

        // Target does not exist in this range
        return -1;
    }
}
