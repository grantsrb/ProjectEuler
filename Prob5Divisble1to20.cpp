// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
//  For 1-10 it is 2520
// Worth noting that if divisble by:
// 20:  1,2,4,5,10
// 18:  1,2,3,6,9
// 16:  1,2,4,8
// 14:  1,2,7

#include <iostream>
#include <cmath>
using namespace std;

int main() {
  long int goalNum = 2520;
  bool goalFound = false;
  while (!goalFound) {
    goalNum += 20;
    if (goalNum % 19 == 0) {
      if (goalNum % 17 == 0) {
        if (goalNum % 12 == 0) {
          if (goalNum % 13 == 0) {
            if (goalNum % 11 == 0) {
              if (goalNum % 18 == 0) {
                if (goalNum % 16 == 0) {
                  if (goalNum % 14 == 0) {
                    if (goalNum % 15 == 0 )
                      goalFound = true;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  cout << goalNum << endl;
  return 0;
}
