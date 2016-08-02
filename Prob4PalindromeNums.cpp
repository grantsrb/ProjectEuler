// Find the largest palindrome made from the product of two 3-digit numbers.

#include <iostream>
#include <string>
#include <cstdlib>
#include <sstream>
using namespace std;

int main() {
  string castCatcher;
  bool goalFound = false;
  int largestPalindrome,konte,index,count = 997;
  while (count >= 100 && !goalFound) {
    stringstream converterToString;
    converterToString << count;
    castCatcher = converterToString.str();
    // index = 3; // Used to mirror the palindrome
    for (konte = 2; konte >= 0; konte--) {
      castCatcher = castCatcher + castCatcher.at(konte);
      // index++;
    }
    istringstream (castCatcher) >> largestPalindrome;
    konte = 999;
    while (konte > 99 && !goalFound) {
      if (largestPalindrome % konte == 0) {
        if ((largestPalindrome/konte) > 99 && (largestPalindrome/konte) < 1000) {
          goalFound = true;
          cout << konte << " " << largestPalindrome/konte << endl;
        }
      }
      konte--;
    }
    count--;
  }
  if (!goalFound)
    cout << "No such palindrome exists" << endl;
  else
    cout << "The largest palindrome is: " << largestPalindrome << endl;

  return 0;
}
