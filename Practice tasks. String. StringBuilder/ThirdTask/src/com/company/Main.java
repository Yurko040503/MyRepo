package com.company;
import java.util.regex.*;
public class Main {
    public static void main(String[] args)
    {
        String text = "   Java    was      originally developed\n"
                + "   by    James   Gosling at Sun Microsystems (which\n"
                + " has since been\n"
                + "acquired by Oracle) and released in 1995\n"
                + " as a core component of Sun Microsystems' Java platform.";
        MyUtils obj = new MyUtils();
        System.out.println(obj.reformatLines(text));
    }
}
class MyUtils {
    public String reformatLines(String text) {
        text = text.trim().replaceAll("\n", " ").replaceAll("\\s+", " ");
        int counter = 0, last = 0;
        StringBuilder justifiedText = new StringBuilder();
        StringBuilder justifiedLine = new StringBuilder();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            for(int j = 0; j < words[i].length(); j++)
            {
                counter++;
            }
            counter++;
            if (counter <= 60){
                justifiedLine.append(words[i]).append(" ");
                last = counter;
            }
            if (counter > 60){
                justifiedLine.delete(last-1, last);
                justifiedText.append(justifiedLine.toString() + "\n");
                justifiedLine.delete(0, counter);
                justifiedLine.append(words[i]).append(" ");
                counter = counter - last;
            }
            if (i == words.length-1){
                justifiedText.append(justifiedLine.toString() + "\n");
                justifiedLine.delete(0, counter);
                counter = 0;
            }
        }
        justifiedText.delete(justifiedText.length()-2, justifiedText.length());
        return justifiedText.toString();
    }
}