package models.finder;

import com.avaje.ebean.Finder;
import models.Role;

public class RoleFinder extends Finder<Long,Role> {

  /**
   * Construct using the default EbeanServer.
   */
  public RoleFinder() {
    super(Role.class);
  }

  /**
   * Construct with a given EbeanServer.
   */
  public RoleFinder(String serverName) {
    super(Role.class, serverName);
  }
}
