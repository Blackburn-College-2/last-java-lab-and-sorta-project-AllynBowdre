/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liststacktemplate;

import java.util.LinkedList;

/**
 *
 * @author Allyn
 */
public class ListNode<T> {
    T value;
    ListNode node;
    /**
     * Create a new ListNode given a value.
     *
     * @param v
     */
    ListNode(T v) {
        value = v;
    }

    /**
     * return the value being held by this Node.
     *
     * @return
     */
    public T getValue() {
        return value;
    }
}
