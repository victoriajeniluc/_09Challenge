/**
 * Question2:
 * In this solution, I added 4 constructors.
 * I also initialized str to "JAVA" so that if I don't pass String value,
 * then it will be initialized to "JAVA".
 * But if I pass a String value, then str value will be overridden.
 *
 * @author Udayan Khattry
 */

public class A {
    public String str = "JAVA";//If we don't pass String value then str should be initialized to "JAVA"
    public double val;//default value is 0.0


    /**
     * As we had provided other constructors, so need to provide no-arg constructor.
     * Otherwise A a1 = new A(); will fail.
     */
    public A(){

    }

    public A(String strUser) {
        str = strUser;
    }

    public A(double d) {
        val = d;
    }

    public A(String s, double d) {
        str = s;
        val = d;
    }

    public void print() {
        System.out.println("str: " + str + ", val: " + val);
    }
}
