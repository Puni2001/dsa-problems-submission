class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit , min_price = 0 , float('inf')

        for price in prices:
            if price < min_price:
                min_price = price

            current_profit = price - min_price
            max_profit = max(max_profit, current_profit)

        return max_profit 
            
