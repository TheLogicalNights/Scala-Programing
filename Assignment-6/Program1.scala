// Problem Statement : Write a program which accept number from user and display its multiplication of factors. 

object Test
{
    def main(args:Array[String]) : Unit =
    {
        var iNo = 0;
        var result = 1;
        println("Enter a number");
        iNo = scala.io.StdIn.readInt();
        for(i<- 1 to iNo/2)
        {
            if(iNo%i==0)
            {
                result = result*i;
            }
        }
        println(s"Multiplication of factors is : $result");
    }
}