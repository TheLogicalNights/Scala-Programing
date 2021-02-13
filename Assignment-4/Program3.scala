// Problem Statement : Write a program which accept number from user and print even factors of that number. 

object Test
{
    def main(args:Array[String]) : Unit = 
    {
        var iNo = 0;
        println("Enter a number");
        iNo = scala.io.StdIn.readInt();
        for(i<- 1 to iNo/2)
        {
            if(iNo%i==0)
            {
                if(i%2==0)
                {
                    print(s"$i\t");
                }
            }
        }
        println();
    }
}