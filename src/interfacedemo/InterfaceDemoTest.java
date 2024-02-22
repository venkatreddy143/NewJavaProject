package interfacedemo;

public class InterfaceDemoTest {
    public static void main(String[] args) {
        RBIBankService sbiService=new SbiBankService();
        RBIBankService hdfcService=new HDFCBankService();

        String sbiStatus= sbiService.transfer("1234","4567",1000);
        String hdfcStatus = hdfcService.transfer("7890","1470",2000);
        System.out.println(sbiStatus);
        System.out.println(hdfcStatus);
    }
}
