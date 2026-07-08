class Solution {
    public String convertToTitle(int columnNumber) {
        // use base 26 and calculate
        String res ="";

        while(columnNumber > 0){
            int rem = (columnNumber-1) %26;
            char ch = (char)(rem +'A');
            res = ch+res;
            columnNumber = (columnNumber-1)/26;
        }
        return res;
    }
}