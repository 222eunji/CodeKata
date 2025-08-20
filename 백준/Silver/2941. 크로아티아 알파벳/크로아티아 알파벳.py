def solution(text):
    count = 0
    idx = 0
    while idx < len(text):
        if text[idx:idx+3] == 'dz=':
            idx += 3
            count += 1
        elif text[idx:idx+2] in ['c=', 'c-', 'd-', 'lj', 'nj', 's=', 'z=']:
            idx += 2
            count += 1
        else:
            idx += 1
            count += 1
    return count

text= input()
print(solution(text))