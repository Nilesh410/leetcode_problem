
public class Problem_no_1{
    public static void main(String[] args) 
    {
        int [] nums={2,7,11,15};
        int target=9;
        int result[]=twosum(nums,target);
        if(result!=null)
        {
            for(int i=0;i<result.length;i++)
            {
                System.out.println(result[i]);
            }
        }
        else
        {
            System.out.println("no solution");
        }
       
    }
    public static int[] twosum(int[] nums, int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            int ele1=nums[i];
            int index1=i;
            int ele2=target-ele1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]==ele2)
                {
                    int index2=j;
                    if(index1!=index2)
                    {
                        int [] result={index1,index2};
                        return result;
                    }
                }
                
            }
        }
        return null;
    }
}