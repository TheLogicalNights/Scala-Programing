// Problem Statement : Write a program which accept number from user and display all its non factors.

object Test
{
    def main(args:Array[String]) : Unit = 
    {
        var iNo = 0;
        println("Enter a number");
        iNo = scala.io.StdIn.readInt();
        for(i<-1 to iNo-1)
        {
            if(iNo%i!=0)
            {
                print(s"$i \t");
            }
        }
    }
}