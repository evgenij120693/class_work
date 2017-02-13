import java.util.Random;

/**
 * Created by Шмыга on 13.02.2017.
 */
public class Generator implements Runnable{
    private UniqueNumbers uniqueNumbers;

    public Generator(UniqueNumbers uniqueNumbers) {
        this.uniqueNumbers = uniqueNumbers;
    }

    @Override
    public void run() {
        while (!uniqueNumbers.flagComplete){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Random random=new Random();
            int rand=random.nextInt(100);
            uniqueNumbers.addNumber(rand);
            System.out.println(rand);
        }
    }
}
