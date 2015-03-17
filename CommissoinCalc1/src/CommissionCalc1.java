import javax.swing.JOptionPane; //For dialog boxes

/**
 *
 * @author Samuel Tollefson
 */
public class CommissionCalc1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Needed for dialog box inputs
        String inputString;
        
        //Create a user object
        Compensation user = new Compensation(40000, 0.09);

        // Display a greeting
        JOptionPane.showMessageDialog(null, "This program calculates the "
                + "total compensation of a salesperson.");
        
        //Get the user's firs and last names
        user.setFirstName
            (JOptionPane.showInputDialog("Please enter your first name."));
        user.setLastName
            (JOptionPane.showInputDialog("Please enter your last name."));
        
        //Display salary and commission
        JOptionPane.showMessageDialog
            (null, user.getFirstName() + " " 
                + user.getLastName() + ",\nAs a salesperson you earn "
                + "a salary of $" + String.format("%,.2f", user.getSalary()) 
                + " per year \nplus a " + user.getCommission() * 100 
                + "% commission.");
        
        //Get total sales amount.
        inputString = JOptionPane.showInputDialog
            ("Please enter your total sales amount.");
        
        // Convert the input to a double
        user.setAnnualSales(Double.parseDouble(inputString));
        
        //Display total commission and total compensation
        JOptionPane.showMessageDialog
            (null, "You earned $" + String.format 
                ("%,.2f", user.getTotalCommission()) 
                + " in commission. Nice work " 
                + user.getFirstName() + "!");
        JOptionPane.showMessageDialog
            (null, "Your total annual compensation is $" + 
                    String.format("%,.2f", user.getTotalCompensation()));   
        
        System.exit(0);
    }    
}
