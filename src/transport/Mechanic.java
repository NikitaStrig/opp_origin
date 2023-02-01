package transport;

public class Mechanic {
    String firstName;
    String lastName;
    String company;

    public Mechanic(String firstName, String lastName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;

    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                '}';
    }


    public void tO(){
        System.out.println("Производится ТО");
    };
    public void repair(){
        System.out.println("Произвидится ремоент транспорта");
    }
}





