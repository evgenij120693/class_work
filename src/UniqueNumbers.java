import java.util.HashSet;

/**
 * Created by Шмыга on 13.02.2017.
 */
public class UniqueNumbers {
    public volatile boolean flagComplete=false;
    private volatile int countGenerateNumbers=0;
    private HashSet<Integer> uniqueNumbers= new HashSet<Integer>(100);

    public synchronized void addNumber(int number){
        uniqueNumbers.add(number);
        countGenerateNumbers++;
        if(uniqueNumbers.size()==100){
            flagComplete=true;
        }

    }

    public synchronized int getCountGenerateNumbers(){
        return countGenerateNumbers;
    }

    public synchronized int getCountUniqueNumbers(){
        return uniqueNumbers.size();
    }
}
