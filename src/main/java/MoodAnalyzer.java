public class MoodAnalyzer {
    //uc1
    String message;
    public MoodAnalyzer(){

    }
    public MoodAnalyzer(String message){
        this.message = message;
    }
    public String analyzeMood(String message){
        if (message.contains("I am in Sad Mood")){
            return "SAD";
        }else if(message.contains("I am in Any Mood")){
            return "HAPPY";
        }
        else
            return null;
    }
    
}

