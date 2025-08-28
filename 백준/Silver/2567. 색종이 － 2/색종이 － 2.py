N = int(input())
papers = [list(map(int, input().split())) for _ in range(N)]

# 색종이 칠하기
white_paper = [[0] * 100 for _ in range(100)]
for i,j in papers:
    for n in range(10):
        for m in range(10):
            white_paper[i+n][j+m] = 1

# 둘레 구하기
paper_round = 0
direction = [[0,1], [1,0], [0,-1], [-1,0]]
for i in range(100):
    for j in range(100):
        if white_paper[i][j] == 1:
            for di, dj in direction:
                if not (0 <= i+di < 100 and 0<= j+dj < 100):
                    paper_round += 1
                elif white_paper[i+di][j+dj] == 0:
                    paper_round += 1

print(paper_round)
