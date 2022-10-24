import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

public class Application extends JFrame {

    private JPanel mainPanel;
    private JTextField channelName;
    private JTextField dateToFrom;
    private JTextField keyWord;
    private JButton getResultButton;
    private JEditorPane editorPane1;

    public Application(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        getResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                editorPane1.setText("<a href=\"https://www.w3schools.com/\">Visit W3Schools.com!</a><br>\n" +
                        "<a href=\"https://www.w3schools.com/\">Visit W3Schools.com!</a><br>" +
                        "<a href=\"https://www.w3schools.com/\">Visit W3Schools.com!</a><br>" +
                        "<a href=\"https://www.w3schools.com/\">Visit W3Schools.com!</a><br>" +
                        "<a href=\"https://www.w3schools.com/\">Visit W3Schools.com!</a><br>" +
                        "<a href=\"https://www.w3schools.com/\">Visit W3Schools.com!</a><br>" );
            }
        });
        editorPane1.addHyperlinkListener(hyperlinkEvent -> {
            if(Desktop.isDesktopSupported()){
                try {
                    Desktop.getDesktop().browse(hyperlinkEvent.getURL().toURI());
                } catch (IOException | URISyntaxException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public static void main(String[] args) {
        Application application = new Application("Title");
        application.setVisible(true);
    }
}
