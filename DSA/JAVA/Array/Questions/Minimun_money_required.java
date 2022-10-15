/*
Leet Code Problem Number - 2412

You are given a 0-indexed 2D integer array transactions, 
where transactions[i] = [costi, cashbacki].

The array describes transactions, where each transaction must 
be completed exactly once in some order. At any given moment, 
you have a certain amount of money. In order to complete transaction i,
money >= costi must hold true. After performing a transaction, 
money becomes money - costi + cashbacki.

Return the minimum amount of money required before any transaction so that all of the 
transactions can be completed regardless of the order of the transactions.

 
Example 1:
Input: transactions = [[2,1],[5,0],[4,2]]
Output: 10
Explanation:
Starting with money = 10, the transactions can be performed in any order.
It can be shown that starting with money < 10 will fail to complete all transactions in some order.
 

Example 2: 
Input: transactions = [[3,0],[0,3]]
Output: 3
Explanation:
- If transactions are in the order [[3,0],[0,3]], the minimum money required to complete the transactions is 3.
- If transactions are in the order [[0,3],[3,0]], the minimum money required to complete the transactions is 0.
Thus, starting with money = 3, the transactions can be performed in any order.

 */


 class Solution {
  public long minimumMoney(int[][] transactions) {
    long ans = 0;
    long losses = 0;

    // Before picking the final transaction, perform any transaction that raises
    // the required money
    for (int[] t : transactions) {
      final int cost = t[0];
      final int cashback = t[1];
      losses += Math.max(0, cost - cashback);
    }

    // Now, pick a transaction to be the final one
    for (int[] t : transactions) {
      final int cost = t[0];
      final int cashback = t[1];
      if (cost > cashback)
        // Losses except this transaction: losses - (cost - cashback),
        // so add cost of this transaction = losses - (cost - cashback) + cost
        ans = Math.max(ans, losses + cashback);
      else
        // Losses except this transaction: losses,
        // so add cost of this transaction = losses + cost
        ans = Math.max(ans, losses + cost);
    }

    return ans;
  }
}
