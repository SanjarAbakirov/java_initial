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
print("Before sorting: ", numbers)
print("After sorting: ", bubble_sort(numbers.copy()))

# .copy - is a method in the list. Creates shallow copy of the array to save all changes


# ------- Selection Sorting --------

def selection_sort(arr):
    # at each step lookig for the minimum
    n = len(arr)
    for i in range(n):
        min_index = i  # presume the minimal element is at the position "i"
        for j in range(i + 1, n):
            if arr[j] < arr[min_index]:
                min_index = j
            arr[i], arr[min_index] = arr[min_index, arr[i]]
    return arr


numbers2 = [64, 34, 25, 12, 22, 11, 90]
print = ("After sorting: ", selection_sort(numbers2.copy()))
