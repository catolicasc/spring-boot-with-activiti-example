package novop;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.IdentityService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyApp {

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
        System.out.println("Método");
    }

    @Bean
    public CommandLineRunner init(final RepositoryService repositoryService,
                                final RuntimeService runtimeService,
                                 final TaskService taskService) {

        return new CommandLineRunner() {
           @Override
          public void run(String... strings) throws Exception {
                Map<String, Object> variables = new HashMap();
                
                variables.put("nomeProfessor1", "Glauco");
                variables.put("graducaoProfessor1", "Glauco.doe@activiti.com");
                variables.put("horasAlocadas1", "123456789");
                
                variables.put("nomeProfessor2", "Mauricio");
                variables.put("graducaoProfessor2", "Mauricio.doe@activiti.com");
                variables.put("horasAlocadas2", "123456789");
                
                variables.put("nomeProfessor3", "Amauri");
                variables.put("graducaoProfessor3", "Amauri.doe@activiti.com");
                variables.put("horasAlocadas3", "123456789");
                
                variables.put("nomeProfessor4", "Cleiton Doe");
                variables.put("graducaoProfessor4", "Cleiton.doe@activiti.com");
                variables.put("horasAlocadas4", "123456789");
                
                variables.put("nomeProfessor5", "Dippold Doe");
                variables.put("graducaoProfessor5", "Dippold.doe@activiti.com");
                variables.put("horasAlocadas5", "123456789");
                
    runtimeService.startProcessInstanceByKey("professores_nde_processo", variables);
           }
       };

   }

    @Bean
    InitializingBean usersAndGroupsInitializer(final IdentityService identityService) {

        return new InitializingBean() {
            public void afterPropertiesSet() throws Exception {

                Group group = identityService.newGroup("user");
                group.setName("users");
                group.setType("security-role");
                identityService.saveGroup(group);

                User admin = identityService.newUser("admin");
                admin.setPassword("admin");
                identityService.saveUser(admin);

            }
        };
    }

}
