package io.codage.dsa.structures;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/min-stack/description/">155. Min Stack</a>
 */
public class MinStack {
    private final List<MinElement> stack;

    static class MinElement {
        int val;
        int min;
    }

    public MinStack() {
        this.stack = new ArrayList<>();
    }

    public void push(int val) {
        int min = Integer.MAX_VALUE;
        if (!this.stack.isEmpty()) {
            MinElement top = this.stack.get(stack.size() - 1);
            min = top.min;
        }
        MinElement elem = new MinElement();
        elem.val = val;
        elem.min = Math.min(val, min);
        this.stack.add(elem);
    }

    public void pop() {
        this.stack.remove(this.stack.size() - 1);
    }

    public int top() {
        return this.stack.get(this.stack.size() - 1).val;
    }

    public int getMin() {
        return this.stack.get(stack.size() - 1).min;
    }
}
