
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class ExamSelection extends JFrame {

    private String[] names = {
        "Java Programming",
        "Data Structures and Algorithms",
        "Operating Systems",
        "Computer Networks",
        "Database Management Systems"
    };

    private String[] questions = {"20", "25", "20", "25", "20"};
    private String[] duration = {"30 min", "45 min", "30 min", "45 min", "30 min"};
    private String[] marks = {"20", "25", "20", "25", "20"};
    private String[] difficulty = {
        "Beginner", "Intermediate", "Intermediate",
        "Intermediate", "Intermediate"
    };

    public ExamSelection() {
        setTitle("Online Exam Simulator - Select Examination");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel main = new JPanel(new BorderLayout(15, 15));
        main.setBackground(new Color(245, 247, 252));
        main.setBorder(new EmptyBorder(25, 30, 25, 30));
        setContentPane(main);

        JPanel header = new JPanel(new BorderLayout());
        header.setOpaque(false);

        JLabel title = new JLabel("Select Your Examination");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setForeground(new Color(35, 45, 75));

        JLabel subtitle = new JLabel(
            "Choose an exam and test your knowledge"
        );
        subtitle.setFont(new Font("Arial", Font.PLAIN, 15));

        JPanel headings = new JPanel(new GridLayout(2, 1, 0, 5));
        headings.setOpaque(false);
        headings.add(title);
        headings.add(subtitle);

        header.add(headings, BorderLayout.WEST);
        main.add(header, BorderLayout.NORTH);

        JPanel examPanel = new JPanel(new GridLayout(0, 2, 18, 18));
        examPanel.setOpaque(false);

        for (int i = 0; i < names.length; i++) {
            final int index = i;

            JPanel card = new JPanel(new BorderLayout(8, 10));
            card.setBackground(Color.WHITE);
            card.setBorder(new CompoundBorder(
                new LineBorder(new Color(220, 225, 235), 1, true),
                new EmptyBorder(18, 18, 18, 18)
            ));

            JLabel examName = new JLabel(names[i]);
            examName.setFont(new Font("Arial", Font.BOLD, 18));
            examName.setForeground(new Color(45, 65, 110));

            JLabel details = new JLabel(
                "<html>Total Questions: " + questions[i] +
                "<br>Duration: " + duration[i] +
                "<br>Total Marks: " + marks[i] +
                "<br>Difficulty: " + difficulty[i] + "</html>"
            );
            details.setFont(new Font("Arial", Font.PLAIN, 14));

            JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
            buttons.setOpaque(false);

            JButton start = new JButton("Start Exam");
            start.setBackground(new Color(55, 100, 220));
            start.setForeground(Color.WHITE);
            start.setFocusPainted(false);

            JButton instructions = new JButton("View Instructions");

            start.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(
                        ExamSelection.this,
                        "Selected Exam: " + names[index] +
                        "\nThe exam questions will be connected next.",
                        "Start Exam",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }
            });

            instructions.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(
                        ExamSelection.this,
                        "Exam Instructions\n\n" +
                        "1. Read each question carefully.\n" +
                        "2. Complete the exam within the time limit.\n" +
                        "3. Check your answers before submitting.\n" +
                        "4. Do not close the exam during the test.",
                        names[index],
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }
            });

            buttons.add(start);
            buttons.add(instructions);

            card.add(examName, BorderLayout.NORTH);
            card.add(details, BorderLayout.CENTER);
            card.add(buttons, BorderLayout.SOUTH);

            examPanel.add(card);
        }

        JScrollPane scroll = new JScrollPane(examPanel);
        scroll.setBorder(null);
        scroll.getViewport().setBackground(
            new Color(245, 247, 252)
        );

        main.add(scroll, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ExamSelection();
            }
        });
    }
}
