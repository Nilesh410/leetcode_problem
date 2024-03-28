/* input =>nums=[int]
        target=int

output=> [int index array]

condition=> nums [index1]+nums[index2]=target */


var twosum=function(nums,target)
{
   for(let i=0;i<nums.length;i++)
   {
     let ele1=nums[i]
     let index1=i;
     let ele2=target-ele1
     if(nums.includes(ele2))
     {
        let index2=nums.indexOf(ele2)
        if(index1!=index2)
        {
            return [index1,index2]
        }
     }
   }
}

//let nums=[2,7,11,15]
let nums=[3,2,4]
//let target=9
let target=6
console.log(twosum(nums,target))