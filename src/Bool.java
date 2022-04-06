public class Bool {
    public static void main(String[] args) {
        int temp = 20;
        int time = 23;
        boolean late = time >= 23;
        boolean hot = temp > 25;
        if (hot) {
            System.out.println("Кондиционер включен");
        } else if (!hot) {
            System.out.println("Кондиционер выключен");
        } else if (!hot && late) {
            System.out.println("Кондиционер выключен");
        }
    }
}
