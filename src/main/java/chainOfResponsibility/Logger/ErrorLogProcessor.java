package chainOfResponsibility.Logger;

public class ErrorLogProcessor extends LogProcessorHandler{
    public ErrorLogProcessor(LogProcessorHandler nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void printLog(int level, String message) {
        if(level==ERROR){
            System.out.println("ERROR:"+message);
        }else{
            super.printLog(level, message);
        }
    }
}
