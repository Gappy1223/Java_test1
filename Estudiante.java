public class Estudiante extends Persona {
    //Atributos
    //private String [] materias = new  String[5];
    //private Integer [] grades = new Integer[5];


    public Estudiante(String name, Integer age, Integer id_num, Integer[] grades) {
        super(name, age, id_num);
    }

    public Integer[] getGrades() {
        return grades;
    }

    public void setGrades(Integer[] grades) {
        this.grades = grades;
    }

    public double calAverage(Integer[] grades){
        int suma = 0;
        for(int i = 0; i< grades.length; i++){
            suma += grades[i];
        }
        return (double) suma / grades.length;
    }

    public char setFinalGrade(double calAverage){
        char grade;
        if (calAverage >= 91){
            grade = 'A';
        } else if (calAverage >= 81) {
            grade = 'B';
        } else if (calAverage >= 71) {
            grade = 'C';
        } else if (calAverage >= 61) {
            grade = 'D';
        } else if (calAverage >= 51) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public void displayInfoStu() {
        System.out.println(setFinalGrade(calAverage(grades)));
    }
