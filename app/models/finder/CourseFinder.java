package models.finder;

import com.avaje.ebean.Finder;
import models.Course;

public class CourseFinder extends Finder<Long,Course> {

  /**
   * Construct using the default EbeanServer.
   */
  public CourseFinder() {
    super(Course.class);
  }

  /**
   * Construct with a given EbeanServer.
   */
  public CourseFinder(String serverName) {
    super(Course.class, serverName);
  }
}
