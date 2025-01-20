package countPrimes;

class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        boolean[] isPrime = new boolean[n];
        int limit= (int) Math.sqrt(n);
         for(int i =2;i<=limit;i++) {
             if (isPrime[i] == false) {
                 for (int j = i * i; j<n;j+=i) {
                     isPrime[j]=true;

                 }
             }
         }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]==false) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10;
        System.out.println("Number of primes less than " + n + ": " + solution.countPrimes(n));
    }
}
