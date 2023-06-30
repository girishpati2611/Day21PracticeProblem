package org.example;
import org.example.MoodAnalysisException;

public class MoodAnalyser {
    String message;
    public MoodAnalyser() {
    }
    public MoodAnalyser(String message){
        this.message=message;
    }

    public static String analyseMood(String message)throws MoodAnalysisException{
        if(message=="I am in sad mood"){
            System.out.println("SAD");
            return "SAD";
        }else if(message=="I am in any mood"){
            System.out.println("HAPPY");
            return "HAPPY";
        }else
            throw new MoodAnalysisException("Enter your mood.");
    }

    public static void main(String[] args) {
        try{
            analyseMood("I am in any mood");
        }catch (MoodAnalysisException me){
            me.printStackTrace();
        }
        MoodAnalyser obj=new MoodAnalyser(" ");
    }
}
