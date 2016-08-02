/* Problem 1
  If we list all the natural numbers below 10 that are multiples of 3 or 5,
  we get 3, 5, 6 and 9. The sum of these multiples is 23.

  Find the sum of all the multiples of 3 or 5 below 1000.
*/

#include <iostream>
using namespace std;

int main() {
  int finSum = 0;
  for (int count = 0; count < 1000; count ++) {
    if (count % 3 == 0)
      finSum += count;
    else if (count % 5 == 0)
      finSum += count;
  }
  cout << "The sum is: " << finSum << endl;

  return 0;
}
