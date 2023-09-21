public class Student {
    String name;
    int classes;
    Courses mat;
    Courses fizik;
    Courses kimya;
    Courses sozmat;
    Courses sozfizik;
    Courses sozkimya;
    double Avarage;
    boolean isPass;

    Student(String name, int classes, Courses mat, Courses fizik, Courses kimya) {
        this.name = name;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.sozkimya= sozkimya;
        this.sozmat= sozmat;
        this.sozfizik= sozfizik;
    }

    public void calcAvarage() {
        this.Avarage = (((this.mat.not * 0.70) + (this.mat.soz* 0.30)) + ((this.fizik.not * 0.70) + (this.fizik.soz * 0.30)) + ((this.kimya.not * 0.70) + (this.kimya.soz * 0.30))) / 3;
    }

    public void isPass() {
        if (this.mat.not == 0 || this.fizik.not == 0 || this.kimya.not == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.Avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.Avarage > 55;
    }

    public void notlar(int mat, int fizik, int kimya) {
        if (mat <= 100 && mat >= 0) {
            this.mat.not = mat;
        }
        if (fizik <= 100 && fizik >= 0) {
            this.fizik.not = fizik;
        }
        if (kimya <= 100 && fizik >= 0) {
            this.kimya.not = kimya;
        }
    }

    public void sözlüler(int mat, int fizik, int kimya) {
        if (mat <= 100 && mat >= 0) {
            this.mat.soz = mat;
        }
        if (fizik <= 100 && fizik >= 0) {
            this.fizik.soz = fizik;
        }
        if (kimya <= 100 && kimya >= 0) {
            this.kimya.soz = kimya;
        }
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + ((this.mat.not * 0.70) + (this.mat.soz * 0.30)));
        System.out.println("Fizik Notu : " + ((this.fizik.not * 0.70) + (this.fizik.soz * 0.30)));
        System.out.println("Kimya Notu : " + ((this.kimya.not * 0.70) + (this.kimya.soz * 0.30)));
    }
}

