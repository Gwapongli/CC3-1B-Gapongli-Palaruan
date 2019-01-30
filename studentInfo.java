/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication186;

public class studentInfo {
    
    public String college;
    public String term;
    public String year;
    
    private String academicProg;
    private String major;
    private String idNumber;
    private String firstName;
    private String lastName; 
            
    public studentInfo(String college,String term,String year){
        
        this.college = college;
        this.term = major;
        this.year = year;   
    }
    
    public String getAcademicProg(){
        return academicProg;
    }
    
    public void setAcademicProg(String academicProg){
        this.academicProg = academicProg;
    }
    
    public String getMajor(){
        return major;
        
    }
    
    public void setMajor(String major){
        this.major = major;
    }

    public String getIdNumber(){
        return idNumber;
    }

    public void setIdNumber(String idNumber){
        this.idNumber = idNumber;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName; 
    }

    public void print(){
        
        System.out.println("University of the Cordilleras");
        System.out.println(college);
        System.out.println(term + " " + year);
        
        System.out.println("Student Info");
        System.out.println("Id Number: " + idNumber);
        
        System.out.println("Name" + lastName + firstName);
        System.out.println("Academic Program: " + academicProg + major);
    }

    

   
}
