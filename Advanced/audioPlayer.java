package Advanced;
import java.io.*;
import java.util.*;
import javax.sound.sampled.*;

public class audioPlayer {
    public static void main(String[] args) {

        //Creating an audio player that works with only .wav files

        Scanner sc = new Scanner(System.in);
        File file = new File("C:\\Users\\dell\\Desktop\\Java\\Advanced\\");
        AudioInputStream as;

        {
            try {
                as = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(as);

                clip.start();

                String res = sc.next();
            } catch (UnsupportedAudioFileException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (LineUnavailableException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
