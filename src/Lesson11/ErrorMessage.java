package Lesson11;

public class ErrorMessage {
    static final  int OUTERR = 0;
    final int INNERR = 0;
    final int DISKERR = 0;
    final int INDEXERR = 0;

    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk storage Error",
            "Out of range index Error"
    };
    String getErrorMessage(int i){
        if(i>=0 & i< msgs.length)
            return msgs[i];
        else
            return "Nonexistent error code";
    }
}
