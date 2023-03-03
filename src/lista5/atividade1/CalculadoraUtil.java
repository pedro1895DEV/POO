package lista5.atividade1;

public class CalculadoraUtil {
    int num1;
    int num2;
    int num3;

    int soma2(){
        return num1+ num2;
    }

    int soma3(){
        return num1+num2+num3;
    }

    int subtrai2(){
        return num1-num2;
    }

    int subtrai3(){
        return num1-num2-num3;
    }

    int multiplica2(){
        return num1*num2;
    }

    int multiplica3(){
        return num1*num2*num3;
    }

    int divide2(){
        return num1/num2;
    }

    int divide3(){
        return num1/num2/num3;
    }

    CalculadoraUtil(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

}
