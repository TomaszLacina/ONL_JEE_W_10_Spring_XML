package pl.coderslab.czemu;

public class MainNiedobry {

    public static void main(String[] args) {

        TestService testService = new TestService(new OtherService(), new OtherRepository());
//WSZYSTSKO TU MOZE BYC
        testService.doJob();

        testService.doJob();
    }
}
