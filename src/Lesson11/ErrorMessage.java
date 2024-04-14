package Lesson11;

public class ErrorMessage {
    static final  int OUTERR = 0;
    final int INNERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

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
