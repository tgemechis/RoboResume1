package com.company;

public class ResumeToGo {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String degree;
    private String year;
    private String institution;
    private String anotherDegree;
    private String title;
    private String experience;
    private String startDate;
    private String endDate;
    private String organization;
    private String skillDetails;

    public ResumeToGo() {

    }

    public ResumeToGo(String firstName, String lastName, String phone, String email, String degree, String year, String institution,
                      String anotherDegree, String title, String experience, String startDate, String endDate, String organization, String skillDetails)

    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.degree = degree;
        this.year = year;
        this.institution = institution;
        this.anotherDegree = anotherDegree;
        this.title = title;
        this.experience = experience;
        this.startDate = startDate;
        this.endDate = endDate;
        this.organization = organization;
        this.skillDetails = skillDetails;


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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getAnotherDegree() {
        return anotherDegree;
    }

    public void setAnotherDegree(String anotherDegree) {
        this.anotherDegree = anotherDegree;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getSkillDetails() {
        return skillDetails;
    }

    public void setSkillDetails(String skillDetails) {
        this.skillDetails = skillDetails;
    }
}