package homeWorks.exeptions;

public class exercise1 {
    public static void main(String[] args) throws
            CannotDivideBy0Exception {
        MathUtils.divide(10, 0);
    }
}
class CannotDivideBy0Exception extends Exception{
    public CannotDivideBy0Exception() {
        super ("Cant divide by 0");
    }
}
class MathUtils {
    public static float divide(int a, int b) throws
            CannotDivideBy0Exception{
        if (b == 0) {
            throw new CannotDivideBy0Exception();

        }
        return a / b;
    }
}


// Create the divide method which has to divide the two numbers
// that are the attributes of the method. In case the second parameter
// of the method is 0, a non-default exception should be thrown:
// CannotDivideBy0Exception .