# Big O notation
# O(n^2) quadratic complexity

# Ex braking ice among friends
# n = 5, 5 * 4/2 = 10
# n = 10, 10 * 9 / 2 = 45

#  n * (n - 1) / 2 = n^2 - n/2 = n^2
# divide by 2 because we have doubled actions inside of equation that is no needed.
# n - i we optimize algorithms with sorted elements by the end of the list
# and - 1 means we want to keep counter inside of the array

def bubble_sort(arr):
    n = len(arr)
    for i in range(n):  # (0, 5)
        for j in range(0, n - i - 1):  # (0, 4)
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr


numbers = [64, 34, 25, 12, 22, 11, 90]
# print("Before sorting: ", numbers)
# print("After sorting: ", bubble_sort(numbers.copy()))

# .copy - is a method in the list. Creates shallow copy of the array to save all changes


# ------- Selection Sorting --------

def selection_sort(arr):
    # at each step lookig for the minimum
    n = len(arr)
    for i in range(n):
        min_index = i  # presume the minimal element is at the position "i"

        # раз min_index = i то мы перебираем i + 1 без этого не ошибка но экономит время
        for j in range(i + 1, n):
            if arr[j] < arr[min_index]:
                min_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]
    return arr


# numbers2 = [64, 34, 25, 12, 22, 11, 90]
# print("Before sorting: ", numbers2)
# print("After sorting: ", selection_sort(numbers2.copy()))


# -------- cube complexity--------------
def find_all_triplets_simple(arr):
    n = len(arr)
    count = 0

    print(f"Array from {n} elements")
    print(
        f"There are all potential triplets: C({n}, 3) = {n} * (n - 1) * (n - 2)s//6 operations")

    # we generate necessary combinations
    for i in range(n - 2):  # there are n iterations
        for j in range(i + 1, n - 1):  # there are n*n iterations
            for k in range(j + 1, n):  # n * n * n iterations
                # C(n, 3) = n!/(3!(n-3)!)
                count += 1

    print(f"There were defined: {count}")
    print(f"Quantity operations (iterations): {count} (instead {n ** 3})")
    return count


numbers = [2, 4, 5, 6, 7, 8, 9]
print("The output: ", find_all_triplets_simple(numbers))
