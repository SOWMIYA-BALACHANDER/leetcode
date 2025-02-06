class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int o = x;
        int r = 0;
        while(x!=0){
            int d=x%10;
            r=r*10+d;
            x/=10;
        }
        return o==r;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        Solution solution = new Solution();
        boolean s = solution.isPalindrome(x);
        System.out.print(s);
    }
}