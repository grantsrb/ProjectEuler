/* Problem 2
  By considering the terms in the Fibonacci sequence whose values do not
  exceed four million, find the sum of the even-valued terms.
*/

#include <iostream>
using namespace std;

int main() {
  int an1 = 1, an2 = 1, an3 = 2, finSum = 2;
  while (an3 < 4000000) {
    an1 = an2;
    an2 = an3;
    an3 = an1+an2;

    if (an3 % 2 == 0)
      finSum += an3;
  }

  cout << "The final sum is: " << finSum << endl;

  return 0;
}
