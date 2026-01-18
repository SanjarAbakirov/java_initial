# кубик рубика n = 3 -> 27 cubes
#              n = 10 -> 10*10*10 = 1000
#              n = 100 -> 100 * 100 * 100 = 1 000 000

# ex. leetcode

from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # это тип
        #  cube complexity
        n = len(nums)
        result = []

        for i in range(n - 2):
            for j in range(i + 1, n - 1):
                for k in range(j + 1, n):
                    if nums[i] + nums[j] + nums[k] == 0:
                        triplet = sorted([nums[i], nums[j], nums[k]])
                        if triplet not in result:
                            result.append(triplet)
        return result

# [-1, 0, 1, 2, -1, -4] this is our nums
#  lets find all triples with the summ == 0

# text: -1 + 0 + 1 = 0
