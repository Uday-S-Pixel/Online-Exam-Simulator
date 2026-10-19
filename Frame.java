
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Frame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Online Exam Simulator");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(450, 400));
        panel.setBackground(Color.CYAN);
        panel.setBorder(new EmptyBorder(25, 35, 25, 35));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel title = new JLabel("Online Exam Simulator");
        title.setFont(new Font("SansSerif", Font.BOLD, 24));
        title.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel loginLabel = new JLabel("Login");
        loginLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        loginLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JTextField usernameField = new JTextField();
        usernameField.setMaximumSize(
            new Dimension(Integer.MAX_VALUE, 35)
        );
        usernameField.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setMaximumSize(
            new Dimension(Integer.MAX_VALUE, 35)
        );
        passwordField.setAlignmentX(Component.LEFT_ALIGNMENT);

        JButton loginButton = new JButton("Login");
        loginButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        loginButton.setMaximumSize(new Dimension(150, 35));


        panel.add(title);
        panel.add(Box.createVerticalStrut(25));

        panel.add(loginLabel);
        panel.add(Box.createVerticalStrut(25));

        panel.add(usernameLabel);
        panel.add(Box.createVerticalStrut(5));
        panel.add(usernameField);
        panel.add(Box.createVerticalStrut(15));

        panel.add(passwordLabel);
        panel.add(Box.createVerticalStrut(5));
        panel.add(passwordField);
        panel.add(Box.createVerticalStrut(25));

        panel.add(loginButton);

        JPanel center = new JPanel(new GridBagLayout());
        center.setBackground(Color.GRAY);
        center.add(panel);
          

        frame.add(center, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
