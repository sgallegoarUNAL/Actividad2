package segundotaller.ejerciciopn19;

public class Triangulo_Eq {
    double lado;
    Triangulo_Eq(double lado){
    this.lado = lado;
    }
    double calcularArea(){
    return (Math.pow(lado,2)*Math.sqrt(3))/4;
    }
    double calcularAltura(){
    return (lado*Math.sqrt(3))/2;
    }
    double calcularPerimetro(){
    return (lado * 3);
    }
}
