package edu.handong.csee.java.example.fileread.benchmark;

import java.io.*;

/**
 * Created by sherxon on 4/23/17. https://github.com/sherxon/AlgoDS/tree/master/src/oi
 */
public class UsingBufferedReader {
    public static void main(String[] args) throws IOException {


        //-------------- Test reading 1 MB file. --------------------
    	for(String filePath : args) {
	        StopWatch.start();
	
	        BufferedReader inputStream= new BufferedReader(new FileReader(filePath));
	        while (inputStream.read()!=-1){}
	
	        long duration = StopWatch.stop();
	        System.out.println(duration + " milsec");
	        
	        inputStream.close();
    	}
    }
}
