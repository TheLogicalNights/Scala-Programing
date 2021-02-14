// Problem Statement : Write a program which accept total marks & obtained marks from user and calculate percentage

object Test
{
    def main(args:Array[String]) : Unit = 
    {
        var iTotal:Float = 0.0f;
        var iObtain:Float = 0.0f;
        var fPercentage:Float = 0.0f;
        println("Enter obtained marks");
        iObtain = scala.io.StdIn.readFloat();
        println("Enter total marks");
        iTotal = scala.io.StdIn.readFloat();
        fPercentage = (iObtain)/(iTotal);
        fPercentage = fPercentage*100;
        println(s"Percentage : $fPercentage")
    }
}