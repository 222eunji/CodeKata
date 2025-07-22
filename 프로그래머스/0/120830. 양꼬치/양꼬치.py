def solution(n, k):
    discount = n // 10
    drink = k - discount
    
    if (drink < 0):
        drink = 0
        
    total = 12000 * n + 2000 * drink
    
    return total   