package prog1;

import javax.swing.*;
import java.awt.*;

public class AddressFrame extends JFrame {
    JPanel mainPanel = new JPanel();
    private JPanel topPanel;
    private JPanel middlePanel;
    private JPanel bottomPanel;
    /**
     * TextField and Labels
     */
    // Name
    JTextField nameTextField;
    // Street
    JTextField streetTextField;
    // City
    JTextField cityTextField;
    // State
    JTextField stateTextField;
    // City
    JTextField zipTextField;
    /**
     * Buttons
     */
    // Save
    JButton saveButton;

    static final int WIDTH_FIELD = 15;

    public AddressFrame() {
        initConfigurationsFrame();
        initView();
    }

    private void initView() {
        mainPanel.setLayout(new BorderLayout());

        defineTopView();
        defineCenterView();
        defineBottomView();

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(middlePanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        initListener();
        getContentPane().add(mainPanel);

    }

    private void defineTopView() {
        topPanel = new JPanel();
        nameTextField = new JTextField(WIDTH_FIELD);
        JLabel nameLabel = new JLabel("Name");
        streetTextField = new JTextField(WIDTH_FIELD);
        JLabel streetLabel = new JLabel("Street");
        cityTextField = new JTextField(WIDTH_FIELD);
        JLabel cityLabel = new JLabel("City");
        JPanel form1 = defineTextButtonPanel(nameTextField, nameLabel);
        JPanel form2 = defineTextButtonPanel(streetTextField, streetLabel);
        JPanel form3 = defineTextButtonPanel(cityTextField, cityLabel);
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(form1, BorderLayout.WEST);
        topPanel.add(form2, BorderLayout.CENTER);
        topPanel.add(form3, BorderLayout.EAST);
    }

    private void defineCenterView() {
        middlePanel = new JPanel();

        stateTextField = new JTextField(WIDTH_FIELD);
        JLabel stateLabel = new JLabel("State");
        zipTextField = new JTextField(WIDTH_FIELD);
        JLabel zipLabel = new JLabel("Zip");

        JPanel form4 = defineTextButtonPanel(stateTextField, stateLabel);
        JPanel form5 = defineTextButtonPanel(zipTextField, zipLabel);
        middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        middlePanel.add(form4, BorderLayout.CENTER);
        middlePanel.add(form5, BorderLayout.CENTER);
    }

    private void defineBottomView() {
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        saveButton = new JButton("Submit");
        bottomPanel.add(saveButton, BorderLayout.CENTER);
    }

    private JPanel defineTextButtonPanel(JTextField field, JLabel label) {
        JPanel textPanel = new JPanel();
        JPanel topField = new JPanel();
        JPanel bottomField = new JPanel();
        topField.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        bottomField.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

        bottomField.add(field);
        topField.add(label);


        textPanel.setLayout(new BorderLayout());
        textPanel.add(bottomField, BorderLayout.CENTER);
        textPanel.add(topField, BorderLayout.NORTH);
        return textPanel;
    }

    private void initConfigurationsFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Address Form");
        setSize(720, 260);
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
        saveButton.addActionListener(evt -> {
            String name = nameTextField.getText();
            String street = streetTextField.getText();
            String city = cityTextField.getText();
            String state = stateTextField.getText();
            String zip = zipTextField.getText();
            System.out.println("***********OUTPUT***********");
            StringBuilder builder = new StringBuilder();
            builder.append(name).append("\n");
            builder.append(street).append("\n");
            builder.append(city).append(", ").append(state).append(" ").append(zip);
            System.out.println(builder);

        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddressFrame mf = new AddressFrame();
                mf.setVisible(true);
            }
        });
    }

}
