package EMIbank;

public class PersonalLoan extends Loan {
    public PersonalLoan(double principal, double interestRate, int repaymentPeriod) {
        super(principal, interestRate, repaymentPeriod);
    }

    @Override
    public void calculateEMI() {
        if (interestRate >= 0 && repaymentPeriod > 0 && principal >= 0) {
            double rpp = interestRate / 100 / 12;
            double emi = (principal * rpp * Math.pow(1 + rpp, repaymentPeriod)) /
                    (Math.pow(1+rpp,repaymentPeriod)-1);

            double totalAmountPaid = emi * repaymentPeriod;
            double totalInterestPaid = totalAmountPaid - principal;

            System.out.println("Principal: " + principal);
            System.out.println("Interest Rate: " + interestRate + "%");
            System.out.println("Repayment Period: " + repaymentPeriod + " months");
            System.out.println("EMI: " + emi);
            System.out.println("Total Amount Paid: " + totalAmountPaid);
            System.out.println("Total Interest Paid: " + totalInterestPaid);
            System.out.println();
        } else {
            System.out.println("Invalid input values.");
        }
    }
}