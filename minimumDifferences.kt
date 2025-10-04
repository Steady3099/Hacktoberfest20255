class Solution {
    fun minimumDifference(nums: IntArray, k: Int): Int {
        nums.sort()
        var ans = Integer.MAX_VALUE

        var l = 0
        var r = k-1

        while(r<nums.size){
            if(ans>nums[r]-nums[l]) ans = nums[r]-nums[l]
            l++
            r++
        }

        return ans
        
    }
}
