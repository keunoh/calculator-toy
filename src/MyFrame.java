import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");

        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));

        JButton cancel = new JButton("c");
        JButton add = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiple = new JButton("*");
        JButton divide = new JButton("/");
        JButton result = new JButton("=");

        JButton zero = new JButton("0");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");

        this.add(seven);
        this.add(eight);
        this.add(nine);
        this.add(divide);

        this.add(four);
        this.add(five);
        this.add(six);
        this.add(multiple);

        this.add(one);
        this.add(two);
        this.add(three);
        this.add(minus);

        this.add(cancel);
        this.add(zero);
        this.add(add);
        this.add(result);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
