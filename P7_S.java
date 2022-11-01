package opensource;
import java.awt.*;
import javax.swing.*;

public class P7_S extends JPanel {
	public P7_S() {
		setBackground(Color.YELLOW);
		setLayout(new FlowLayout());
		add(new JLabel("계산 결과"));
		add(new JTextField(18));
	}
}