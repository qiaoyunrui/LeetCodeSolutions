# 最大公共子序列
def maxSequence(arr):
    sum = 0
    maxSum = 0
    for i in arr:
        sum += i
        if sum < 0:
            sum = 0
        else:
            if sum > maxSum:
                maxSum = sum
    return maxSum


print(maxSequence([-2, 1, -3, 4, -1, 2, 1, -5, 4]))
