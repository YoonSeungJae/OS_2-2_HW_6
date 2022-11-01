package opensource;
import javax.swing.*;
import java.awt.*;

public class P7 extends JFrame {

	public P7() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new P7_N(), BorderLayout.NORTH);
		c.add(new P7_C(),BorderLayout.CENTER);
		c.add(new P7_S(), BorderLayout.SOUTH);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new P7();
	}
}