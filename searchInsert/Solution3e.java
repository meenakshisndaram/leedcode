package searchInsert;

class Solution3e {
    public static int searchInsert(int[] x, int target) {
        int numberindex = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == target) {
                
                return numberindex;
            } else {
                if (x[i]>target)
                    break;
                numberindex++;
            }
        }
        return numberindex;
    }

    public static void main(String[] args) {
        int[] num = {1, 3, 5, 6};
        int Numbertfind =7;
        int index = searchInsert(num, Numbertfind);  // Now it uses searchInsert
        System.out.println(index);
    }
}
