package com.example.lesson1;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Scanner;

@Component
public class BeanData {

    public String Login;
    public Integer PIN;

    File file = new File("D://", "Profile.txt");

    public String setLogin(){
        System.out.println("Введите логин: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public Integer setPIN(){
        System.out.println("Введите PIN-код: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public void InsertData(BeanData beanData){

        if (file.exists())
        {
            WriteData(file, beanData.Login + "\r\n" + beanData.PIN);
        }
        else
        {
            try
            {
                boolean created = file.createNewFile();
                if(created){
                    WriteData(file, beanData.Login + "\r\n" + beanData.PIN);
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public void WriteData(File file, String text){
        try(FileWriter writer = new FileWriter(file, false))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public String[] ReadData(){

        String[] data = new String[2];
        try
        {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = "";

            for (int i = 0; i < data.length; i++)
            {
                data[i] = bufferedReader.readLine();
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        return data;
    }

    public String EditData(String[] data){

        return "Login: " + data[0] + "\r\nPin: " + data[1];
    }

    public void DeleteData(){
        try(FileWriter writer = new FileWriter(file, false))
        {
            writer.write("");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
