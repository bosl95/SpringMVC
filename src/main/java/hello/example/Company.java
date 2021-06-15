package hello.example;

import org.springframework.stereotype.Component;

@Component
public class Company {
    private Address address;

    public Company(Address address) {
        this.address = address;
        System.out.println("Company 생성 - 주소를 주입 받음 : " + address.getStreet());
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
