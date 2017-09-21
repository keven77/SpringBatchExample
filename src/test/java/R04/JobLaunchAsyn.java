package R04;

import com.cpb.example.R04.BrandConf;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author pengbo
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: TODO
 * @date ${date} ${time}
 */
public class JobLaunchAsyn {
    /**
     * 批量作业异步处理
     * @param jobPath  作业路径
     * @param jobName  作业名称
     * @param builder  作业参数构造器
     */
       public static void executeJob(String jobPath, String jobName, JobParametersBuilder builder) {
           ApplicationContext applicationContext = new ClassPathXmlApplicationContext(jobPath);
           JobLauncher jobLauncher = (JobLauncher) applicationContext.getBean("jobLauncherAsyn");
           Job job =  (Job)applicationContext.getBean(jobName);
           try {
               JobExecution result = jobLauncher.run(job,builder.toJobParameters());
               System.out.println(result);
           } catch (JobExecutionAlreadyRunningException e) {
               e.printStackTrace();
           } catch (JobRestartException e) {
               e.printStackTrace();
           } catch (JobInstanceAlreadyCompleteException e) {
               e.printStackTrace();
           } catch (JobParametersInvalidException e) {
               e.printStackTrace();
           }
       }

       public static void main(String[] args) {
           executeJob("R04/job/job-listener.xml","brandConfJob",new JobParametersBuilder().addDate("date",new Date()));
       }
}
