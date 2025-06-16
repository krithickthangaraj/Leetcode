class Solution {
    public int majorityElement(int[] nums) {
        // Moone's voting Algo
        int element = nums[0]; // if only one element in the array
        int count = 0;

        for(int i=0 ; i<nums.length ; i++)
        {
            if(count == 0)
            {
                count = 1;
                element = nums[i];
            }
            else if(element == nums[i])     count++;
            else      count--;
        }

        int elementCount = 0;
        for(int i=0 ; i<nums.length ; i++)      if(element == nums[i])  elementCount++;

        if(elementCount > (nums.length/2))  return element;

        return element; 
    }
}