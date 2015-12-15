package AutoBoxingChallenge;


/**
 * Created by robertsg on 12/11/2015.
 */
public class Main {
    static Bank newBank = new Bank();

    public static void main(String[] args) {
        testCases();
        newBank.bankMenu();
    }

    private static void testCases() {
        Branch branchTest = new Branch(987654321, "Atlanta");
        Branch branchTest2 = new Branch(578964123, "San Francisco");
        Customer customerTest = new Customer("John Roberts", 1000);
        Customer customerTest2 = new Customer("John Smith", 500);
        Customer customerTest3 = new Customer("Suzy Q", 5000);

        newBank.setBranchesArrayList(branchTest);
        newBank.setBranchesArrayList(branchTest2);

        branchTest.setCustomerArrayList(customerTest);
        branchTest.setCustomerArrayList(customerTest2);
        branchTest2.setCustomerArrayList(customerTest3);
    }
}
