package org.activiti;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

import javax.annotation.PostConstruct;

@RestController
public class HireProcessRestController {
	
	private static final Logger logger = LoggerFactory
			.getLogger(HireProcessRestController.class);

	@PostConstruct
	public void logSomething() {
		logger.debug("*********************");
		logger.trace("Habemus log");
	}

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private ApplicantRepository applicantRepository;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/start-hire-process", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void startHireProcess(@RequestBody Map<String, String> data) {

        Applicant applicant = new Applicant(data.get("name"), data.get("email"), data.get("phoneNumber"));
        Map<String, Object> vars = Collections.<String, Object>singletonMap("applicant", applicant);
        ProcessInstance p =runtimeService.startProcessInstanceByKey("hireProcessWithJpa", vars);
        
        
        applicant.setProcessInstanceId(p.getProcessInstanceId());
        logger.info("*********************************************************************************************************");
		logger.info("****** Logando o ID do processo "+ applicant.getProcessInstanceId() + "*********************");
		logger.info("*********************************************************************************************************");
        applicantRepository.save(applicant);


    }

}