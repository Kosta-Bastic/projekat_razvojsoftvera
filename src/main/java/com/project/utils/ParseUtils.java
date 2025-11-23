package com.project.utils;

public class ParseUtils {
    public static String[] ParseEmail(String input){
        if(input == null || input.isEmpty()){return null;}
        String[] ret = new String[4];
        String[] token = input.split("@");
         ret[2] = "20".concat(token[0].substring(token[0].length()-4,token[0].length()-2));
         ret[3] = token[0].substring(token[0].length()-2);
         token = token[0].split("\\d+");
         ret[1] = token[0].substring(1);
         token = input.split("@");
         String toExclude = ret[1].concat("|"+ret[2].replace("20","")+"|"+ret[3]);
         ret[0] = token[0].substring(1).replaceAll(toExclude,"");
         return ret;
    }
}
