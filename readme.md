# Examples on how to access data from the internet

Start out by simply reading this file...

```java
public class Internet {
    public static void main(String[] args) {
        URL resource = new URL("https://raw.githubusercontent.com/MagnusSilverdal/InternetTE20/master/readme.md");
        Scanner urlScanner = new Scanner(resource.openStream());
        while (urlScanner.hasNext()) {
            System.out.println(urlScanner.nextLine());
        }
    }
}
```

This could be used for reading all kinds of text-data located at an url. To read an image or any other file you could 
do like this
```java
resource = new URL("https://raw.githubusercontent.com/MagnusSilverdal/InternetTE20/master/smiley.png");
ImageIcon icon = new ImageIcon(resource);
JOptionPane.showMessageDialog(null, "Allt kommer att gå bra!", "Jag lovar", JOptionPane.INFORMATION_MESSAGE, icon);
```
Finally, to get dynamic data generated from an API you replace the url with a request to the API and treat the response in 
a suitable manner
```java
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
```
