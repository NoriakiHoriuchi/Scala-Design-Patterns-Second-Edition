organization := "com.ivan.nikolov"

name := "real-life-applications-sbt"

scalaVersion := "2.12.17"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

javaOptions ++= Seq("-target", "1.8", "-source", "1.8")

publishMavenStyle := true

libraryDependencies ++= {
  val scalazVersion = "7.3.7"
  val scalacheckVersion = "1.17.0"
  Seq(
    "org.slf4j" % "slf4j-log4j12" % "2.0.7",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
    "org.scalaz" %% "scalaz-core" % scalazVersion,
    "org.scalaz" %% "scalaz-effect" % scalazVersion,
    "org.scalacheck" %% "scalacheck" % scalacheckVersion % "test",
    "org.scalaz" %% "scalaz-scalacheck-binding" % scalazVersion % "test",
    "org.scalatest" %% "scalatest" % "3.0.9" % "test",
    "org.mockito" % "mockito-all" % "1.10.19" % "test" // mockito for tests
  )
}