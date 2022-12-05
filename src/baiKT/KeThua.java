public class KeThua {
    public static void main(String[] args) {
        Student s1 = new Student("Mr.A",20,"QB",7.0);
        Student s2 = new Student("Mr.B",22,"QB",9.0);
        Teacher t1 = new Teacher("Mr.C",24,"QB",150);
        s1.display();
        s2.display();
        t1.display();
    }
}