import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BodyMassIndex {
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        try {
            System.out.println("Введите массу тела (кг): ");
            String weightInput = reader.readLine();
            double weight = Double.parseDouble(weightInput);

            System.out.println("Введите рост (м): ");
            String heightInput = reader.readLine();
            double height = Double.parseDouble(heightInput);

            double bmi = weight / Math.pow(height,2);
            System.out.print("Индекс массы тела: ");
            System.out.printf("%.2f%n", bmi);
            System.out.print("Результат: ");

            if (bmi <18.5)
            {
                System.out.println("Недостаточная масса тела");
            } else if (bmi < 25.0){
                System.out.println("Нормальная масса тела");
            } else  if (bmi < 30.0){
                System.out.println("Избыточная масса тела");
            }
            else System.out.println("Ожирение");

        } catch (IOException e) {
            System.err.println("Ошибка ввода: " + e.getMessage());
        } catch (NumberFormatException e){
            System.err.println("Ошибка: введите корректное число");
        } finally {
            try{
                reader.close();
            } catch (IOException e) {
                System.err.println("Ошибка при закрытии reader" + e.getMessage());
            }
        }
    }

}
