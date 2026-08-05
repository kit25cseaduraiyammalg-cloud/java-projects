class Employee{
   private int id;
   private String firstName;
   private String lastName;
   private int salary;
   Employee(int id, String firstName,String lastName,int salary){
    this.id=id;
    this.firstName=firstName;
    this.lastName=lastName;
    this.salary=salary;
   }
   public int getId(){
    return id;
   }
   public String getfirstName(){
    return firstName;
   }
   public String lastName(){
    return lastName;
   }
   public String getName(){
    return firstName+ "" lastName;
   }
   public String getsalary(){
    return salary;
   }
   public void setSalary(int salary){
    this.salary=saary;
   }
   

    }
}