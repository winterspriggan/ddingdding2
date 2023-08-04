import javax.swing.*;
import java.awt.*;

public class ChatPanel extends JPanel {
    JLabel jLabel;
    JTextArea jTextArea;

    public ChatPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        jTextArea = new JTextArea();
        jTextArea.setBackground(Color.GRAY);
        JScrollPane jScrollPane = new JScrollPane(jTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jTextArea.setEditable(false);
        this.add(jScrollPane);
    }
    public void setTextArea(String t) {
        jTextArea.append(t+"\n");
    }

}
