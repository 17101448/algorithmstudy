public class maxagorithmstest {
    
    static int Max(int a, int b, int c)
    {
        int max = a; 

        if(b>max)
        {
            max=b; 
        }
        if(c>max)
        {
            max = c;    
        }

        return max; 
    }

// 검증을 위해 입력값을 넣을 때도 프로그래밍을 이용해서 넣어주는 것이 좋다. 
    public static void main(String[] args)
    {
        for(int i= 1; i<4; i++)
        {
            for(int j=1; j<4; j++)
            {
                for(int k=1; k<4; k++)
                {
                    System.out.println("Max: "+Max(i, j, k)+", i : "+i+", j : "+j+", k :"+k); 
                }
            }
        }
    }


}
