package net.marcioguimaraes.wycash.model;

import net.marcioguimaraes.wycash.expression.Expression;

import java.util.Hashtable;

public class Bank {

    private Hashtable<Pair, Integer> rates = new Hashtable<>();

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        this.rates.put(new Pair(from, to), rate);
    }

    public int rate(String from, String to) {
        return from.equals(to) ? 1 : rates.get(new Pair(from, to));
    }

}
