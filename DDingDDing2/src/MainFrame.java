import javax.swing.*;

public class MainFrame extends JFrame{
    public MainFrame() {
        this.setTitle("ChatBot DDingDDing2");
        this.setSize(600, 400);
        this.setLocation(200, 100); // 현재 윈도우의 중앙에 띄우는 방법 알아오
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DPanel dPanel = new DPanel();
        this.add(dPanel);
    }
}
