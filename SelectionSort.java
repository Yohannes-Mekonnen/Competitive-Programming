class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        return arr[i];
	}
	
	void selectionSort(int arr[], int n)
	{
	    
	    //code here
	    for(int i=0; i<n; i++) {
	        for(int j=i; j<n; j++) {
	            if(arr[i] > arr[j]) {
	                int swap = arr[i];
	                arr[i] = arr[j];
	                arr[j] = swap;
	            }
	        }
	    }
	    
	}
}
