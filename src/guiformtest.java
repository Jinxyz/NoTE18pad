import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class guiformtest {

    private JPanel RootPanel;
    private JTextArea textArea;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Nötpadda");
        frame.setContentPane(new guiformtest().RootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);


        JMenuBar MenuBar = new JMenuBar();
        frame.setJMenuBar(MenuBar);

        JMenu file = new JMenu ("File");
        MenuBar.add(file);

        JMenuItem open = new JMenuItem("Open File");
            file.add(open);

            JMenuItem save = new JMenuItem("Save As");
            file.add(save);

        frame.pack();
        frame.setVisible(true);
    }
    String txt = textArea.getText();
}