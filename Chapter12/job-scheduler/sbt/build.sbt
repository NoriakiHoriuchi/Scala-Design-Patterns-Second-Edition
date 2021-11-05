organization := "com.ivan.nikolov"

name := "job-scheduler-sbt"

scalaVersion := "2.12.15"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

javaOptions ++= Seq("-target", "1.8", "-source", "1.8")

publishMavenStyle := true

libraryDependencies ++= {
  val akkaVersion = "2.6.16"
  val typesafeConfigVersion = "1.4.1"
  val json4sVersion = "3.6.12"
  Seq(
    "org.slf4j" % "slf4j-log4j12" % "1.7.32",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",
    "com.typesafe" % "config" % typesafeConfigVersion,
    "org.json4s" %% "json4s-native" % json4sVersion,
    "org.json4s" %% "json4s-jackson" % json4sVersion,
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.h2database" % "h2" % "1.4.197",
    "org.scalatest" %% "scalatest" % "3.0.9" % "test",
    "org.mockito" % "mockito-all" % "1.10.19" % "test" // mockito for tests
  )
}