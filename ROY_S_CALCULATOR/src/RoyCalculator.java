import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html


public class RoyCalculator {
    public static void main(String args[]){
        //Framing
        JFrame frame= new JFrame("Calculator");
        frame.setSize(300,450);
        frame.setLayout(null);
        frame.setVisible(true);

        //Creating text field
        JTextField textField= new JTextField();
        textField.setBounds(50,50,200,50);

        //Add Lebel
        JLabel label= new JLabel();
        label.setBounds(50,0,100,50);




        //Creating Button "C" and "D"
        JButton button= new JButton("C");
        button.setBounds(150,150,50,50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
            }
        });
        frame.add(button);

        button= new JButton("D");
        button.setBounds(200,150,50,50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text= textField.getText();
                    //using this condition, last er dik theke jeno ekta ekta kore number delete kora jai.
                if (!text.isEmpty()){
                    textField.setText(text.substring(0,text.length()-1));
                }
                //textField.setText("");
            }
        });

        //Adding On Frame
        frame.add(textField);
        frame.add(label);
        frame.add(button);
        //frame.add(button);
        //2 ta button eksathe kno add kora jai na??

        //apatoo amar kaj sesh.ekhon 2 ta loop dia 2D array er moto kore baki button gula o set korte hobe.

        int count=0;
        char[] button_char={ '7', '8', '9', '*', '4', '5', '6', '+', '1', '2', '3', '-', '.', '0', '=', '/' };
        for (int y=200;y<=350;y +=50){
            for (int x=50;x<250;x+= 50){
                button=new JButton(""+button_char[count]);
                button.setBounds(x,y,50,50);
                if(button_char[count]== '='){
                    button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String text = textField.getText();
                            double result = 0.0;
                            if (text.indexOf("+") != -1) {
                                String[] split = text.split("\\+");
                                result = Double.parseDouble(split[0]) + Double.parseDouble(split[1]);
                            } else if (text.indexOf("-") != -1) {
                                String[] split = text.split("\\-");
                                result = Double.parseDouble(split[0]) - Double.parseDouble(split[1]);
                            } else if (text.indexOf("*") != -1) {
                                String[] split = text.split("\\*");
                                result = Double.parseDouble(split[0]) * Double.parseDouble(split[1]);
                            } else if (text.indexOf("/") != -1) {
                                String[] split = text.split("\\/");
                                result = Double.parseDouble(split[0]) / Double.parseDouble(split[1]);
                            } else {
                                System.out.println("Operator Not found");
                            }
                            textField.setText(Double.toString(result));
                        }
                    });
                }
                else {
                    JButton finalButton = button;
                    button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+ finalButton.getText());
                        }
                    });
                }
                frame.add(button);
                count++;
            }
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
