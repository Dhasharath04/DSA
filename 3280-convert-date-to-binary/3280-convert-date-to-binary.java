class Solution {
    public String convertDateToBinary(String date) {
        
        // String str1=date.substring(0,4);
        // String str2=date.substring(5,7);
        // String str3=date.substring(8,10);
        // int n1=Integer.parseInt(str1);
        // int n2=Integer.parseInt(str2);
        // int n3=Integer.parseInt(str3);
        // String b1=Integer.toBinaryString(n1);
        // String b2=Integer.toBinaryString(n2);
        // String b3=Integer.toBinaryString(n3);
        String b1=Integer.toBinaryString(Integer.parseInt(date.substring(0,4)));
        String b2=Integer.toBinaryString(Integer.parseInt(date.substring(5,7)));
        String b3=Integer.toBinaryString(Integer.parseInt(date.substring(8,10)));
        return b1+"-"+b2+"-"+b3;
        
    }
}