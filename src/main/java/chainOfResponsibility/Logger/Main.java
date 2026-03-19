package chainOfResponsibility.Logger;

public class Main {
    public static void main(String[] args) {
        //chain info->debug->error
        LogProcessorHandler logger=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logger.printLog(1,"this is info logs ");
        logger.printLog(2,"this is debug logs ");
        logger.printLog(3,"this is error logs");

    }
}
