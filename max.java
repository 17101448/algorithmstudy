import java.util.*;


class Max{

    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 값의 최대값을 구합니다.");
        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.print("b의 값 : "); 
        int b = stdIn.nextInt();
        System.out.print("c의 값 : ");
        int c = stdIn.nextInt();

        int max = a;
        if(b>max)
        {
            max = b; 
            if(c>max)
            {
                max = c; 
            }//순차적으로 실행되면 결국 같은 것을 반복하므로 하나의 문장으로 합쳐도 된다. 
        }
        else if(c>max)
        {
            max = c; 
        }

        System.out.println(max); 
    }
}