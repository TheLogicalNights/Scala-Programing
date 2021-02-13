// Problem Statement :  Accept number from user and check whether number is even or odd.

object Test
{
    def main(args:Array[String]) : Unit = 
    {
        var iNo = 0;
        println("Enter a number");
        iNo = scala.io.StdIn.readInt();
        if(iNo % 2==0)
        {
            println(s"$iNo is even number");
        }
        else
        {
            println(s"$iNo is odd number");
        }  
    }
}