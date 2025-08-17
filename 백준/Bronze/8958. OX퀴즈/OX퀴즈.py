def solution(ox):
    total_score = 0
    score = 0

    for answer in ox:
        if answer == 'O':
            score += 1
            total_score += score
        else:
            score = 0
    return total_score


# 입출력
T = int(input())
for tc in range(1, T+1):
    ox = input()
    print(solution(ox))
