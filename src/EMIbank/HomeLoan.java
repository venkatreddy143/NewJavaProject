package EMIbank;

public class HomeLoan extends Loan {
    public HomeLoan(double principal, double interestRate, int repaymentPeriod) {
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

            System.out.println("Example:");
            System.out.println("Month: 1");
            System.out.println("Principal: " + principal);
            System.out.println("Interest: " + (principal * rpp));
            System.out.println("EMI: " + emi);
            System.out.println("Remaining Principal: " + (principal - emi + (principal * rpp)));
            System.out.println();

            double remainingPrincipal = principal - emi + (principal * rpp);
            for (int i = 2; i <= 60; i++) {
                System.out.println("Month: " + i);
                System.out.println("Principal: " + remainingPrincipal);
                System.out.println("Interest: " + (remainingPrincipal * rpp));
                System.out.println("EMI: " + emi);
                System.out.println("Remaining Principal: " + (remainingPrincipal - emi + (remainingPrincipal * rpp)));
                System.out.println();
                remainingPrincipal = remainingPrincipal - emi + (remainingPrincipal * rpp);
            }
        } else {
            System.out.println("Invalid input values.");
        }
    }
}