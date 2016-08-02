/* Problem 3
  What is the largest prime factor of the number 600851475143?
*/

#include <iostream>
using namespace std;

int main() {
  long suspectNum = 600851475143, count = 2, largestPrimeFactor = 0;
  bool targetIsPrime = true; // Checks for primeness of main number

  while (count*count < suspectNum) {
    if (suspectNum % count == 0) {
      targetIsPrime = false; // Checks for primeness of main number
      bool factorIsPrime = true; // Used to check primeness of factor
      long konte = 2;

      while (factorIsPrime == true && konte*konte < count) {
        if (count % konte == 0)
          factorIsPrime = false;
        konte++;
      }

      if (factorIsPrime == true)
        largestPrimeFactor = count;
    }
    count++;
  }
  if (targetIsPrime)
    largestPrimeFactor = suspectNum;

  cout << "The largest prime factor is: " << largestPrimeFactor << endl;

  return 0;
}
