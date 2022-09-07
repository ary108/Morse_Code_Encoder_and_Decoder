package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String word = ".- .-. -.-- .- -. / .- -. -.. / -- .- .-. -.- ";
        decode(word);

        System.out.println();

        String word2 = "HI 123";
        encode(word2);

    }

    public static void decode(String word) {

        SearchTree st = new SearchTree("");
//  1st Level
        st.getOverallRoot().left = new IntTreeNode("E");
        st.getOverallRoot().right = new IntTreeNode("T");

//  2nd Level
        st.getOverallRoot().left.left = new IntTreeNode("I");
        st.getOverallRoot().left.right = new IntTreeNode("A");
        st.getOverallRoot().right.left = new IntTreeNode("N");
        st.getOverallRoot().right.right = new IntTreeNode("M");

//  3nd Level
        st.getOverallRoot().left.left.left = new IntTreeNode("S");
        st.getOverallRoot().left.left.right = new IntTreeNode("U");
        st.getOverallRoot().left.right.left = new IntTreeNode("R");
        st.getOverallRoot().left.right.right = new IntTreeNode("W");
        st.getOverallRoot().right.left.left = new IntTreeNode("D");
        st.getOverallRoot().right.left.right = new IntTreeNode("K");
        st.getOverallRoot().right.right.left = new IntTreeNode("G");
        st.getOverallRoot().right.right.right = new IntTreeNode("O");

// 4th Level
        st.getOverallRoot().left.left.left.left = new IntTreeNode("H");
        st.getOverallRoot().left.left.left.right = new IntTreeNode("V");
        st.getOverallRoot().left.left.right.left = new IntTreeNode("F");
        st.getOverallRoot().left.left.right.right = new IntTreeNode("");
        st.getOverallRoot().left.right.left.left = new IntTreeNode("L");
        st.getOverallRoot().left.right.left.right = new IntTreeNode("");
        st.getOverallRoot().left.right.right.left = new IntTreeNode("P");
        st.getOverallRoot().left.right.right.right = new IntTreeNode("J");
        st.getOverallRoot().right.left.left.left = new IntTreeNode("B");
        st.getOverallRoot().right.left.left.right = new IntTreeNode("X");
        st.getOverallRoot().right.left.right.left = new IntTreeNode("C");
        st.getOverallRoot().right.left.right.right = new IntTreeNode("Y");
        st.getOverallRoot().right.right.left.left = new IntTreeNode("Z");
        st.getOverallRoot().right.right.left.right = new IntTreeNode("Q");
        st.getOverallRoot().right.right.right.left = new IntTreeNode("");
        st.getOverallRoot().right.right.right.right = new IntTreeNode("");

// 5th Level
        st.getOverallRoot().left.left.left.left.left = new IntTreeNode("5");
        st.getOverallRoot().left.left.left.left.left = new IntTreeNode("4");
        st.getOverallRoot().left.left.left.right.right = new IntTreeNode("3");
        st.getOverallRoot().left.left.right.right.right = new IntTreeNode("2");
        st.getOverallRoot().left.right.right.right.right = new IntTreeNode("1");
        st.getOverallRoot().right.left.left.left.left = new IntTreeNode("6");
        st.getOverallRoot().right.right.left.left.left = new IntTreeNode("7");
        st.getOverallRoot().right.right.right.left.left = new IntTreeNode("8");
        st.getOverallRoot().right.right.right.right.left = new IntTreeNode("9");
        st.getOverallRoot().right.right.right.right.right = new IntTreeNode("0");

        IntTreeNode current = st.getOverallRoot();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == ' ') {
                System.out.print(current.data);
                current = st.getOverallRoot();
            } else if (c == '-') {
                current = current.right;
            } else if (c == '.') {
                current = current.left;
            } else if (c == '/') {
                System.out.print(" ");
                current = st.getOverallRoot();
            }
        }
    }

    public static void encode(String word) {
        HashMap<String,String> map = new HashMap<>();
        map.put("A",".-");
        map.put("B", "-...");
        map.put("C", "-.-.");
        map.put("D", "-..");
        map.put("E", ".");
        map.put("F", "..-.");
        map.put("G","--.");
        map.put("H", "....");
        map.put("I", "..");
        map.put("J", ".---");
        map.put("K", "-.-");
        map.put("L", ".-..");
        map.put("M","--");
        map.put("N", "-.");
        map.put("O", "---");
        map.put("P", ".--.");
        map.put("Q", "--.-");
        map.put("R", ".-.");
        map.put("S","...");
        map.put("T", "-");
        map.put("U", "..-");
        map.put("V", "...-");
        map.put("W", ".--");
        map.put("X", "-..-");
        map.put("Y", "-.--");
        map.put("Z", "--..");
        map.put("1", ".----");
        map.put("2", "..---");
        map.put("3", "...--");
        map.put("4", "....-");
        map.put("5", ".....");
        map.put("6", "-....");
        map.put("7", "--...");
        map.put("8", "---..");
        map.put("9", "----.");
        map.put("10", "-----");

        for (int i = 0; i < word.length(); i++) {
            String c = word.substring(i,i+1);
            if (c.equals(" ")) {
                System.out.print("/");
            } else if (map.containsKey(c)) {
                System.out.print(map.get(c)+" ");
            }
        }
    }
}
