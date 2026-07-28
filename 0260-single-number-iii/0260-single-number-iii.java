class Solution {
    public int[] singleNumber(int[] a) {
        int b[]=new int[2];
        int l=0;
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
            if(c==1){
                b[l]=a[i];
                l++;
            }
            
        }
       
        return b;
    }
}