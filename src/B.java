/**
 * Question 3:
 * In this problem, we were restricted to change no-argument constructor only.
 * And that is why, I called parameterized constructor with the arguments "Hello" and "World!".
 *
 * @author Udayan Khattry
 */
public class B {
    public String msg1; //default value null
    public String msg2; // default value null

    /**
     * No-argument constructor.
     * It calls the parameterized constructor with values "Hello" and "World!".
     */
    public B() {
        this("Hello", "World!");
    }

    public B(String s1, String s2) {
        msg1 = s1;
        msg2 = s2;
    }

    public void print() {
        System.out.println(msg1 + " " + msg2);
    }
}
