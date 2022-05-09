package questão1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numbers[], totNumbers, totNumOccurrences = 0;
        int occurrences = 0, highestOccurrenceNumber = 0;

        System.out.print("Informe o total de números que serão informados: ");
        totNumbers = scanner.nextInt();

        if (totNumbers <= 0) {
            System.out.println("Valor inválido");
        } else {
            numbers = new int[totNumbers];
            for (int i = 0; i < totNumbers; i++) {
                System.out.print("Informe um número: ");
                numbers[i] = scanner.nextInt();
            }

            for (int i = 0; i < totNumbers; i++) {
                occurrences = 0;

                // [1, 1, 2]

                for (int j = 0; j < totNumbers; j++) {
                    // [1, 1, 2]
                    if (numbers[i] == numbers[j]) {
                        occurrences++;
                    }
                }

                if (occurrences > totNumOccurrences) {
                    totNumOccurrences = occurrences;
                    highestOccurrenceNumber = numbers[i];
                }

            }

        }

        if (totNumOccurrences > 0) {
            System.out.println("O número de maior ocorrência é o número " + highestOccurrenceNumber + " com "
                    + totNumOccurrences + " ocorrências");
        }

        scanner.close();
    }

}
