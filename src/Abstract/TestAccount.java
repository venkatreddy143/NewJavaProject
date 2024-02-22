package Abstract;

public class TestAccount {
    public static void main(String[] args) {


        SBIBankAccount sbiBankAccount = new SBIBankAccount(10000, 10000,
                600, 700, 800);
        HDFCBankAccount hdfcBankAccount = new HDFCBankAccount(10000, 10000,
                400, 500, 600);
        sbiBankAccount.sendAmount();
        int sbiTotalSendAmt = sbiBankAccount.sbiTotalSendAmt;
        int hdfcTotalSendAmt= hdfcBankAccount.hdfcTotalSendAmt;

        if(sbiTotalSendAmt>hdfcTotalSendAmt){
            System.out.println("HDFC sent balance to SBI Bank"+ " " +hdfcTotalSendAmt);
            int remAmt=sbiTotalSendAmt-hdfcTotalSendAmt;
            System.out.println("Send This Remain Balance To HDFC Bank:"+ " " +remAmt);
            int remainAmt=sbiBankAccount.sbiBalance-remAmt;
            sbiBankAccount.sbiBalance=remainAmt;
            int newHdfcBankBalance=hdfcBankAccount.hdfcBalance+remAmt;
            System.out.println("After Sending The Amount To HDFC Bank"+" "+remainAmt);
            System.out.println("After Receving The Amount From SBI Bank"+" "+newHdfcBankBalance);

        }if(hdfcTotalSendAmt>sbiTotalSendAmt){
            int remAmt2=sbiTotalSendAmt-hdfcTotalSendAmt;
            System.out.println("sbi credited:"+remAmt2);
            int remainAmt2=hdfcBankAccount.hdfcBalance-remAmt2;
            hdfcBankAccount.hdfcBalance=remainAmt2;
            int newSbiBankBalance=sbiBankAccount.sbiBalance+remAmt2;
            System.out.println(remainAmt2);
            System.out.println(newSbiBankBalance);
        }

    }
}
