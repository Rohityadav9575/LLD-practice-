package chainOfResponsibility.Logger;

public class InfoLogProcessor extends LogProcessorHandler{
    public InfoLogProcessor(LogProcessorHandler nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void printLog(int level, String message) {
        if(level==INFO){
            System.out.println("INFO:"+message);
        }else {
            super.printLog(level, message);
        }
    }
}
