import javax.swing.*;
import java.awt.*;

public class DogGUI extends JFrame {
    private JLabel breedLabel, ageLabel;
    private JTextField breedField, ageField;

    public DogGUI(Dog dog) {
        super("Dog Information");
        setLayout(new FlowLayout());

        breedLabel = new JLabel("Breed: ");
        add(breedLabel);
        breedField = new JTextField(dog.getBreed(), 20);
        add(breedField);

        ageLabel = new JLabel("Age: ");
        add(ageLabel);
        ageField = new JTextField(Integer.toString(dog.getAge()), 20);
        add(ageField);

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Golden Retriever", 3);
        DogGUI gui = new DogGUI(myDog);
    }
}
