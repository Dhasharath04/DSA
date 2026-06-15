class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
        int count=0;
            
        for(int k=0;k<=i;k++)
        {  
            for(int j=0;j<=i;j++)
            {
                if(A[k]==B[j])
                {
                    // System.out.println(A[i]+" "+B[j]);
                    count++;
                  }
                  }      
                   }  
        arr[i]=count;   
        }
        return arr;
    }
}