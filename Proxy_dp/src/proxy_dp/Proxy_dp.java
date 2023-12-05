
package proxy_dp;


public class Proxy_dp {

    
    public static void main(String[] args) {
        Image image = new RealImage("test_10mb.jpg");
image.Display();

image = new RealImage("test_10mb.jpg");
image.Display();

//use proxy
Image proxyImage = new ProxyImage("test_10mb.jpg");
//image will be loaded from disk
proxyImage.Display();
System.out.println("");
//image will not be loaded from disk
proxyImage.Display();

    }
    
}
