/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_ele21_medrosond;

/**
 *
 * @author phetamine
 */
public class Singer {
    String name;
    int noOfPerformances = 0;
    double earnings;
    Song FaveSong;
    int audience;
    String title;
    public Singer(String n){
        name = n;
    }
    public void performForAuudience(int people){
        noOfPerformances = noOfPerformances + 1;
        earnings = people * 100;
        audience = people;
    }
    public void changeFave(Song song){
        FaveSong = song;
        title = FaveSong.songName;
        System.out.println(name + "New Favorite Song is now" + title);
    }
    public void display(){
        System.out.println(name + " performed to " + audience + " people.");
    
        System.out.println(" ");
    }
}
