package mySqrt;

class Solutions {
    public int mySqrt(int x) {
        // Use binary search to find the square root
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1, end = x, result = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid*mid is equal to x
            if (mid == x / mid) {
                return mid;
            }

            // If mid*mid is less than x, move to the right
            if (mid < x / mid) {
                start = mid + 1;
                result = mid; // Store the result
            } else {
                end = mid - 1; // Move to the left
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solutions solution = new Solutions();
        int number = 120;
        int result = solution.mySqrt(number);

        System.out.println("Input: " + number);
        System.out.println("Output: " + result);
        System.out.println("Explanation: The integer part of the square root of " + number + " is " + result + ".");
    }
}
