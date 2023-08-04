import javax.swing.*;
import java.awt.*;

public class ChatPanel extends JPanel {
    JLabel jLabel;
    JTextArea jTextArea;

    public ChatPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JScrollPane jScrollPane = new JScrollPane();
        this.add(jScrollPane);
        jTextArea = new JTextArea();
        jTextArea.setBackground(Color.GRAY);
        this.add(jTextArea);
    }
    public void setTextArea(String t) {
        jTextArea.append(t+"\n");
    }

}
