package org.example;
import java.util.Array.List;



public class foodController {
    private List<food> food = new ArrayList<>();

    public foodController(){
        food.add(new food(title:"Maistas 1",summary:"aprasymas", category: "kategorija 1"));
        food.add(new food ("Maistas 2", "aprasymas", "kategorija 2"));

        public void addfood(String title, String summary, String category){
            food.add(new food(title, summary,category));
            System.out.println("pasirinktas maistas pridetas"+title);
        }

    }
    System.out.println("Maistas nerastas");
}
