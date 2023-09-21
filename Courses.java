public class Courses {
    String name;
    Teacher courseteacher;
    int not;
    int soz;
    String prefix;
    String code;
    Courses(String name, String code, String prefix){
        this.name=name;
        this.courseteacher=courseteacher;
        this.not=0;
        this.soz=0;
        this.prefix=prefix;
        this.code=code;

    }
    void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.courseteacher=t;
        }else{
            System.out.println(t.name + "Akademisyen bu dersi veremez !");
        }
    }
    void printTeacher(){
        if (courseteacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseteacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
