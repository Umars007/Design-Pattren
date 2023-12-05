/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_dp;

/**
 *
 * @author fa20-bse-155
 */
public class ProxyImage implements Image{
    private RealImage realImage; //real image field
    private String fileName;
public ProxyImage(String fileName){
    this.fileName = fileName;
}
public String getFileName(){
        String filename = null;
  return filename;
}
public void Display() {
    if(realImage == null){
    realImage = new RealImage(fileName);
    }
    realImage.Display();
  }
}
