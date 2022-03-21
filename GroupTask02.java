// We have to calculate the average of marks obtained
//in three subjects by student A and by student B.
//    Create   class   'Marks'   with   an   abstract   method
//    'getPercentage' that will be returning the average
//    percentage   of   marks.
//    Provide   implementation   of abstract   method   in   classes   'A'   and   'B'.
//    The constructor of student A takes the marks in three subjects as its parameters and the marks in four
//    subjects as its parameters for student B. Test your code

public class GroupTask02 {
}

abstract class Marks{
    abstract double getPercentage();
}

class A extends Marks{
    int g1;
    int g2;
    int g3;

    public A(int g1, int g2, int g3) {
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
    }

    @Override
    double getPercentage() {
        double average=(g1+g2+g3)/3;
        return average;
    }
}
class B extends Marks{
    int g1;
    int g2;
    int g3;
    int g4;

    public B(int g1, int g2, int g3, int g4) {
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
        this.g4 = g4;
    }

    @Override
    double getPercentage() {
        double average = (g1+g2+g3+g4)/4;
        return average;
    }
}
