import org.avaje.ebean.typequery.generator.Generator;
import org.avaje.ebean.typequery.generator.GeneratorConfig;

import java.io.IOException;

/**
 * Created by pqtran on 17-5-11.
 */
public class ModelFinderGenerator {

    public static void main(String[] args) throws IOException {
        GeneratorConfig config = new GeneratorConfig();
        config.setClassesDirectory("./target/scala-2.11/classes");
        config.setDestDirectory("./app");
        config.setEntityBeanPackage("models");
        config.setDestPackage("models.query");

        config.setAddFinderWhereMethod(false);
        config.setOverwriteExistingFinders(true);

        Generator generator = new Generator(config);
        generator.generateFinders();
    }
}
