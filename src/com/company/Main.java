package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArrayList<ResumeToGo> resume = new ArrayList<>();


        ResumeToGo applicant;


        boolean done = false;


        do {

            Scanner scan = new Scanner(System.in);


            applicant = new ResumeToGo();

            //
            System.out.println(" Enter your first name");
            applicant.setFirstName(scan.nextLine());


            System.out.println("Enter your last name");
            applicant.setLastName(scan.nextLine());

            System.out.println("Enter  your phone number");
            applicant.setPhone(scan.nextLine());

            System.out.println("Enter your email");
            applicant.setEmail(scan.nextLine());

            System.out.println("////////////////////////////////////");

            System.out.println("Enter your degree");
            applicant.setDegree(scan.nextLine());

            System.out.println("Enter year of graduation");
            applicant.setYear(scan.nextLine());

            System.out.println("Enter institution");
            applicant.setInstitution(scan.nextLine());

            System.out.println("Enter another degree");
            applicant.setAnotherDegree(scan.nextLine());


            System.out.println("Enter title");
            applicant.setTitle(scan.nextLine());

            System.out.println("////////////////////////////////////");

            System.out.println("Enter experience");
            applicant.setExperience(scan.nextLine());


            System.out.println("Enter start date");
            applicant.setStartDate(scan.nextLine());

            System.out.println("Enter end date");
            applicant.setEndDate(scan.nextLine());

            System.out.println("Enter organization");
            applicant.setOrganization(scan.nextLine());

            System.out.println("Enter skill details");
            applicant.setSkillDetails(scan.nextLine());
            System.out.println("////////////////////////////////////");

            resume.add(applicant);

            System.out.println("Do you want to continue?");
            String option = scan.nextLine();


            if (option.equalsIgnoreCase("n") || option.equalsIgnoreCase("no")) {

                done = true;


            }
        }
        while (!done);


        for (ResumeToGo eachResume : resume) {
            System.out.format("\nFirst Nme: \n" + "" + eachResume.getFirstName() + "" + "\nLast name: \n" + eachResume.getLastName() +
                    "\nPhone number: \n" + eachResume.getPhone() + " \nEmail address:  \n" + eachResume.getEmail() +
                    " \nDegree:  \n" + eachResume.getDegree() + " \nYear: \n " + eachResume.getYear() + " \nInstitution: \n " + eachResume.getInstitution() +
                    " \nAnother degree: \n " + eachResume.getAnotherDegree() + " \nTitle:  \n" + eachResume.getTitle() + " \nExperience: \n " + eachResume.getEmail() +
                    " \nStart date:  \n" + eachResume.getStartDate() + " \nEnd date: \n " + eachResume.getEndDate() + " \nOrganization:  \n" + eachResume.getOrganization() +
                    " \nSkill details:  \n" + eachResume.getSkillDetails()

            );
    }

}
}

