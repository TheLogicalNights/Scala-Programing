// Problem Statements : Accept two numbers from user and display first number in second number of times. 

object Test
{
    def main(args:Array[String]) : Unit = 
    {
        var iNo1 = 0;
        var iNo2 = 0;
        println("Enter first number");
        iNo1 = scala.io.StdIn.readInt();
        println("Enter second number");
        iNo2 = scala.io.StdIn.readInt();

        for(i<- 1 to iNo2)
        {
            print(s"$iNo1 \t");
        }
        println();
    }
}