public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new BaseLogger(),new ConsoleLogger(),new FileLogger(), new EmailLogger(),new DatabaseLogger()};
//        for (BaseLogger logger:loggers){
//            logger.Log("Log mesajı");
//        }
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}