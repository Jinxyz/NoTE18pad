import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class guiformtest {

    private JPanel RootPanel;
    private JTextArea textArea;
    private JButton ctrlCctrlVButton;
    private JButton saveAsButton;


    public guiformtest() {
        ctrlCctrlVButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textArea.getText();
                textArea.append(text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Nötpadda");
        frame.setContentPane(new guiformtest().RootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300,300);
        frame.setVisible(true);
    }



}
