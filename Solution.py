# кубик рубика n = 3 -> 27 cubes
#              n = 10 -> 10*10*10 = 1000
#              n = 100 -> 100 * 100 * 100 = 1 000 000

# ex. leetcode

#  cube complexity
from typing import List


class Solution:
    # class Solution - это как тертрадь для решения задачи
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # def threeSum — это "рецепт" (метод) для решения задачи
        # nums: List[int] — на вход дают список чисел (например: [1, 2, -3])
        # -> List[List[int]] — на выходе будет список списков (например: [[1, 2, -3]])
        # nums = [-1, 0, 1, 2, -1, -4]
        n = len(nums)
        result = []
        print(f"Begining search of triples: {nums}")
        print(f"The summ is: {n}")

        for i in range(n - 2):
            # оставляет место для двух элементов в конце очереди
            for j in range(i + 1, n - 1):
                #  а тут оставляет для двух
                for k in range(j + 1, n):
                    sum = nums[i] + nums[j] + nums[k]
                    print(
                        f"Checking out: nums[{i}]={nums[i]}, nums[{j}]={nums[j]}, nums[{k}] = {nums[k]} = {sum}")
                    if sum == 0:
                        triplet = sorted([nums[i], nums[j], nums[k]])
                        print(f"Found triplet! {triplet}")

                        #  сортируем по возрастанию
                        if triplet not in result:
                            #  нет ли такой же тройки уже в массиве
                            result.append(triplet)
        print(f"\nTotal: founded {len(result)} uniqe triples")
        print(f"The result: {result}")
        return result


# this is our nums
#  lets find all triples with the summ == 0

# text: -1 + 0 + 1 = 0
#       -1 + -1 + 2 = 0
