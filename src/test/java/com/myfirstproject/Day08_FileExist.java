package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

/*
Class: FileExistTest
Method: isExist
Pick a file on your desktop
And verify if that file exist on your computer or not
 */
public class Day08_FileExist {
    @Test
    public void isExist(){
String homeDirectory=System.getProperty("user.home");//C:\Users\toron
        System.out.println(homeDirectory);
        String userDirectory=System.getProperty("user.dir");//C:\Users\toron\IdeaProjects\myseleniumproject
        System.out.println(userDirectory);
        //"C:\Users\toron\OneDrive\Desktop\atiyeJava.png"

        String pathOfFile=homeDirectory+"\\OneDrive\\Desktop\\atiyeJava.png";
        boolean isExist= Files.exists(Paths.get(pathOfFile));
        Assert.assertTrue(isExist);
    }
}
