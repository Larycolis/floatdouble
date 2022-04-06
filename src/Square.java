public class Square {
    public static void main(String[] args) {
        float r = 10.8f;
        float pi = 3.14f;
        float s = pi * r * r;
        System.out.println("Прощадь круга равна " + s + " Число было бы точнее, если бы в качестве типа переменной использовался double.");
        double a = 3;
        double b = 4;
        double c = Math.sqrt(a * a + b * b);
        System.out.println("При условии: катет a = " + a + ", катет б = " + b + ", гипотенуза будет = " + c);
        double d = 100;
        double sqrt = Math.sqrt(d);
        System.out.println("Корень " + d + " равен " + sqrt);
    }
}
