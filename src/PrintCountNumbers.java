/**
 * Created by Шмыга on 13.02.2017.
 */
public class PrintCountNumbers implements Runnable{
    private UniqueNumbers uniqueNumbers;

    public PrintCountNumbers(UniqueNumbers uniqueNumbers) {
        this.uniqueNumbers = uniqueNumbers;
    }

    @Override
    public void run() {
        while (!uniqueNumbers.flagComplete){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (!(uniqueNumbers.getCountGenerateNumbers()%5==0) && !uniqueNumbers.flagComplete){
                Thread.yield();
            }

            System.out.println("Count generate numbers: "+uniqueNumbers.getCountGenerateNumbers());
        }
    }
}
