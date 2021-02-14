// Problem Statement : Write a program which accept number from user and return difference between summation of all its factors and non factors. 

object Test
{
    def main(args:Array[String]) : Unit = 
    {
        var iNo = 0;
        var result = 0;
        println("Enter a number");
        iNo = scala.io.StdIn.readInt();
        for(i<-1 to iNo-1)
        {
            if(iNo%i==0)
            {
                result = result + i;
            }
            else
            {
                result = result - i;
            }
        }
        println(s"Difference is : $result");
    }
}