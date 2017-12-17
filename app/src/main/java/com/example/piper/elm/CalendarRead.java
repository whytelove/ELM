package com.example.piper.elm;


import java.io.File;
import java.util.Scanner;

public class CalendarRead {

    public static void main(String[] args) {
        String uc="H1";
        String inputWord="BEGIN:VEVENT";
        String word;
        File file = new File("C:\\Users\\dorian\\Documents\\ELM\\app\\src\\main\\res\\d4quilfe.ics");

        if (uc == "H1"){
            inputWord = "805";
        }
        else if (uc == "H2"){
            inputWord = "940";
        }
        else if (uc == "H3"){
            inputWord = "1115";
        }
        else if (uc == "H4"){
            inputWord = "1245";
        }
        else if (uc == "H5"){
            inputWord = "1420";
        }
        else if (uc == "H6"){
          inputWord = "1555";
        }
        else if (uc == "H7"){
            inputWord = "1730";
        }


        try
        {
            Scanner input = new Scanner(file);
            while(input.hasNext()) {
                word = input.next();
                //System.out.print(word+"\n");
                if (word.toUpperCase().contains(inputWord.toUpperCase())) {
                    while (input.hasNext()) {
                        word = input.next();
                        //System.out.print(word);
                        if (word.toUpperCase().contains("SUMMARY".toUpperCase())) {
                            String tmp2 = word ;
                            String[] tmp = tmp2.split(":");
                            System.out.print(tmp[1] + " " + input.next());


                        }

                    }
                }
                //if (word.toUpperCase().contains("END:VEVENT".toUpperCase())) break;
            }

        }catch(Exception error)
        {}

    }
}





