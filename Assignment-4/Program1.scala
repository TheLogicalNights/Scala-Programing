// Problem Statement : Write a program which accept one number from user and print that number of even numbers on screen.  

object Test
{
    def main(args:Array[String]) : Unit = 
    {
        var iNo = 0;
        var iCnt = 1;
        println("Enter a number");
        iNo = scala.io.StdIn.readInt();
        while(iNo>0)
        {
            if(iCnt%2==0)
            {
                print(s"$iCnt\t");
                iNo-=1;
            }
            iCnt+=1;
        }
    }
}