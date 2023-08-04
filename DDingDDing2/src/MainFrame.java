import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    public MainFrame()  {
        this.setTitle("ChatBot DDingDDing2");
        this.setSize(600, 400);
        this.setLocation(200, 100); // 현재 윈도우의 중앙에 띄우는 방법 알아오
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout borderLayout = new BorderLayout();

        ChatPanel chatPanel = new ChatPanel();
        this.add(chatPanel, BorderLayout.NORTH);
        TextPanel textPanel = new TextPanel();
        this.add(textPanel, BorderLayout.SOUTH);

        textPanel.btnInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chatPanel.setLabel(textPanel.textArea.getText());
                textPanel.textArea.setText(" ");
            }
        });
    }
}
