import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Internet {
    public static void main(String[] args) throws IOException {
        URL resource = new URL("https://raw.githubusercontent.com/Alex-mp4/gymnarb-11ty-fin/master/documentation.md?token=GHSAT0AAAAAAB5LKNUBKZ2LU5I63U3FKFMWY6SPQTQ");
        Scanner urlScanner = new Scanner(resource.openStream());
        while (urlScanner.hasNext()) {
            System.out.println(urlScanner.nextLine());
        }

        resource = new URL("https://raw.githubusercontent.com/MagnusSilverdal/InternetTE20/master/smiley.png");
        ImageIcon icon = new ImageIcon(resource);
        JOptionPane.showMessageDialog(null, "Allt kommer att gå bra!", "Jag lovar", JOptionPane.INFORMATION_MESSAGE, icon);

        System.out.println(weather("savar"));

    }

    public static String weather(String place) {
        String request = "http://api.temperatur.nu/tnu_1.17.php?p=" + place + "&cli=api_demo";
        String temperature = "";
        try {
            URL resource = new URL(request);
            Scanner urlScanner = new Scanner(resource.openStream());
            String result = urlScanner.nextLine();
            temperature = result.split("\"")[23];
        } catch (Exception e) {
            e.printStackTrace();
        }
        return temperature;
    }
}