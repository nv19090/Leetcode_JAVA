class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fivecoin=0;
        int tencoin=0; 
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                fivecoin++;
            }
            else if(bills[i]==10){
                fivecoin--;
                tencoin++;
                 if(fivecoin<0) return false;
            }
            else{
                if(tencoin>0){
                fivecoin--;
                tencoin--;
                }
                else{
                    fivecoin-=3;
                }
                 if(fivecoin<0) return false;
            }
        }
        return true;
    }
}
