import javax.swing.*;
import java.awt.*;

public class ChatPanel extends JPanel {
    JLabel jLabel;

    public ChatPanel() {
        GridLayout gridLayout = new GridLayout();
        this.setLayout(gridLayout);
    }
    public void setLabel(String t) {
        JLabel newLabel = new JLabel(t);
        this.add(newLabel);
    }

}
