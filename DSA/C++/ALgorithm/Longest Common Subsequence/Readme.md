# What is LCS ?
  Longest Common Subsequence is an algorithm that helps us find a subsequence which
  is common in two different sequences and is longest among all the common subsequences.

# Example
  It can be understood more clearly with the following example- <br>
  sequence1 = ADCB <br>
  sequence2 = DAC <br>
  subsequences of sequence1 : {A, D, C, B, AD, AC, AB, DC, DB, CB, ADC, ADB, ACB, DCB, ADCB} <br>
  subsequences of sequence2 : {D, A, C, DA, DC, AC, DAC} <br>
  common subsequences are : {A, D, C, AC, DC} <br>
  longest common subsequence : {AC, DC} <br>
  

# Working
  Dynamic Programming is used to find the LCS. <br>
  This algorithm has a time complexity of O(m*n); where m, n is the length of the two sequences. <br>
  Steps to follow :-

  Step1: Creating LCS Table

         The table would look like this for the two sequences-

                  D   A   C                          A   D   C   B
              0   0   0   0                      0   0   0   0   0
          A   0   _   _   _                  D   0   _   _   _   _
          D   0   _   _   _        OR        A   0   _   _   _   _
          C   0   _   _   _                  C   0   _   _   _   _
          B   0   _   _   _                

  Step2: Filling the table

         1) If the current cell(i, j) has same row and column name,
            then current cell value = {cell(i-1, j-1) + 1}
            and point it diagonally↖️.
            ex. for cell(1, 2)
                row = A, column = A
                valueAt(1, 2) = valueAt(0, 1) + 1
                              = 0 + 1 = 1

         2) If the current cell(i, j) does not have same row and column name,
            then current cell value = {max(cell(i, j-1), cell(i-1, j)}
            and point it upward⬆️ if(valueAt(i, j-1) < valueAt(i-1, j)) else point it left⬅️.
            ex. for cell(1, 1)
                row = A, column = D
                valueAt(1, 1) = max(valueAt(1, 0), valueAt(0, 1))
                              = max(0, 0) = 0

                     D      A      C
              0      0      0      0
          A   0    0⬆️   1↖️    0⬆️
          D   0    1↖️   1⬆️    1⬅️
          C   0    1⬆️   1⬆️    2↖️
          B   0    1⬆️   1⬆️    2⬆️

  Step3: Finding LCS

         The last value in the LCS table is the length of the LCS.
         Now we will create a path from last cell using arrows.
         The path will be-

                     D       A      C
              0      0       0      0
          A   0    0🟥    1↖️    0🟥
          D   0    1🟥    1⬆️    1🟥
          C   0    1🟥    1🟥    2↖️
          B   0    1🟥    1🟥    2⬆️
          The cells with diagonal arrow is our answer.
          So, the result is AC.

# Time & Space Complexity
  Time Complexity:- O(m*n) <br>
  Space Complexity:- O(m*n) <br>
  m is length of first sequence, <br>
  n is length of second sequence

### NOTE:- 
If you take ADCB as row and DAC as column, then LCS will be AC <br>
And if you take DAC as row and ADCB as column, then LCS will be DC <br>
But still the length of LCS will be same.
