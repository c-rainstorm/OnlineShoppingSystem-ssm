package com.github.crainstorm.oss.util;

/**
 * Created by chen on 4/19/17.
 */
public class CheckArgument {

    public static void notEmpty(String argument, String argumentName){
        if(argument == null || "".equals(argument)){
            throw new IllegalArgumentException(argumentName + " can't be null or empty!");
        }
    }
}
