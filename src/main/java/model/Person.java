package model;

public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private String typeOfLicense;
    private String typeOfAircraft;
    private String email;
    private String imageURL;

    public Person() {
    }

    public Person(String firstName, String lastName, String typeOfLicense, String typeOfAircraft, String email,  String imageURL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeOfLicense = typeOfLicense;
        this.typeOfAircraft = Person.this.typeOfAircraft;
        this.email = email;
        this.imageURL = imageURL;
    }

    public Person(Integer id, String firstName, String lastName, String typeOfLicense, String typeOfAircraft, String email,  String imageURL) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeOfLicense = typeOfLicense;
        this.typeOfAircraft = Person.this.typeOfAircraft;
        this.email = email;
        this.imageURL = imageURL;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getTypeOfLicense() {
        return typeOfLicense;
    }

    public void setTypeOfLicense(String typeOfLicense) {
        this.typeOfLicense = Person.this.typeOfLicense;
    }


    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public void setTypeOfAircraft(String typeOfAircraft) {
        this.typeOfAircraft = Person.this.typeOfAircraft;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", typeOfLicense='" + typeOfLicense + '\'' +
                ", typeOfAircraft='" + typeOfAircraft + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}