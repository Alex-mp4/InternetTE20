# Examples on how to access data from the internet

Start out by simply reading this file...

```java
public class Internet {
    public static void main(String[] args) {
        URL resource = new URL("");
        Scanner urlScanner = new Scanner(resource.openStream());
        while (urlScanner.hasNext()) {
            System.out.println(urlScanner.nextLine());
        }
    }
}
```

This could be used for reading all kinds of text-data located at an url. To read an image or any other file you could 
do like this

