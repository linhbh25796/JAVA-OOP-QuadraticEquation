import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        double numberA = sc.nextDouble();
        System.out.println("Nhập số b: ");
        double numberB = sc.nextDouble();
        System.out.println("Nhập số c: ");
        double numberC = sc.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(numberA,numberB,numberC);
        qe.display();

    }
}

class QuadraticEquation {
   private double numberA,numberB,numberC;

    public QuadraticEquation(double numberA, double numberB, double numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public double getNumberC() {
        return numberC;
    }

    public double getDiscriminant(){
        return  numberB*numberB - 4*numberA*numberC;
    }

    public double getRoot1(){
        return (-numberB + Math.pow( numberB*numberB - 4*numberA*numberC,0.5))/2*numberA;
    }

    public double getRoot2(){
        return (-numberB - Math.pow( numberB*numberB - 4*numberA*numberC,0.5))/2*numberA;
    }

    public void display(){
        if (getDiscriminant() >= 0){
            System.out.println("Pt có 2 nghiệm x1 = "+ getRoot1() + " x2 = " + getRoot2());
        }
        else if (getDiscriminant() == 0){
            System.out.println("Pt có 2 nghiệm kép : "+getRoot1());
        }
        else if (getDiscriminant() <0){
            System.out.println("Phương trình vô nghiệm");
        }
    }


}
