/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02_ele21_medrosond;

/**
 *
 * @author phetamine
 */
public class EX02_ELE21_MedrosoND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Artist panchiko1 = new Artist("Owain", "Kicking Cars");
        Artist panchiko2 = new Artist("Owain", "All They Wanted");
        Artist panchiko3 = new Artist("Owain", "CUT");
        
        Song ATW = new Song(panchiko2.song, 11478341, 8);
        Song KC = new Song(panchiko1.song, 6074103, 7.8);
        Song CUT = new Song(panchiko3.song, 3826598, 7.4 );
        
        Singer singer1 = new Singer(panchiko1.singer);
        singer1.FaveSong = ATW;
        singer1.performForAuudience(30);
        singer1.display();
        singer1.changeFave(CUT);
    }
    
}
