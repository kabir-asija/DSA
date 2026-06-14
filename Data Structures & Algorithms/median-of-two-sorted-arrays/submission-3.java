class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                list.add(nums1[i++]);
            } else {
                list.add(nums2[j++]);
            }
        }
        
        while (i < nums1.length) {
            list.add(nums1[i++]);
        }

        while (j < nums2.length) {
            list.add(nums2[j++]);
        }

            int n = list.size() - 1;
            int mid = n / 2;
            if (list.size() % 2 == 0) {
                median = (list.get(mid) + list.get(mid + 1)) / 2.0;
            } else {
                median = list.get(mid);
            }
            return median;
        }
    }