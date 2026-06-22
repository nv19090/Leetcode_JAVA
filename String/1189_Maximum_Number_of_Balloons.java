class Solution {
    public int maxNumberOfBalloons(String text) {
        int n=text.length();
        int [] arr=new int[5];
        Arrays.fill(arr,0);
        for(int i=0;i<n;i++){
            if(text.charAt(i)=='b') arr[0]++;
            
            if(text.charAt(i)=='a') arr[1]++;
            
            if(text.charAt(i)=='l') arr[2]++;
            
           if(text.charAt(i)=='o') arr[3]++;
                
             if(text.charAt(i)=='n') arr[4]++; 

        }
        arr[2]=arr[2]/2;
        arr[3]=arr[3]/2;
        int mn=Integer.MAX_VALUE;
        for(int num:arr){
            mn=Math.min(mn,num);
        }
        return mn;
    }
}
