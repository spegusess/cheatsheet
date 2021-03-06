package cheatsheet;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile{
    
    private String path;
    
    public ReadFile(String file_path){
        path = file_path;
    }
    
    public String[] OpenFile() throws IOException{
        FileReader fr = new FileReader(path);
        BufferedReader txtReader = new BufferedReader(fr);
        
        int numberOfLines = 3;
        String[] txtData = new String[numberOfLines];
        
        int i;
        for(i=0; i<numberOfLines; i++){
            txtData[i] = txtReader.readLine();
        }
        
        txtReader.close();
        return txtData;
    }
    
    int readLines() throws IOException{
        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);
        
        String aLine;
        int numberOfLines = 0;
        while((aLine = bf.readLine()) != null){
            numberOfLines++;
        }
        bf.close();
        return numberOfLines;
    }
    
}
