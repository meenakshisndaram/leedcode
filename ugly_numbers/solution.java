package ugly_numbers;

class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }
            else if(n%3==0){
                n=n/3;
            }
            else if(n%5==0){
                n=n/5;
            }
            else{
                break;
            }
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int n=9;
        boolean status=s.isUgly(9);
        System.out.print(status);
    }
}