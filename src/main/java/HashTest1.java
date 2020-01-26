import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;

public class HashTest1 {
    public static void main(String[] args) {
        HashSet<Integer> integerHashSet =new HashSet<>();
        for (short i = 0; i <100 ; i++) {
            integerHashSet.add((int)i);
            integerHashSet.remove(i-1);
        }
        System.out.println("size :"+ integerHashSet.size());
    }
}









