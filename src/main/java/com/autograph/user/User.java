package com.autograph.user;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="users")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String profilePhotoUrl;
    private String address;
    private int age;

    public User(String id, String name, String email, String profilePhotoUrl, String address, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.profilePhotoUrl = profilePhotoUrl;
        this.address = address;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public String getProfilePhotoUrl() { return profilePhotoUrl; }

    public void setEmail(String email) { this.email = email; }

    public void setProfilePhotoUrl(String profilePhotoUrl) { this.profilePhotoUrl = profilePhotoUrl; }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}