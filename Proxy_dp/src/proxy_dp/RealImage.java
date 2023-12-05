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
public class RealImage implements Image {
    private String filename;
    public RealImage(String filename){
        this.filename = filename;
    }
    public void Display(){
        System.out.println("Displaying "+filename);
    }
    private void LoadFromDisk(String fiename){
        System.out.println("Loading "+filename);
    }

    
}
