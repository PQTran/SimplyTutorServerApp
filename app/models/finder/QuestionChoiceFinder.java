package models.finder;

import com.avaje.ebean.Finder;
import models.QuestionChoice;

public class QuestionChoiceFinder extends Finder<Long,QuestionChoice> {

  /**
   * Construct using the default EbeanServer.
   */
  public QuestionChoiceFinder() {
    super(QuestionChoice.class);
  }

  /**
   * Construct with a given EbeanServer.
   */
  public QuestionChoiceFinder(String serverName) {
    super(QuestionChoice.class, serverName);
  }
}
