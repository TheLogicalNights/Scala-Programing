// PRoblem Statements :  Write a program which accept name from user and print that name.  

object Name
{
    def main(args:Array[String]) : Unit = 
    {
        println("Enter your name");
        val sName:String = scala.io.StdIn.readLine();
        println(sName);
    }
}