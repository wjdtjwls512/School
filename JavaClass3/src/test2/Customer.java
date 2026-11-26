package test2;

public class Customer
{
    String customerName;
    int wantedSalary;
    int skill;
    int benefits;
    int customer;

    public Customer()
    {}

    public String getCustomerName()
    {
        return customerName;
    }

    public int getWantedSalary()
    {
        return wantedSalary;
    }

    public int getSkill()
    {
        return skill;
    }

    public int getBenefits()
    {
        return benefits;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setWantedSalary(int wantedSalary) {
        this.wantedSalary = wantedSalary;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public void setBenefits(int benefits) {
        this.benefits = benefits;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public void showProfile()
    {
        System.out.println("요구하는 연봉: "+ wantedSalary);
        System.out.println("요구하는 스킬 수준: " + skill);
        System.out.println("요구하는 복지 수준: " + benefits);
    }

    public void showTheBestWorker()
    {
        System.out.println("이름: " + customerName);
        System.out.println("요구하는 연봉: "+ wantedSalary);
        System.out.println("요구하는 스킬 수준: " + skill);
        System.out.println("요구하는 복지 수준: " + benefits);
    }

}