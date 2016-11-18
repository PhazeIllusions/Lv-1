import javax.swing.JOptionPane;

public class MathWizard {
	public static void main(String[] args) {
		while (true) {
			String operation = JOptionPane.showInputDialog("Choose an operator (+, -, *, /)");
			if(operation.isEmpty()){
				System.exit(0);
			}
			String num1 = JOptionPane.showInputDialog("Enter your first number");
			String num2 = JOptionPane.showInputDialog("Enter your second number");
			int numb1 = Integer.parseInt(num1);
			int numb2 = Integer.parseInt(num2);
			if (operation.equals("+")) {
				JOptionPane.showMessageDialog(null, Calculator.add(numb1, numb2));
			}
			else if (operation.equals("-")) {
				JOptionPane.showMessageDialog(null, Calculator.subtract(numb1, numb2));

			}
			else if (operation.equals("*")) {
				JOptionPane.showMessageDialog(null, Calculator.multiply(numb1, numb2));

			}
			else if (operation.equals("/")) {
				JOptionPane.showMessageDialog(null, Calculator.divide(numb1, numb2));

			}
		}
	}
} 