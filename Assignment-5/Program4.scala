/* Problem Statement :  Write a program which accept three numbers and print its multiplication.
                        Input :  5   4   7  
                        Output :  140  
                        
                        Input :  5   0   7  
                        Output :  35  
                        
                        Input :  5   0   0  
                        Output :  5  
                        
                        Input :  0   0   0  
                        Output :  0 
*/

object Test
{
    def main(args:Array[String]) : Unit = 
    {
        var iNo1 = 0;
        var iNo2 = 0;
        var iNo3 = 0;
        var result = 0;
        println("Enter first number");
        iNo1 = scala.io.StdIn.readInt();
        println("Enter second number");
        iNo2 = scala.io.StdIn.readInt();
        println("Enter third number");
        iNo3 = scala.io.StdIn.readInt();

        if(iNo1==0)
        {
            if(iNo2==0)
            {
                if(iNo3==0)
                {
                    result = 0;
                }
                else
                {
                    result = iNo3;
                }
            }
            else if(iNo3==0)
            {
                result = iNo2;
            }
            else
            {
                result = iNo2*iNo3;
            }
        }
        else if(iNo2==0)
        {
            if(iNo3==0)
            {
                result = iNo1;
            }
            else
            {
                result = iNo1*iNo3;
            }
        }
        else if(iNo3==0)
        {
              result = iNo1*iNo2;
        }
        else
        {
            result = iNo1*iNo2*iNo3;
        }
        println(s"Result is : $result");
    }
}