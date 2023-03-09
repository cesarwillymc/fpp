package prog2;

import javax.swing.*;
import java.awt.*;

public class StringUtility extends JFrame {
    JPanel mainPanel = new JPanel();

    private JPanel leftPanel;
    private JPanel rightPanel;
    /**
     * TextField and Labels
     */

    JTextField inputTextField;
    JTextField outputTextField;
    /**
     * Buttons
     */

    JButton counterLetterButton;
    JButton reverseLettersButton;
    JButton removeDuplicatesButton;

    static final int WIDTH_FIELD = 15;

    public StringUtility() {
        initConfigurationsFrame();
        initView();
    }

    private void initView() {
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        defineLeftView();
        defineRightView();

        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);

        initListener();
        getContentPane().add(mainPanel);

    }

    private void defineLeftView() {
        leftPanel = new JPanel();
        counterLetterButton = getNewButton("Counter Letters");
        reverseLettersButton = getNewButton("Reverse Letters");
        removeDuplicatesButton = getNewButton("Remove Duplicates");
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setAlignmentX(CENTER_ALIGNMENT);
        leftPanel.setAlignmentY(CENTER_ALIGNMENT);
        leftPanel.add(counterLetterButton);
        leftPanel.add(reverseLettersButton);
        leftPanel.add(removeDuplicatesButton);
    }


    private JButton getNewButton(String label) {
        JButton button = new JButton(label);
        button.setMargin(new Insets(8, 20, 8, 20));
        return button;
    }

    private void defineRightView() {
        rightPanel = new JPanel();

        inputTextField = new JTextField(WIDTH_FIELD);
        JLabel inputLabel = new JLabel("Input");
        outputTextField = new JTextField(WIDTH_FIELD);
        JLabel outputLabel = new JLabel("Output");

        JPanel formInput = defineTextButtonPanel(inputTextField, inputLabel);
        JPanel form2Input = defineTextButtonPanel(outputTextField, outputLabel);

        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setAlignmentX(CENTER_ALIGNMENT);
        rightPanel.setAlignmentY(CENTER_ALIGNMENT);
        rightPanel.add(formInput);
        rightPanel.add(form2Input);
    }


    private JPanel defineTextButtonPanel(JTextField field, JLabel label) {
        JPanel textPanel = new JPanel();
        JPanel topField = new JPanel();
        JPanel bottomField = new JPanel();
        topField.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        bottomField.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        bottomField.add(field);
        topField.add(label);


        textPanel.setLayout(new BorderLayout());
        textPanel.add(bottomField, BorderLayout.CENTER);
        textPanel.add(topField, BorderLayout.NORTH);
        return textPanel;
    }

    private void initConfigurationsFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("String Utility");
        setSize(640, 180);
        centerFrameOnDesktop(this);
        setResizable(true);
    }

    private void centerFrameOnDesktop(Component f) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth = f.getSize().width;
        f.setLocation(((width - frameWidth) / 2),
                (height - frameHeight) / 3);
    }

    void initListener() {
        counterLetterButton.addActionListener(evt -> {
            String input = inputTextField.getText();
            outputTextField.setText(String.valueOf(Util.counterLetter(input)));


        });
        reverseLettersButton.addActionListener(evt -> {
            String input = inputTextField.getText();
            if (input.length() > 1) {
                String reverse = Util.reverse(input);
                outputTextField.setText(reverse);
            } else {
                outputTextField.setText(input);
            }

        });
        removeDuplicatesButton.addActionListener(evt -> {

            String input = inputTextField.getText();
            if (input.length() > 0) {
                outputTextField.setText(Util.removeDuplicate(input));
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                StringUtility mf = new StringUtility();
                mf.setVisible(true);
            }
        });
    }

}
