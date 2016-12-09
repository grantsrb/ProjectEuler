public class Prob9PythagTriplets {
  public static void main(String[] args) {
    int a = 1, b = 2, c = 997;

    boolean matchedTriplet = false;
    for (int i = 1; i < 333; i++) {
      int j = i;
      int k = 1000 - i - j;
      do {
        j++;
        k = 1000 - i - j;
        if(i*i + j*j == k*k) {
          matchedTriplet = true;
        }
      } while (k > j && matchedTriplet == false);
      if (matchedTriplet) {
        a = i;
        b = j;
        c = k;
        break;
      }
    }
    System.out.println(a*b*c);
  }
}
