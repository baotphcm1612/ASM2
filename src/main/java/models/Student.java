package models;

import utils.FormatData;

import java.text.DecimalFormat;

public class Student {
    private String id;
    private String name;
    private double markEnglish;
    private double markIT;
    private double markPhysicalEdu;
    private String email;
    private String gender;

    public Student(String id, String name, String email, String gender, String phone, String address) {
        this.id = id;
        this.setName(name);
        this.email = email;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public Student(String id, String name, double markEnglish, double markIT, double markPhysicalEdu, String email, String gender, String phone, String address) {
        this.id = id;
        this.setName(name);
        this.markEnglish = markEnglish;
        this.markIT = markIT;
        this.markPhysicalEdu = markPhysicalEdu;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String phone;
    private String address;

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
        this.name = FormatData.optimizeName(name);
    }

    public double getMarkEnglish() {
        return markEnglish;
    }

    public void setMarkEnglish(double markEnglish) {
        this.markEnglish = markEnglish;
    }

    public double getMarkIT() {
        return markIT;
    }

    public void setMarkIT(double markIT) {
        this.markIT = markIT;
    }

    public double getMarkPhysicalEdu() {
        return markPhysicalEdu;
    }

    public void setMarkPhysicalEdu(double markPhysicalEdu) {
        this.markPhysicalEdu = markPhysicalEdu;
    }

    public double getAVG() {
        DecimalFormat df = new DecimalFormat("#.##");
        String formatNumber = df.format((getMarkEnglish() + getMarkIT() + getMarkPhysicalEdu()) / 3);
        return Double.parseDouble(formatNumber);
    }

    public Student() {}

    public Student(String id, String name, double markEnglish, double markIT, double markPhysicalEdu) {
        this.id = id;
        this.setName(name);
        this.markEnglish = markEnglish;
        this.markIT = markIT;
        this.markPhysicalEdu = markPhysicalEdu;
    }

    public Student(String id) {
        this.setId(id);
    }

}
