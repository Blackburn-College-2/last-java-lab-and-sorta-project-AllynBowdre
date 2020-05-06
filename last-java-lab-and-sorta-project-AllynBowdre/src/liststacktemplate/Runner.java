package liststacktemplate;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allyn
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList<String> ls1 = new MyList().add("a").add("b").add("c").add("d");
        System.out.println(ls1);
    }

}
