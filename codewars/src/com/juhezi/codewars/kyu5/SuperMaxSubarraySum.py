# 最大公共子序列 Super
# Need Study

def maxSequence(arr):
    return max((sum(arr[i:j]) for i in range(len(arr)) for j in range(i + 1, len(arr) + 1))) if arr else 0
