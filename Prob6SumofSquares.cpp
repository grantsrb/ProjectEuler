/*
  Problem 6
    Find the difference between the sum of the squares of the first
    one hundred natural numbers and the square of the sum.
*/

#include <iostream>
#include <cmath>
using namespace std;

int main() {
  int sumSquare, squareSum, finalAnswer;
  for (int count = 1; count < 101; count ++) {
    sumSquare += count*count;
  }
  for (int count = 1; count < 101; count ++) {
    squareSum += count;
  }
  squareSum = squareSum * squareSum;
  squareSum > sumSquare ? finalAnswer = squareSum - sumSquare : finalAnswer = sumSquare - squareSum;
  cout << finalAnswer << endl;
  return 0;
}
