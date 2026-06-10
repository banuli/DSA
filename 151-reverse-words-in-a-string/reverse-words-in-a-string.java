class Solution {
    public String reverseWords(String s) {
        
        // spilt the word into any array
        String[] words =  s.split(" +");
        int n = words.length;
        StringBuilder sb = new StringBuilder();

        for(int i=n-1;i>=0;i--){
            if(i != n-1){
                sb.append(" ");
            }
            sb.append(words[i]);
        }

        return sb.toString().trim();
    }
}