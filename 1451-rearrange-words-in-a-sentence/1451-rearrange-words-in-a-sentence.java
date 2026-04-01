class Solution {
    public String arrangeWords(String text) {
        text=text.toLowerCase();
        String[] str=text.split(" ");
        Arrays.sort(str,(a,b)->a.length()-b.length());
        String r=String.join(" ",str);
        return Character.toUpperCase(r.charAt(0))+r.substring(1);

        
    }
}