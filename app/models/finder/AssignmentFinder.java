package models.finder;

import com.avaje.ebean.Finder;
import models.Assignment;

public class AssignmentFinder extends Finder<Long,Assignment> {

  /**
   * Construct using the default EbeanServer.
   */
  public AssignmentFinder() {
    super(Assignment.class);
  }

  /**
   * Construct with a given EbeanServer.
   */
  public AssignmentFinder(String serverName) {
    super(Assignment.class, serverName);
  }
}
