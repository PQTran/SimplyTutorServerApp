name := """SimplyTutorServerApp"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.41",
  "org.avaje.ebean" % "finder-generator" % "2.1.3",
  "com.amazonaws" % "aws-java-sdk" % "1.11.127"
)
