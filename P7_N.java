package opensource;
import java.awt.*;
import javax.swing.*;

public class P7_N extends JPanel {
	public P7_N() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JLabel("수식입력"));
		add(new JTextField(18));
	}
}