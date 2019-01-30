/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication186;
public class studentAcc {
    
    public static void main(String[]args){
        //StudentInfo of Gapongli Sid
        studentInfo Student1 = new studentInfo("BSIT ","2nd Term ","SY 2018-2019");
        
        Student1.setIdNumber("18-4353-460");
        Student1.setFirstName("Sid");
        Student1.setLastName("Gapongli");
        Student1.setMajor("Network and Security");
        Student1.college = ("CITCS");
        Student1.setAcademicProg("BSIT");
        Student1.term = ("2st term");
        Student1.year = ("2018-2019");
        
        Student1.print();
        
        //StudentInfo of Palaruan Wyndel
        studentInfo Student2 = new studentInfo("BSIT ","2nd Term ","SY 2018-2019");
        
        Student2.setIdNumber("18-4877-613");
        Student2.setFirstName("Wyndel");
        Student2.setLastName("Palaruan");
        Student2.setMajor("Network and Security");
        Student2.college = ("CITCS");
        Student2.setAcademicProg("BSIT");
        Student2.term = ("2st term");
        Student2.year = ("2018-2019");
        
                
                
                Student2.print();
        
        
   
    }
}
