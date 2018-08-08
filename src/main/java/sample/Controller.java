package sample;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Controller {

    ArrayList<Person> persons = new ArrayList<Person>();

    public void fileRead() {

        try

        {

            Scanner sc = new Scanner(new File("/vnx1/home/shirazc/IdeaProjects/ARGH/color"));
            sc.useDelimiter("Date:|Name:|Company:|Color:");
            while (sc.hasNext()) {

                Person p = new Person();

                String a = sc.next().trim();
                String b = sc.next().trim();
                String c = sc.next().trim();
                String d = sc.next().trim();

                p.setDate(a);
                p.setName(b);
                p.setCompany(c);
                p.setColor(d);

                persons.add(p);

            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }
        System.out.println("FILE READ.");
    }

    public void yetAnotherWay(){
        System.out.println(Arrays.asList(persons));
        JOptionPane.showMessageDialog(null, Arrays.asList(persons));
    }

    public void otherWay() {
        String colorSelection = JOptionPane.showInputDialog("Enter one of the 7 colors of the spectrum:");

        PrintWriter outputFile = null;

        try
        {
            outputFile = new PrintWriter("Sorted2.txt");
        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        int count = 0;

        for (Person p : persons)
            if (colorSelection.equalsIgnoreCase(p.getColor()))
            {
                System.out.println(p);
                outputFile.print(p);
                count++;
            }

            outputFile.close();

        System.out.println("Total members: " + count);
    }

    public void parseR() {
        int count = 0;
        for (Person p : persons) {
            String q = p.getColor();
            if (q.equals("red")) {
                System.out.println(p);
                count++;
            }

        }
        System.out.println("Total number of members = " + count + ".\n");
    }

    public void parseO() {
        int count = 0;
        for (Person p : persons) {
            if (p.getColor().equals("orange")) {
                System.out.println(p);
                
                count++;
            }
        }
        System.out.println("Total number of members = " + count + ".\n");
    }

    public void parseY() {
        int count = 0;
        for (Person p : persons) {
            String q = p.getColor();
            if (q.equals("yellow")) {
                System.out.println(p);
                count++;
            }
        }
        System.out.println("Total number of members = " + count + ".\n");
    }

    public void parseG() {
        int count = 0;
        for (Person p : persons) {
            String q = p.getColor();
            if (q.equals("green")) {
                System.out.println(p);
                count++;
            }
        }
        System.out.println("Total number of members = " + count + ".\n");
    }

    public void parseBlue() {
        int count = 0;
        for (Person p : persons) {
            String q = p.getColor();
            if (q.equals("blue")) {
                System.out.println(p);
                count++;
            }
        }
        System.out.println("Total number of members = " + count + ".\n");
    }

    public void parseI() {
        int count = 0;
        for (Person p : persons) {
            String q = p.getColor();
            if (q.equals("indigo")) {
                System.out.println(p);
                count++;
            }
        }
        System.out.println("Total number of members = " + count + ".\n");
    }

    public void parseV() {
        int count = 0;
        for (Person p : persons) {
            String q = p.getColor();
            if (q.equals("violet")) {
                System.out.println(p);
                count++;
            }
        }
        System.out.println("Total number of members = " + count + ".\n");
    }

    public void helpMsg() {
        System.out.println("I WORK");
        JOptionPane.showMessageDialog(null, "Step 1: Please go to File --> Open to load and display"
                + " the full contents of the file.\n" +
                "Step 2: Then, choose a color. All persons with that" +
                " color, and their total number, will be displayed." +
                "\nAlternative Step 2: Click the button that does not" +
                " have any color listed on it. Follow the prompt.");
    }

    public void clear() {
        persons.clear();
        System.out.println("    clear!");
    }

    public void exitApp() {
        System.out.println("    exit!");
        System.exit(0);
    }
}