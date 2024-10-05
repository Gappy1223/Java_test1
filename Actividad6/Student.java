package Actividad6;
public class Student extends Person{
    //Atributos
    //private String [] materias = new  String[5];
    private Integer [] grades = new Integer[5];


    public Integer[] getGrades() {
        return grades;
    }



    public void setGrades(Integer[] grades) {
        this.grades = grades;
    }




    public Student(String name, Integer age, Integer id_num) {
        super(name, age, id_num);
        //this.grades = grades;
    }



    public double calPromedio(Integer[] grades){
        int suma = 0;
        for(int i = 0; i< grades.length; i++){
            suma += grades[i];
        }
        return (double) suma / grades.length;
    }

    public char setFinalGrade(double promedio) {
        char grade;
        if (promedio >= 91){
            grade = 'A';
        } else if (promedio >= 81) {
            grade = 'B';
        } else if (promedio >= 71) {
            grade = 'C';
        } else if (promedio >= 61) {
            grade = 'D';
        } else if (promedio >= 51) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public void imprimirResultados(String nombre, Integer [] grades, double promedio, char grade) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + grades[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + grades);
    }
}