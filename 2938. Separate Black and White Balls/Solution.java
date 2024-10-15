class Solution {
    public long minimumSteps(String s) {
        long c=0;
        long f=0;

        //just simply counting the 0's that present rigth side of 1's
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                f++; // counting 1's
            }
            else{
                c+=f; // so if there is a 0 then based on the 1's present before it we increse the count. 
            }
        }
        return c;
    }
}