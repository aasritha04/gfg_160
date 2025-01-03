class Solution {
    void pushZerosToEnd(int[] arr) 
    {
        int n=arr.length,ind=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;
                ind++;
            }
        }
        
    }
}
