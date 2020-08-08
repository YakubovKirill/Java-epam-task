package by.epam.learn.fundomental;

public class SummAndMultiplyCommandLineArgs {
    public static void main(int[] commandLineArgs) {
        if (commandLineArgs.length > 0) {
            int commandLineArgsSumm = 0;
            double commandLineArgsMultiply = 1.0;
            for (int commandLineElement: commandLineArgs) {
                commandLineArgsSumm += commandLineElement;
                commandLineArgsMultiply *= commandLineElement;
            }
            System.out.println("Summ of command line arguments = " + commandLineArgsSumm);
            System.out.println("Multiply of command line arguments = " + commandLineArgsMultiply);
        } else {
            System.out.println("Command line arguments is empty");
        }
    }
}
