package models.finder;

import com.avaje.ebean.Finder;
import models.Institute;

public class InstituteFinder extends Finder<Long,Institute> {

  /**
   * Construct using the default EbeanServer.
   */
  public InstituteFinder() {
    super(Institute.class);
  }

  /**
   * Construct with a given EbeanServer.
   */
  public InstituteFinder(String serverName) {
    super(Institute.class, serverName);
  }
}
