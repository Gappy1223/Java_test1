package Actividad6;
public class Person {

    //Atributos
    private String name;
    private Integer age;
    private Integer id_num;
    private String campus;
    //Metodo
    public Person(String name,Integer age, Integer id_num) {
        this.name = name;
        this.age = age;
        this.id_num = id_num;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getId_num() {
        return id_num;
    }

    public void setId_num(Integer id_num) {
        this.id_num = id_num;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
    public void displayInfo(){
        System.out.println("\n El nombre es " + name + " y su matricula es " + id_num);
    }
}

