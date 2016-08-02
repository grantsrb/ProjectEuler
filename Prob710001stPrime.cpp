// What is the 10 001st prime number?

#include <iostream>
using namespace std;

int main() {
  int primeCount = 2, primeNum = 3, tracker = 3, konte;
  bool trackerIsPrime;
  while (primeCount < 10001) {
    tracker += 2;
    konte = 2;
    trackerIsPrime = true;

    while (trackerIsPrime == true && konte*konte <= tracker) {
      if (tracker % konte == 0)
        trackerIsPrime = false;
      konte++;
    }
    if (trackerIsPrime) {
      primeCount++;
      primeNum = tracker;
    }
    if (primeCount < 100)
      cout << primeCount << "th prime: " << primeNum << endl;
  }

  cout << primeCount << "st prime: " << primeNum << endl;
  return 0;
}
