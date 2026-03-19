package chainOfResponsibility.Logger;

public class DebugLogProcessor extends LogProcessorHandler{
    public DebugLogProcessor(LogProcessorHandler nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void printLog(int level, String message) {
        if(level==DEBUG){
            System.out.println("DEBUG:"+message);
        }else {
            super.printLog(level, message);
        }
    }
}
