package Application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ProgramVinteUm {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        Post p1 = new Post(sdf.parse("02/07/2024 15:30:54"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        Post p2 = new Post(sdf.parse("03/07/2024 23:54:54"),
                "Good Night Guys",
                "See you tomorrow",
                5);
       p1.addComment(c1);
       p1.addComment(c2);
       p2.addComment(c3);
       p2.addComment(c4);

       System.out.println(p1);
       System.out.println();
       System.out.println(p2);


        sc.close();
    }
}
