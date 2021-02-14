// Program Statement : Write a program which accept number from user and display its factors in decreasing order. 

object Test
{
    def main(args:Array[String]) : Unit = 
    {
        var iNo = 0; 
        println("Enter a number");
        iNo = scala.io.StdIn.readInt();
        for(i<-iNo/2 to (1,-1))
        {
            if(iNo%i==0)
            {
                print(s"$i\t");
            }
        }
    }
}