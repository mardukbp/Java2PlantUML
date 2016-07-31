package com.github.juanmf.java2plant;


import com.github.juanmf.java2plant.render.Filters;

/**
 * @author juanmf@gmail.com
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        String thePackage = 1 == args.length ? args[0] : "com.github.juanmf";
        System.out.println(Parser.parse(thePackage, Filters.FILTER_ALLOW_ALL));
    }
}
