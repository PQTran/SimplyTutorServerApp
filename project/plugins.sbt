// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.10")

// Model enhancer, necessary for ORM to function
addSbtPlugin("com.typesafe.sbt" % "sbt-play-enhancer" % "1.1.0")

// Play Ebean support, to enable, uncomment this line, and enable in your build.sbt using
// enablePlugins(PlayEbean).
addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "4.0.0-M1")
