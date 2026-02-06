public class RangeSumQuery {

    private int[] prefixSum;3 4

    public NumArray(int[] nums) { // prefix summs array
5        prefixSum = new int[nums.length + 1]; 
6
7        for (int i = 0; i < nums.length; i++){
8            prefixSum[i + 1] = prefixSum[i] + nums[i];
9        }
10  


}

    11

    12

    public int sumRange(int left, int right) {
13        return prefixSum[right + 1] - prefixSum[left];
14        
15    
}16

}
