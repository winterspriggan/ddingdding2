import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    JButton btnInput;
    JTextField textfield;
    public TextPanel() {
        this.setBackground(Color.BLUE);
        textfield = new JTextField("띵띵이에게 말을 걸어보세요");
        this.add(textfield);
        btnInput = new JButton("입력");
        this.add(btnInput);
    }
}
