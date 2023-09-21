public class Main {
    public static void main(String[] args) {
        System.out.println("Tüm dersler için Sınav %70 sözlü %30 etkilemektedir.");
        Courses mat = new Courses("Matematik","MAT101","MAT");
        Courses fizik = new Courses("Fizik","FİZ101,","FZK");
        Courses kimya= new Courses("Kimya","KMY101","KMY");

        Teacher t1=new Teacher("Halil","MAT");
        Teacher t2=new Teacher("Bağnu","FZK");
        Teacher t3=new Teacher("Kerim","KMY");

        Student s1=new Student("Ali",4,mat,fizik,kimya);
        s1.notlar(50,100,100);
        s1.sözlüler(100,100,100);
        s1.isPass();
        Student s2=new Student("Mert",4,mat,fizik,kimya);
        s2.notlar(30,100,100);
        s2.sözlüler(100,100,100);
        s1.isPass();
        Student s3=new Student("Veli",4,mat,fizik,kimya);
        s3.notlar(70,100,100);
        s3.sözlüler(30,100,100);
        s1.isPass();

        mat.addTeacher(t1);
        kimya.addTeacher(t3);
        fizik.addTeacher(t2);
    }
}