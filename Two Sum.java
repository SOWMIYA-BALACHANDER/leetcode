class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = nums.length;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(i!=j){
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }}
        }
        return new int[]{};
    }
    public void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] nums = new int[a];
        for(int i=0;i<a;i++){
            nums[i] = input.nextInt();
        }
        int target = input.nextInt();
        int[] d = twoSum(nums,target);
        System.out.print(d);
    }
}
