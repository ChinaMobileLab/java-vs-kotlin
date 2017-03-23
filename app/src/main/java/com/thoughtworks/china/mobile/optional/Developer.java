package com.thoughtworks.china.mobile.optional;


import com.google.common.base.Optional;

public class Developer {

    private String firstName;
    private String lastName;

    public Developer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private Optional<String> home = Optional.absent();

    public static void main(String[] args) {
        Developer dev = new Developer("Shuai", "Zhang");
        if (!dev.home.isPresent()) {
            dev.home = Optional.of("New House");
        }
        System.out.println(dev.lastName + " " + dev.firstName + "\'s home is: " + dev.home.get());

        User user = new User("Zhang Shuai", null);
        if (user.getCompany() != null
                && user.getCompany().getAddress() != null
                && user.getCompany().getAddress().getPostcode() != null) {
            System.out.println("Postcode: " + user.getCompany().getAddress().getPostcode());
        }
    }
}
