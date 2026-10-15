package singleton;

public class CompanyTest {
    public static void main(String[] args) {
        Company companyA = Company.getInstance();
        Company companyB = Company.getInstance();

        System.out.println(companyA);
        System.out.println(companyB);

        System.out.println(companyA == companyB);
    }
}
