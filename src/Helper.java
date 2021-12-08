
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;


public class Helper {
    
    public void updateTime(JLabel jlabel, int duration)
    {
        String durationText = String.format("%d:%d", duration/60, duration%60);
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                jlabel.setText(durationText);
                duration--;
            }
        };
                
    }
}
