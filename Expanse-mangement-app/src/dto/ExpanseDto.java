package dto;

public class ExpanseDto {
    private String name;
    private String contactnumber;
    private String email;
    private String salary;
    private String transport;
    private String transportcost;
    private String stay;
    private String staycost;
    private String location;

    public void setName(String name) {
        this.name = name;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setTransportcost(String transportcost) {
        this.transportcost = transportcost;
    }

    public void setStay(String stay) {
        this.stay = stay;
    }

    public void setStaycost(String staycost) {
        this.staycost = staycost;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public String getEmail() {
        return email;
    }

    public String getSalary() {
        return salary;
    }

    public String getTransport() {
        return transport;
    }

    public String getTransportcost() {
        return transportcost;
    }

    public String getStay() {
        return stay;
    }

    public String getStaycost() {
        return staycost;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "ExpanseDto{" +
                "name='" + name + '\'' +
                ", contactnumber='" + contactnumber + '\'' +
                ", email='" + email + '\'' +
                ", salary='" + salary + '\'' +
                ", transport='" + transport + '\'' +
                ", transportcost='" + transportcost + '\'' +
                ", stay='" + stay + '\'' +
                ", staycost='" + staycost + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

