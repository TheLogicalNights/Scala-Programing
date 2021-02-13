// Problem Statement : Accept on character from user and check whether that character is vowel (a,e,i,o,u) or not.

object Test
{
    def main(args:Array[String]) : Unit = 
    {
        var cCh:Char = '0';
        println("Enter a character");
        cCh = scala.io.StdIn.readChar();
        if(cCh=='a' || cCh=='e' || cCh=='i' || cCh=='o' || cCh=='u' ||
           cCh=='A' || cCh=='E' || cCh=='I' || cCh=='O' || cCh=='U')
        {
            println(s"$cCh is vowel");
        }
        else
        {
            println(s"$cCh is consonant");
        }
    }
}