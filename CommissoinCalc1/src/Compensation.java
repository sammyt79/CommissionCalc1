/**
 *
 * @author Samuel
 */
public class Compensation 
{
//Variable locations
    private String
            firstName,
            lastName;
    private final double 
            salary,
            commission;
    private double
            annualSales;
   
    /**
    * Constructor
    * @param sal
    * @param comm
    */
    public Compensation(double sal, double comm)
    {
        salary = sal;
        commission = comm;
    }
    
    /**Returns the value stored in
    * the salary field
    * @return 
    */
    public double getSalary()
    {
        return salary;
    }

    /**Returns the value stored in
    * the commission field
    * @return 
    */
    public double getCommission()
    {
        return commission;
    }
    
    /**Accepts arguments that are 
    * stored in the firstName field.
    * @param first
    */
    public void setFirstName(String first)
    {
        firstName = first;
    }
    
    /**Returns the value stored in
    * the firstName field
    * @return 
    */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**Accepts arguments that are 
    * stored in the lastName field.
    * @param last
    */
    public void setLastName(String last)
    {
        lastName = last;
    }
    
    /**Returns the value stored in
    * the lastName field
    * @return 
    */
    public String getLastName()
    {
        return lastName;
    }
    
    /**Accepts arguments that are 
    * stored in the annSals field.
    * @param annSals
    */
    public void setAnnualSales(double annSals)
    {
        annualSales = annSals;
    }
    
    /**Returns the value stored in
    * the annualSales field
    * @return 
    */
    public double getAnnualSales()
    {
        return annualSales;
    }
    
    /**Calculates and returns total commission
    * @return 
    */
    public double getTotalCommission()
    {
        return annualSales * commission;
    }
    
    /**Calculates and returns total compensation
    * @return 
    */
    public double getTotalCompensation()
    {
        return (annualSales * commission) + salary;
    }
}