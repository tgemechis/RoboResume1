package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<RoboResume> resume = new ArrayList<>();


        RoboResume applicant;


        boolean done = true;


        do {

            Scanner scan = new Scanner(System.in);


            applicant = new RoboResume();

            System.out.println("Enter your first name ");
            applicant.setFirstName(scan.nextLine());

            System.out.println("Enter your last name ");
            applicant.setLastName(scan.nextLine());

            System.out.println("Enter  your phone number ");
            applicant.setPhone(scan.nextInt());

            System.out.println("Enter your email");
            applicant.setEmail(scan.nextLine());

            System.out.println("Enter your degree");
            applicant.setDegree(scan.nextLine());

            System.out.println("Enter year of graduation");
            applicant.setYear(scan.nextInt());

            System.out.println("Enter institution");
            applicant.setInstitution(scan.nextLine());

            System.out.println("Enter another degree");
            applicant.setAnotherDegree(scan.nextLine());


            System.out.println("Enter title");
            applicant.setTitle(scan.nextLine());


            System.out.println("Enter experience");
            applicant.setExperience(scan.nextLine());


            System.out.println("Enter start date");
            applicant.setStartDate(scan.nextInt());

            System.out.println("Enter end date");
            applicant.setEndDate(scan.nextInt());

            System.out.println("Enter organization");
            applicant.setOrganization(scan.nextLine());

            System.out.println("Enter skill details");
            applicant.setSkillDetails(scan.nextLine());

            resume.add(applicant);

            System.out.println("Thank you for submitting your information");


        }
            while (!done) ;

        for (RoboResume eachRoboResume: resume){
            System.out.format("First Nme: " + eachRoboResume.getFirstName() +  "Last name: " + eachRoboResume.getLastName() +
                    "Phone number: " + eachRoboResume.getPhone() +  "Email address: " + eachRoboResume.getEmail() +
                    "Degree: " + eachRoboResume.getDegree() + "Year: " + eachRoboResume.getYear() + "Institution: " + eachRoboResume.getInstitution() +
                    "Another degree: " + eachRoboResume.getAnotherDegree() +  "Title: " + eachRoboResume.getTitle() +  "Experience: " + eachRoboResume.getEmail() +
                    "Start date: " + eachRoboResume.getStartDate() +  "End date: " + eachRoboResume.getEndDate() +  "Organization: " + eachRoboResume.getOrganization() +
                    "Skill details: " + eachRoboResume.getSkillDetails()

            );
        }
        }


    }




