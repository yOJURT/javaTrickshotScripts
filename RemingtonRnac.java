import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;
public class Main {
    public static void main(String[] args) {;
        try {
            Robot r = new Robot();
            int mouseClick = InputEvent.BUTTON1_MASK;
            TimeUnit.SECONDS.sleep(1);
            r.mousePress(mouseClick);
            r.mouseRelease(mouseClick);
            TimeUnit.MILLISECONDS.sleep( 50);
            r.keyPress(KeyEvent.VK_R);
            TimeUnit.MILLISECONDS.sleep(50);
            r.keyRelease(KeyEvent.VK_R);
            TimeUnit.MILLISECONDS.sleep(645);
            r.keyPress(KeyEvent.VK_1);
            r.keyRelease(KeyEvent.VK_1);
        }catch (Exception e){}
    }
}