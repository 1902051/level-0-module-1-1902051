import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {

		String birthday = JOptionPane.showInputDialog("What is your birthday");
		if (birthday.equals("05/17")) {
			JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY!!!");
		} else {

			JOptionPane.showMessageDialog(null, "HAPPY UNBIRTHDAY!!! XD");

		}

	}

}
