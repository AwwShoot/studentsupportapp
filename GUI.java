import java.util.Scanner;
public class GUI {
    Scanner input = new Scanner(System.in);
    public String nextInput() {
        return input.next();
    }
    public void display(String value) {
        System.out.println(value);
    }
}
