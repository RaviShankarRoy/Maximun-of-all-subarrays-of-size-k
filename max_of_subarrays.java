class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(j<n){
            while(b.size()>0&&b.get(b.size()-1)<arr[j]){
                b.remove(b.size()-1);
            }b.add(arr[j]);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                a.add(b.get(0));
                if(b.get(0)==arr[i])
                    b.remove(0);
                i++;
                j++;
            }
            
        }
        return a;
    }
}
