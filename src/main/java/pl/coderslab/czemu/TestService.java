package pl.coderslab.czemu;

public class TestService {

    private final OtherService otherService;
    private final OtherRepository repository;

    public TestService(OtherService otherService, OtherRepository repository) {
        this.otherService = otherService;
        this.repository = repository;
    }

    public void doJob(){
        otherService.doOther();
        repository.saveSomething();
        System.out.println("Job's done");
    }
}
