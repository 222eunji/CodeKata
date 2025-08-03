def solution(sides):
    total = sum(sides)
    answer = 1
    for num in sides:
        if (total - num) <= num:
            answer = 2
    return answer