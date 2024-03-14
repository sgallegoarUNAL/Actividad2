package segundotaller.ejerciciopn21;

public class Triangulo {
    double a,b,c,semi;
    Triangulo(double a,double b,double c){
    this.a = a;
    this.b = b;
    this.c = c;
    }
    double calcularArea(){
    semi = (a+b+c)/2;
    return Math.sqrt(semi*(semi-a)*(semi-b)*(semi-c));
    }
    double calcularSemi(){
    return (a+b+c)/2;
    }
    double calcularPerimetro(){
    return (a+b+c);
    }
}
