
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Frame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Online Exam Simulator");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Login card
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(450, 400));
        panel.setBackground(Color.CYAN);
        panel.setBorder(new EmptyBorder(25, 35, 25, 35));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // App title
        JLabel title = new JLabel("Online Exam Simulator");
        title.setFont(new Font("SansSerif", Font.BOLD, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Login heading
        JLabel loginLabel = new JLabel("Login");
        loginLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        loginLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Username
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JTextField usernameField = new JTextField();
        usernameField.setMaximumSize(
            new Dimension(Integer.MAX_VALUE, 35)
        );
        usernameField.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Password
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setMaximumSize(
            new Dimension(Integer.MAX_VALUE, 35)
        );
        passwordField.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.setMaximumSize(new Dimension(150, 35));

        // Add components with consistent spacing
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

        // Center the login card in the window
        JPanel center = new JPanel(new GridBagLayout());
        center.add(panel);

        frame.add(center, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
