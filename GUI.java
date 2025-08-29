
import javax.swing.*;
import java.awt.*;

public class Test {
 public static void main(String[] args) {
  JFrame f = new JFrame();
  window1 w=new window1();

 }
}

class window1 extends JFrame{
 public window1(){
  setLayout(new FlowLayout(FlowLayout.CENTER));
  setTitle("First GUI");
  setVisible(true);
  setSize(300,300);

  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JTextField t1 = new JTextField(10);
  JTextField t2 = new JTextField(10);
  JButton b1 = new JButton("Click Me");

  add(t1);
  add(t2);
  add(b1);

 }

}
