class Solution {
    ArrayList<Integer> find(int arr[], int target) {
        // code here
        ArrayList<Integer>  ans = new ArrayList<>();
       int low =0;
       int high = arr.length-1;
       int indx1 = -1;
       int indx2  = -1;
       while(low<=high){
           int mid = (low+high)/2;
           if(arr[mid] <target){
               low = mid+1;
           }
           else if(arr[mid]>target){
               high = mid -1;
           }
             else {
                  indx1 = mid;
                     high = mid -1;
               }
       }
       
       low = 0;
       high = arr.length-1;
       
        while(low<=high){
           int mid = (low+high)/2;
           if(arr[mid] <target){
               low = mid+1;
           }
           else if(arr[mid]>target){
               high = mid -1;
           }
             else{
                  indx2 = mid;
                    low = mid +1;
               }
       }
       
           ans.add(indx1);
        ans.add(indx2);
    
    return ans;
    }
}
