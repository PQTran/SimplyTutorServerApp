package models.finder;

import com.avaje.ebean.Finder;
import models.Question;

public class QuestionFinder extends Finder<Long,Question> {

  /**
   * Construct using the default EbeanServer.
   */
  public QuestionFinder() {
    super(Question.class);
  }

  /**
   * Construct with a given EbeanServer.
   */
  public QuestionFinder(String serverName) {
    super(Question.class, serverName);
  }
}
