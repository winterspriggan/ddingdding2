import javax.swing.*;

public class TextPanel extends JPanel {
    JButton btnInput;
    JTextArea textArea;
    public TextPanel() {
        textArea = new JTextArea();
        this.add(textArea);
        btnInput = new JButton("입력");
        this.add(btnInput);
    }
}
