abstract class Marks {
    abstract double getPercentage();
}
class StudentA extends Marks{
    private double sub1, sub2, sub3;
    StudentA(double sub1, double sub2, double sub3){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }

    @Override
    double getPercentage() {
        return (sub1+sub2+sub3)/3.0;
    }
    public String toString(){
        return Double.toString(getPercentage());
    }
}
class StudentB extends Marks{
    private double sub1, sub2, sub3, sub4;
    StudentB(double sub1, double sub2, double sub3, double sub4){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }
    @Override
    double getPercentage(){
        return (sub1+sub2+sub3+sub4)/4.0;
    }
    public String toString(){
        return Double.toString(getPercentage());
    }
}
class StudentMarks{
    public static void main(String[] args) {
        StudentA a=new StudentA(65,73,81);
        System.out.println("Student A's subjects percentage is = "+a);

        StudentB b=new StudentB(99,93,87,91);
        System.out.println("Student B's subjects percentage is = "+b);
    }
}