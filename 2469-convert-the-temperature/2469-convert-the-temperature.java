class Solution {
    public double[] convertTemperature(double celsius) {
        double[] arr=new double[2];
        double d1=celsius+273.15;
        double d2=celsius* 1.80 + 32.00;
        arr[0]=d1;
        arr[1]=d2;
        return arr;
        
    }
}