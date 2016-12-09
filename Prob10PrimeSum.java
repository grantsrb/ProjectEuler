import java.util.List;
import java.util.ArrayList;

public class Prob10PrimeSum {
  public static void main(String[] args) {
    List<Integer> primes = new ArrayList<Integer>();
    long finalSum = 0;
    primes.add(2);
    for (int i = 3; i < 2000000; i+=2) {
      primes.add(i);
    }
    for (int i = 2; i < 2000; i++) {
      int primesIndex = 0;
      while (primesIndex < primes.size()) {
        if (primes.get(primesIndex) % i == 0 && primes.get(primesIndex) != i) {
          primes.remove(primesIndex);
          primesIndex--;
        }
        primesIndex++;
      }
    }

    for (int i = 0; i < primes.size(); i++) {
      finalSum += primes.get(i);
    }
    System.out.println(finalSum);
  }
}
