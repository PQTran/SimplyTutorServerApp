import models.Institute;
import models.finder.InstituteFinder;
import org.junit.Before;
import org.junit.Test;
import play.test.Helpers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by pqtran on 17-5-15.
 */
public class EbeanTest {

    @Before
    public void setupDb() {
        Map<String, String> settings = new HashMap<String, String>();
        settings.put("db.default.url", "jdbc:mysql://localhost:3306/test_smpt");
        Helpers.fakeApplication(settings);
    }

    private void seedTest() {
        String name = UUID.randomUUID().toString();

        Institute institute = new Institute();
        institute.setName(name);
        institute.save();
    }

    @Test
    public void create() {
        InstituteFinder finder = new InstituteFinder();
        int count = finder.all().size();
        assertEquals(0, count);

        String name = UUID.randomUUID().toString();

        Institute institute = new Institute();
        institute.setName(name);
        institute.save();

        int newCount = finder.all().size();

        assertNotNull(institute.getId());
        assertEquals(count + 1, newCount);
    }

    @Test
    public void update() {
        seedTest();

        InstituteFinder finder = new InstituteFinder();
        int count = finder.all().size();

        assertEquals(1, count);

        Institute institute = finder.all().get(0);

        String name = UUID.randomUUID().toString();
        institute.setName(name);
        institute.save();

        int newCount = finder.all().size();
        assertEquals(count, newCount);

        Institute queriedInstitute = finder.byId(institute.getId());
        assertEquals(name, queriedInstitute.getName());
    }

    @Test
    public void delete() {
        seedTest();

        InstituteFinder finder = new InstituteFinder();
        int count = finder.all().size();

        assertEquals(1, count);

        Institute institute = finder.all().get(0);
        institute.delete();

        int newCount = finder.all().size();
        assertEquals(0, newCount);
    }
}
