package Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
public class JobTest {
    Job test_Job;
    @Test
    public void testSettingJobId() {
      Job test_job = new Job();
      Job test_job2 = new Job();
      int jobId = test_job.getId();
      int jobId2 = test_job2.getId();
       assertFalse(jobId == jobId2);
        jobId++;
        assertEquals(jobId,jobId2);

    }


}
