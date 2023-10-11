package ie.atu.week4lab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    private RegistrationServiceClient registrationServiceClient;
    private final AcknowledgeService acknowledgeService;

    @Autowired
    public UserController(AcknowledgeService acknoweledgeservice, RegistrationServiceClient registrationServiceClient)
        this.acknowledgeService =  

}
