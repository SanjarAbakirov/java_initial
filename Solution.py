# кубик рубика n = 3 -> 27 cubes
#              n = 10 -> 10*10*10 = 1000
#              n = 100 -> 100 * 100 * 100 = 1 000 000

# ex. leetcode

from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[List[int]]]:
        #  cube complexity
        n = len(nums)
        result = []
        for i in range(n - 2):
            for j in range(i + 1, n - 1):
                if nums[i] + nums[j] + nums[k] == 0:
                    triplet = sorted([nums[i], nums[j], nums[k]])
                    if triplet not in result:
                        result.append(triplet)
        return result
