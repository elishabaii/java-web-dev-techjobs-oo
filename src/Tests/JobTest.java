package Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;
  import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
        assertEquals(jobId, jobId2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String name = test_job.getName();
        Employer employer1 = test_job.getEmployer();
        String employerValue = employer1.getValue();
        Location location1 = test_job.getLocation();
        String locationValue = location1.getValue();
        PositionType positionType1 = test_job.getPositionType();
        String positionTypeValue = positionType1.getValue();
        CoreCompetency coreCompetency1 = test_job.getCoreCompetency();
        String coreCompetencyValue = coreCompetency1.getValue();

        assertTrue(test_job instanceof Job);
        assertTrue(employer1 instanceof Employer);
        assertTrue(location1 instanceof Location);
        assertTrue(positionType1 instanceof PositionType);
        assertTrue(coreCompetency1 instanceof CoreCompetency);

        assertEquals(name, "Product tester");
        assertEquals(employerValue, "ACME");
        assertEquals(locationValue, "Desert");
        assertEquals(positionTypeValue, "Quality control");
        assertEquals(coreCompetencyValue, "Persistence");

    }

    @Test
    public void testJobsForEquality() {
        Job test_job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        int jobId = test_job.getId();
        int jobId2 = test_job2.getId();
        //assertFalse(jobId == jobId2);
        //jobId++;
        assertFalse(jobId == jobId2);
    }

    @Test
    public void testToString() {
        Job test_job1 = new Job();

        Job test_job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String testString = test_job1.toString(test_job);
//assert true that the job object begins and ends with a blank line
        //assertTrue(Boolean.parseBoolean(test_Job.toString()));
            }

}
