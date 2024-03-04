package net.ceymikey;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * I know that if I do not add any comments I will think what the hell
 * was I trying to write here because Java swing is just weird
 * ¯\_(ツ)_/¯
 */
class Main extends JFrame implements ActionListener {
    static JTextField t;
    static JFrame f;
    static JButton b;
    static JLabel l;
    static JTextArea sidebar;
    static JMenuBar mb; // Header components
    static JMenuItem m1, m2, m3; // Still a header component
    static JMenu x; // Guess what

    // Oke it ends here ig

    Main() {
    }

    public static void main(String[] args) {
        f = new JFrame("Even more intelligent IDEA");

        // creates us a header
        mb = new JMenuBar();

        x = new JMenu("Files");

        m1 = new JMenuItem("New");
        m2 = new JMenuItem("Open");
        m3 = new JMenuItem("Import");

        // Adds our custom components to the header
        x.add(m1);
        x.add(m2);
        x.add(m3);

        mb.add(x);
        f.setJMenuBar(mb);

        // Sidebar
        sidebar = new JTextArea();
        sidebar.setEditable(false);
        JScrollPane sidebarScrollPane = new JScrollPane(sidebar);
        sidebarScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sidebar.setText("Files:\nCoolCeymikey.java");

        l = new JLabel("nothing entered");
        b = new JButton("submit");
        mb = new JMenuBar();
        Main te = new Main();
        b.addActionListener(te);
        t = new JTextField(16);
        Font fo = new Font("Serif", Font.BOLD, 30);
        t.setFont(fo);
        JPanel p = new JPanel();
        p.add(t);
        p.add(b);
        p.add(l);

        Container contentPane = f.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(sidebarScrollPane, BorderLayout.WEST);
        contentPane.add(p, BorderLayout.CENTER);

        // Set background and foreground colors for components
        f.getContentPane().setBackground(Color.DARK_GRAY);
        mb.setBackground(Color.DARK_GRAY);
        p.setBackground(Color.DARK_GRAY);
        t.setBackground(Color.GRAY);
        t.setForeground(Color.WHITE);
        b.setBackground(Color.GRAY);
        b.setForeground(Color.WHITE);
        l.setForeground(Color.WHITE);
        sidebar.setBackground(Color.DARK_GRAY);
        sidebar.setForeground(Color.WHITE);

        f.setSize(1270, 720);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("submit")) {
            l.setText(t.getText());
            t.setText("  ");
        }
    }
}
