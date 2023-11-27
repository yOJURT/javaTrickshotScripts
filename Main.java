import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;

public class Main {
    public static void main(String[] args) {;
        try {
            Robot r = new Robot();
            int mouseClick = InputEvent.BUTTON1_MASK;
            int reloadBind = KeyEvent.VK_R;
            int streakBind = KeyEvent.VK_3;
            int swapWeap = KeyEvent.VK_1;
            int equipment = KeyEvent.VK_4;
            int lethal = KeyEvent.VK_G;

            TimeUnit.SECONDS.sleep(1);
            r.mousePress(mouseClick);
            r.mouseRelease(mouseClick);
            TimeUnit.MILLISECONDS.sleep(355);
            r.keyPress(swapWeap);
            r.keyRelease(swapWeap);
            //Titty nac
            TimeUnit.MILLISECONDS.sleep(450);
            r.keyPress(equipment);
            r.keyRelease(equipment);
            r.keyPress(swapWeap);
            r.keyRelease(swapWeap);
            //Instaswap
            TimeUnit.MILLISECONDS.sleep(845);
            r.keyPress(reloadBind);
            r.keyRelease(reloadBind);
            TimeUnit.MILLISECONDS.sleep(180);
            r.keyPress(swapWeap);
            r.keyRelease(swapWeap);
            //Reload Nac
            /*TimeUnit.MILLISECONDS.sleep(120);
            r.keyPress(streakBind);
            r.keyRelease(streakBind);
            TimeUnit.MILLISECONDS.sleep(90);
            r.keyPress(swapWeap);
            r.keyRelease(swapWeap);
            //OTS
            TimeUnit.MILLISECONDS.sleep(150);
            r.mousePress(mouseClick);
            r.mouseRelease(mouseClick);


             */


        }catch (Exception e){}
    }
}
