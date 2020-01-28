package javastudy.yf.ch11;

import java.util.ArrayList;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 24, 2020 1:04:32 PM
 * 
 */

public class BTNode {

    public static final int PARSE_IN = 1;

    public static final int PARSE_PRE = 2;

    public static final int PARSE_POST = 3;

    String name;

    BTNode lPointer,rPointer;

    public BTNode(String s) {

         name = s;

         lPointer = rPointer = null;

    }

   

    public void insert(String s) {

         insert(this,s);

    }

   

    private static void insert(BTNode node,String s) {

         int comparison = s.compareTo(node.name);

         if(comparison < 0) {

              if(node.lPointer != null) {

                   insert(node.lPointer,s);

              } else {

                   node.lPointer = new BTNode(s);

              }

         } else if(comparison > 0) {

              if(node.rPointer != null) {

                   insert(node.rPointer,s);

              } else {

                   node.rPointer = new BTNode(s);

              }

         }

    }

   

    public ArrayList<String> parse(final int parseOrder) {

         return parse(this,parseOrder);

    }

   

    private static ArrayList<String> parse(BTNode node, final int parseOrder) {

         ArrayList<String> retVal = new ArrayList<String>();

         if(node == null) {

              return(retVal);

         }

         ArrayList<String> leftList = parse(node.lPointer,parseOrder);

         ArrayList<String> rightList = parse(node.rPointer,parseOrder);

         if(parseOrder == PARSE_PRE) {

              retVal.add(node.name);

              retVal.addAll(leftList);

              retVal.addAll(rightList);

         } else if (parseOrder == PARSE_POST) {

              retVal.addAll(leftList);

              retVal.addAll(rightList);

              retVal.add(node.name);

         } else {

              retVal.addAll(leftList);

              retVal.add(node.name);

              retVal.addAll(rightList);

         }

         return retVal;

    }
    
    public static void main(String[] args) {
		String string11 = "hello";
		String string22 = "hello";
		String string33 = new String("HELLO"); 
        System.out.println("string1==string2:" + (string11==string33) );
        System.out.println("string1.equals(string2):" + string11.equals(string33) );
        System.out.println("string1.equalsIgnoreCase(string2):" + string11.equalsIgnoreCase(string33) );
        System.out.println("string1.compareTo(string2):" + string11.compareTo(string33) );
        System.out.println("string1.compareToIgnoreCase(string2):" + "a1".compareToIgnoreCase("aa") );
        
        

        String[] names = {"Hervaeus","Peter Auriol","Guiral","Felix","Lila","Lola","Yippy","Yiiiipppy","Acton","Pierce","Betty"};

        BTNode node = new BTNode(names[0]);

        for(int i = 1; i < names.length; i++) {

             node.insert(names[i]);

        }
        
       
        
        System.out.println("*************");

        ArrayList<String> traversedNames = node.parse(BTNode.PARSE_IN);

        for(String s : traversedNames) {

             System.out.println(s);

        }

    }

}


