import javax.swing.*;

public class guiformtest {

    private JPanel RootPanel;
    private JTextArea textArea;
    private JButton saveButton;
    private JButton button1;
    private JButton button2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Nötpadda");
        frame.setContentPane(new guiformtest().RootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
