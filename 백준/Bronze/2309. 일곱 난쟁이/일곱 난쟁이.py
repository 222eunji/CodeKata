def find_false_dwarf(height):
    goal = sum(height) - 100
    for dwarf1 in range(8):
        for dwarf2 in range(dwarf1+1, 9):
            dwarfs_sum = height[dwarf1] + height[dwarf2]
            if dwarfs_sum == goal:
                result = [dwarf1, dwarf2]
                return result

height = [0] * 9
for i in range(9):
    height[i] = int(input())

remove = find_false_dwarf(height)
height.pop(remove[0])
height.pop(remove[1]-1)
height.sort()

for num in height:
    print(num)
