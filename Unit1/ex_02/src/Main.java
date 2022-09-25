
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

/*
            public  class Form1
            {
                Students myStudents = new Students();

        public Form1()
                {
                    InitializeComponent();
                }

                private void button1_Click(object sender, EventArgs e)
                {
                    Student myStudent = new Student();
                    String myStudentStr;

                    myStudent.Name = aluNombre.Text;
                    miAlumno.Nota = Convert.ToInt32(aluNota.Text);
                    miAlumnoStr = aluNombre.Text + " " + aluNota.Text + (miAlumno.Aprobado ? " Aprobado" : " Suspenso")+"\n";
                    listaAlumnos.AppendText(miAlumnoStr);
                    misAlumnos.Agregar(miAlumno);
                }
            }
*/
            class Student
            {
                private String name;
                private int note;

                public String getName()
                {
                  return name;
                }
                public void setName ( String value ) {
                    name = value;
                }


                public int getNote()
                {
                    return note;
                }
                public void setNote ( int value ) {
                    if (value >= 0 && value <= 10)
                    note = value;
                }



                public Boolean getApproved()
                {

                        if (note >= 5)
                            return true;
                        else
                            return false;

                }
            }

            class Students
            {
                private ArrayList<Student> studentList = new ArrayList<>();

                // Adds a student to   the list
                //
                public void addStudent(Student stu)
                {


                    studentList.add(stu);
                }

                // Devuelve el alumno que está en la posición num
                //
                public Student Obtain(int num)
                {
                    if (num >= 0 && num <= studentList.size())
                    {
                        return (Student) Array.get(studentList,num);
                    }
                    return null;
                }

                // Devuelve la nota media de los alumnos
                //
                public float Media()
                {


                        if (studentList.size() == 0){

                            return 0;
                        }
                        else
                        {
                            float media = 0;
                            for (int i = 0; i < studentList.size(); i++)
                            {
                                media += (studentList.get(i)).note;
                            }
                            return (media / studentList.size());
                        }
                    }
                }

                 class StudentFCT extends Student {
                    String company;
                    String tutor;
                    String instructor;

                     public String getCompany()
                     {
                         return company;
                     }
                     public void setCompany ( String value ) {
                         company = value;
                     }

                     public String getTutor()
                     {
                         return tutor;
                     }
                     public void setTutor ( String value ) {
                         tutor = value;
                     }

                     public String getInstructor()
                     {
                         return instructor;
                     }
                     public void setInstructor ( String value ) {
                     instructor = value;
                     }
                }
                 class StudentErasmus extends Student{
                     String startingDate;
                     String endingDate;

                     public String getStartingDate()
                     {
                         return startingDate;
                     }
                     public void setStartingDate ( String value ) {
                         startingDate = value;
                     }

                     public String getEndingDate()
                     {
                         return endingDate;
                     }
                     public void setEndingDate ( String value ) {
                         endingDate = value;
                     }
                }


        }



    }
