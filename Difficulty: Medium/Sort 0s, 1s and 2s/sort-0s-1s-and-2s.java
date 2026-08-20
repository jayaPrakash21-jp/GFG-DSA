class Solution {
    public void sort012(int[] arr) {
        int one=0;
        int two=0;
        int zero=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==1){
                one++;
            }
            else if(arr[j]==2){
                two++;
            }
            else{
                zero++;
            }
        }
        int i;
        for(i=0;i<zero;i++){
            arr[i]=0;
        }
        for(i=zero;i<zero+one;i++){
            arr[i]=1;
        }
        for(i=one+zero;i<arr.length;i++){
            arr[i]=2;
        }
        
       
        
    }
}