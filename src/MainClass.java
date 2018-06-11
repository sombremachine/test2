import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import java.io.*;
import java.util.*;

public class MainClass {
    public static void main(String... args) throws IOException {
        try {
            //Instantiate Configuration class
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_23);
            String path = MainClass.class.getProtectionDomain().getCodeSource().getLocation().toString();
            cfg.setDirectoryForTemplateLoading(new File("src/templates"));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

            //Create Data Model
            User user = new User();
            user.setFirstName("имя");
            user.setSecondName("отчество");
            user.setLastName("фамилия");
            user.setBirthDate(new Date());
            user.setPhone("+7123456789");
            user.setEmail("chubais@sveta.net");
            user.setGoal("какая-то цель");
            user.setWorkExperience("какой-то опыт");
            user.setEducation("какое-то образование");
            user.setAdditionalEducation("какое-то дополнительное образование");
            user.setSkills("навыки");
            user.setCodeSample("begin end;");
            //Instantiate template
            Template template = cfg.getTemplate("index.html");

            //Console output
//            Writer console = new OutputStreamWriter(System.out);
//            template.process(map, console);
//            console.flush();

            // File output
            Writer file = new FileWriter(new File("src/templates/template-output.html"));
            template.process(user, file);
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
