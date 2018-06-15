/* Department class contains list of student
Objects. It is associated with student
class through its Object(s). */
class Department 
{
    String name;
    private ArrayList<Student> students;
  
    Department(String name, ArrayList<Student> students) 
    {     
        this.name = name;
        this.students = students;    
    }
     
    public ArrayList<Student> getStudents() 
    {
        return students;
    }
}
