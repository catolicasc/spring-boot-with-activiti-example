package novop;

import org.activiti.Applicant;
import org.activiti.ApplicantRepository;
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
public class ProfessoresRestController {

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private ProfessoresRepository applicantRepository;

	@ResponseStatus(value = HttpStatus.OK) //200
	@RequestMapping(value = "/start-hire-process", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void startProfessoresProcess(@RequestBody Map<String, String> data) {

		Professores professores = new Professores
				(
				data.get("nomeProfessor1"), data.get("graducaoProfessor1"),
				data.get("horasAlocadas1"),
				
				data.get("nomeProfessor2"), data.get("graducaoProfessor2"),
				data.get("horasAlocadas2"),
				
				data.get("nomeProfessor3"), data.get("graducaoProfessor3"),
				data.get("horasAlocadas3"),
				
				data.get("nomeProfessor4"), data.get("graducaoProfessor4"),
				data.get("horasAlocadas4"),
				
				data.get("nomeProfessor5"), data.get("graducaoProfessor5"),
				data.get("horasAlocadas5"));

		Map<String, Object> vars = Collections.<String, Object> singletonMap("professores", professores);
		ProcessInstance p = runtimeService.startProcessInstanceByKey("professorJpa", vars);

	
		applicantRepository.save(professores);

	}

}
