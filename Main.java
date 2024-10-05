public class Main {
    public static void main(String[] args){
        Estudiante ed1 = new Estudiante("Marco", 20, 2);
        int [] grades = {6, 7, 8, 9, 2};
        ed1.getGrades(grades);
        ed1.displayInfoStu();
    }
}
