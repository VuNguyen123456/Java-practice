interface MathExpressions
{
    // An abstract function
    void operate(double x, double y);
 
}
 
class LambdaPractice
{
    public static void main(String args[])
    {

        MathExpressions fobj = (double x, double y) -> {System.out.println(x + y);};
        fobj.operate(7.0, 3.0);
        
        fobj = (double x, double y) -> {System.out.println((2*x)/(7*y));};
        fobj.operate(7.0, 3.0);
        
        fobj= (double x, double y) -> {System.out.println(2*x + x*y - 3*y + 73);};
        fobj.operate(7.0, 3.0);
        
    }
}
