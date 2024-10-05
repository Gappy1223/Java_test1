package Actividad6;
public class main {
    public static void main(String[] args) {
        Student stu1 = new Student("Juan",12,2);
        stu1.setGrades(new Integer[]{1,2,3,4,5});
        double promedio = stu1.calPromedio(stu1.getGrades());
        char resultado = stu1.setFinalGrade(promedio); 
        stu1.imprimirResultados(stu1.getName(), stu1.getGrades(), promedio, resultado);
    }
}
