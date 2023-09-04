organization := "com.ivan.nikolov"

name := "structural-design-patterns-sbt"

scalaVersion := "2.12.17"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

javaOptions ++= Seq("-target", "1.8", "-source", "1.8")

publishMavenStyle := true

libraryDependencies ++= {
  val json4sVersion = "3.6.0-M2"
  Seq(
    "org.json4s" %% "json4s-native" % json4sVersion,
    "org.json4s" %% "json4s-jackson" % json4sVersion,
    "commons-codec" % "commons-codec" % "1.15",
    "org.slf4j" % "slf4j-log4j12" % "2.0.9",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
    "org.scalatest" %% "scalatest" % "3.0.9" % "test",
    "org.mockito" % "mockito-all" % "1.10.19" % "test" // mockito for tests
  )
}