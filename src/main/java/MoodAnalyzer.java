public class MoodAnalyzer {
    //uc2
    String message;
    public MoodAnalyzer(){

    }
    public MoodAnalyzer(String message){
        super();
        this.message = message;
    }
    public String analyseMood(){
        try{
            if (message.contains("I am in Sad Mood")){
                return "SAD";
            }
            else {
                return "HAPPY";
            }

        }catch (NullPointerException e){
            return "HAPPY";
        }

    }

//    public String analyzeMoodWithConstructor(){
//        if (message.contains("I am in Sad Mood")){
//            return "SAD";
//        }else if(message.contains("I am in Any Mood")){
//            return "HAPPY";
//        }
//        else
//
//            return null;
//    }
}

