/* Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
Note: The second largest element should not be equal to the largest element. */
class Solution 
{
    int getSecondLargest(int arr[]) 
    {
        int n=arr.length;
        int large2=Integer.MIN_VALUE,large=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>large)
            {
                large2=large;
                large=arr[i];
            }
            else if(arr[i]!=large && arr[i]>large2)
            {
                large2=arr[i];
            }
        }
        if(large2==Integer.MIN_VALUE)
        return -1;
        return large2;
    }
}
