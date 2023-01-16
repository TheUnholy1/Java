import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileInsertGUI extends JFrame {

  private JButton insertButton;
  private JTextArea textArea;
  private JFileChooser fileChooser;

  public FileInsertGUI() {
    setTitle("Insert Java File");
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel topPanel = new JPanel();
    insertButton = new JButton("Insert");
    insertButton.addActionListener(new InsertListener());
    topPanel.add(insertButton);
    add(topPanel, BorderLayout.NORTH);

    textArea = new JTextArea();
    add(new JScrollPane(textArea), BorderLayout.CENTER);

    fileChooser = new JFileChooser();
    fileChooser.setCurrentDirectory(new java.io.File("."));
    fileChooser.setDialogTitle("Select a Java file");
    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    fileChooser.setAcceptAllFileFilterUsed(false);
    fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Java files", "java"));
  }

  private class InsertListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      int returnVal = fileChooser.showOpenDialog(FileInsertGUI.this);
      if (returnVal == JFileChooser.APPROVE_OPTION) {
        java.io.File file = fileChooser.getSelectedFile();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
          textArea.read(br, null);
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(FileInsertGUI.this, "Error reading file: " + ex.getMessage());
        }
      }
    }
  }

  public static void main(String[] args) {
    FileInsertGUI gui = new FileInsertGUI();
    gui.setVisible(true);
  }
}
