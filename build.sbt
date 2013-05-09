import com.typesafe.sbt.SbtStartScript

seq(SbtStartScript.startScriptForClassesSettings: _*)

name := "proxycubes"

version := "0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.twitter" % "finatra" % "1.1.0",
  "net.liftweb" % "lift-json_2.9.1"  % "2.4",
  "joda-time" % "joda-time" % "2.1",
  "org.joda" % "joda-convert" % "1.2",
  "com.google.guava" % "guava" % "14.0.1",
//  "junit" % "junit" % "4.11" % "test",
//  "org.scalamock" %% "scalamock-scalatest-support" % "2.4" % "test"
//  "org.scalamock" %% "scalamock-scalatest-support" % "2.4" % "test"
  "org.mockito" % "mockito-core" % "1.9.5" % "test"
)

resolvers ++= Seq(
  "twttr" at "http://maven.twttr.com",
  "Maven repo2" at "http://repo2.maven.org/maven2"
)

scalaVersion := "2.9.2"

