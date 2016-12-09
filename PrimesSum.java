public class PrimesSum {
  public static void main(String[] args) {
    int[] primes = new int[1000000];
    int primesIndex = 1;
    long finalSum = 0;
    primes[0] = 2;
    for (int i = 3; i < 2000000; i+=2) {
      if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
        primes[primesIndex] = i;
      } else if (i == 3 || i == 5 || i == 7) {
        primes[primesIndex] = i;
      }
      primesIndex++;
    }

    for (int i = 9; i < 2000; i++) {
      int[] parallelPrimes = new int[primes.length];
      primesIndex = 0;
      int zeroCount = 0;
      while (primesIndex < primes.length) {
        if (primes[primesIndex] % i == 0 && primes[primesIndex] != i) {
          parallelPrimes[primesIndex] = 0;
          zeroCount++;
        } else {
          parallelPrimes[primesIndex] = primes[primesIndex];
        }
        primesIndex++;
      }
      int newPrimesLength = primes.length - zeroCount;
      primesIndex = 0;
      primes = new int[newPrimesLength];
      for (int j = 0; j < parallelPrimes.length; j++) {
        if (parallelPrimes[j] != 0) {
          primes[primesIndex] = parallelPrimes[j];
          primesIndex++;
        }
      }
    }

    for (int i = 0; i < primes.length; i++) {
      finalSum += primes[i];
    }
    System.out.println(finalSum);
  }
}
