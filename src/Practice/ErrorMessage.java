package Practice;
 class ErrorMessage {
     final int OUTERR = 0;
     final int INERR = 1;
     final int DISKERR = 2;
     final int INDEXERR = 3;
    String msgs[] = {"Output error", "Input error", "Disk full", "Index is out of diapason"};

    String getErrorMessage(int i){
        if (i>= 0 & i< msgs.length)
            return msgs[i];
        else
            return "MISSING ERROR CODE";
    }
}
