package test;

import java.awt.*;
import java.awt.event.*;
public class s41 extends Frame implements ActionListener{
	    private final String[] str = { "7", "8", "9", "/", "4", "5", "6", "*", "1",
	            "2", "3", "-", ".", "0", "=", "+" };
	    Button[] buttons = new Button[str.length];
	    Button reset = new Button("C");
	    TextField display = new TextField("0");
	    public s41() {
	        super();
	        Panel A = new Panel(new GridLayout(4, 4));
	        for (int i = 0; i < str.length; i++) {
	            buttons[i] = new Button(str[i]);
	            A.add(buttons[i]);
	        }
	        Panel B = new Panel(new FlowLayout());
	        B.add(display);
	        B.add(reset);
	        setLayout(new BorderLayout());
	        add("North", B);
	        add("Center", A);
	        for (int i = 0; i < str.length; i++)
	            buttons[i].addActionListener(this);
	        reset.addActionListener(this);
	        display.addActionListener(this);
	        setSize(300, 300);
	        setVisible(true);
	        addWindowListener
			(       new WindowAdapter() {
	                public void windowClosing(WindowEvent e) {
	                System.exit(0);
	                }
	            }
	        );
	        pack();
	    }
	    public void actionPerformed(ActionEvent e) {
	        Object target = e.getSource();
	        String label = e.getActionCommand();
	        if (target == reset)
	            handleReset();
	        else if ("0123456789.".indexOf(label) > 0)
	            handleNumber(label);
	        else
	            handleOperator(label);
	     }
	    boolean isFirstDigit = true;
	    public void handleNumber(String key) {
	        if (isFirstDigit)
	            display.setText(key);
	        else if ((key.equals(".")) && (display.getText().indexOf(".") < 0))
	            display.setText(display.getText() + ".");
	        else if (!key.equals("."))
	            display.setText(display.getText() + key);
	        isFirstDigit = false;
	     }
	    public void handleReset() {
	        display.setText("0");
	        isFirstDigit = true;
	        operator = "=";
	     }
	  
	     double number = 0.0;
	     String operator = "=";
	     public void handleOperator(String key) {
	         if (operator.equals("+"))
	             number += Double.valueOf(display.getText());
	         else if (operator.equals("-"))
	             number -= Double.valueOf(display.getText());
	         else if (operator.equals("*"))
	             number *= Double.valueOf(display.getText());
	         else if (operator.equals("/"))
	             number /= Double.valueOf(display.getText());
	         else if (operator.equals("="))
	             number = Double.valueOf(display.getText());
	         display.setText(String.valueOf(number));
	         operator = key;
	         isFirstDigit = true;
	      }
	     
	      public static void main(String[] args) {
	         new s41();
	      }
}
