public class SingleNumber {
    public int result = 0;nums=[1,2,3,4,2,1,3]

    for(
    int i = 0;i<nums.length;i++)
    {
        result ^= nums[i];
    }return result;
}
