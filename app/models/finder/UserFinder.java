package models.finder;

import com.avaje.ebean.Finder;
import models.User;

public class UserFinder extends Finder<Long,User> {

  /**
   * Construct using the default EbeanServer.
   */
  public UserFinder() {
    super(User.class);
  }

  /**
   * Construct with a given EbeanServer.
   */
  public UserFinder(String serverName) {
    super(User.class, serverName);
  }
}
