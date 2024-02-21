package EMIbank;

public class LoanTest {
    public static void main(String[] args) {
        Loan homeLoan = new HomeLoan(500000, 7.5, 12 * 5);
        homeLoan.calculateEMI();

        Loan personalLoan = new PersonalLoan(10000, 12, 12);
        personalLoan.calculateEMI();
    }
}