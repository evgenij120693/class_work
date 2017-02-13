/**
 * Created by Шмыга on 13.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        UniqueNumbers uniqueNumbers=new UniqueNumbers();
        Generator generator=new Generator(uniqueNumbers);
        PrintCountNumbers printCountNumbers=new PrintCountNumbers(uniqueNumbers);
        Thread thr1=new Thread(generator);
        Thread thr2=new Thread(printCountNumbers);

        thr1.start();
        thr2.start();

        try {
            thr1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thr2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Generate complite");
        System.out.println("Unique numbers: "+uniqueNumbers.getCountUniqueNumbers());
    }
}
