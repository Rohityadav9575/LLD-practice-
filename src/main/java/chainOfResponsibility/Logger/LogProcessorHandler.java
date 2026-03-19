package chainOfResponsibility.Logger;

public abstract class LogProcessorHandler {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;
    LogProcessorHandler nextLogProcessor;

    public LogProcessorHandler(LogProcessorHandler nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void printLog(int level,String message){
        if(nextLogProcessor!=null){
            nextLogProcessor.printLog(level, message);
        }
    }
}
