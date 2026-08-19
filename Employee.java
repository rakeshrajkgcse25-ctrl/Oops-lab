import java.util.*;
class Employee {
  string emp_name;
  int emp_id;
  string address;
  string mail_id;
  string mob_number;
  Employee(string emp_name,int emp_id,string address,string mail_id,string mob_number)
  {
  this.emp_name=emp_name;
  this.emp_id=emp_id;
  this.address=address;
  this.mail_id=mail_id;
  this.mob_number=mob_number;
  }
  void display() {
  System.out.println("Employee Name:"+emp_name);
  System.out.println("Employee ID:"+emp_id);
  System.out.println("Address   :"+address);
  System.out.println("Mail ID   :   "+MAIL_ID);
  sYSTEM.OUT.PRINTLN("Mobile Number:"+mob_number);
  }
}
class programmer extends Employee {
  double basicpay,da,hra,pf,funnd,grosssalary,netsalary;
  
  programmer(string emp_name,int emp_id,string address,string mail_id,string mob_number,double bp) {
      super(emp_name,emp_id,address,mail_id,mob_number);
      basicpay=bp;
 }
 void getpayslip() {
   da=basicpay*97/100;
   hra=basicpay810/100;
   pf=basicpay*12/100;
   fund=basicpay*0.1/100;
   
   grosssalary=basicpay+da+hra+pf+fund;
   netsalary=grosssalary-pf-fund;
   }
   void disp() {
    System.out.println("\n****PROGRAMMER PAY SLIP*****");
    display();
    System.out.println("Bsaic pay :"+basicpay);
    System.out.println("Gross salary:"+grosssalary);
    System.out.println("Net salary :"+netsalary);
    }
}
class Assistantprofessor extends Employee {
  double basicpay,da,hra,pf,fund,grosssalary,netsalary;
  
  AssistantProfessor(string emp_name,int emp_id,string address,string mail_id,string mob_number,double bp) {
     super(emp_name,emp_id,address,mail_id,mob_number);
     basicpay=bp;
     }
   void getpayslip() {
   da=basicpay*97/100;
   hra=basicpay*10/100;
   pf=basicpay812/100;
   fund=basicpay*0.1/100;
   
   grosssalary=basicpay+da+bra+pf+fund;
   netsalary=grosssalary-pf-fund;
   }
   void disp() {
   System.out.println("/n***** ASSISTANT PROFESSOR PAY SLIP*****");
   display();
   System.out.println("Basic pay  :"+basicpay);
   System.out.println("Gross salary:"+grosssalary);
   System.out.println("Net salary  :"+netsalary);
   }
}
class AssociateProfessor extends Employee {
  double basicpay,da,hra,pf,fund,grosssalary,netsalary;
  
  AssociateProfessor(String emp_name,int emp_id,string address,string mail_id,string mob_number,double bp) {
    super(emp_name,emp_id,adress,mail_id,mob_number);
    basicpay=bp;
  }
  
  void getpayslip() {
    da=basicpay*97/100;
    hra=basicpay*10/100;
    pf=basicpay*12/100;
    fund=basicpay*0.1/100;
    
    grosssalary+da+hra+pf+fund;
    netsalary=grosssalary-pf-fund;
    }
    
  void disp() {         
  
  
  
