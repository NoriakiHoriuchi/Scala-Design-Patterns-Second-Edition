organization := "com.ivan.nikolov"

name := "functional-design-patterns-sbt"

scalaVersion := "2.12.16"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

javaOptions ++= Seq("-target", "1.8", "-source", "1.8")

publishMavenStyle := true

libraryDependencies ++= {
  Seq(
    "org.slf4j" % "slf4j-log4j12" % "1.7.32",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",
    "commons-codec" % "commons-codec" % "1.15",
    "org.scalaz" %% "scalaz-core" % "7.3.7",
    "com.h2database" % "h2" % "1.4.200",
    "org.scalatest" %% "scalatest" % "3.0.9" % "test",
    "org.mockito" % "mockito-all" % "1.10.19" % "test" // mockito for tests
  )
}