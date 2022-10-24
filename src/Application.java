import javax.swing.*;

public class Application extends JFrame {

    private JPanel mainPanel;
    private JTextField keyWord;
    private JTextField channelName;

    public Application(String title)
    {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args){
        Application application = new Application("Title");
        application.setVisible(true);
    }
}
