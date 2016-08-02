
#include <iostream>
using namespace std;

int main() {
  int an = 1, an1 = 1;
  while (an <= 2187) {
    an = 3*an1;
    an1 = an;
    cout << an << endl;
  }
  return 0;
}
