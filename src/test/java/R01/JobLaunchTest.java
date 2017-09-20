package R01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
        "classpath*:/R01/job/job.xml"
})
public class JobLaunchTest {

    @Autowired
    private JobLauncher jobLauncher;
    @Autowired
    private Job job;
    @Qualifier("brandConf")

    @Before
    public void before() throws Exception {

    }

    @After
    public void after() throws Exception {

    }

    @Test
    public void testBrandConf() throws  Exception {
        JobExecution result = jobLauncher.run(job,new JobParameters());
        System.out.println(result.toString());
    }
}
