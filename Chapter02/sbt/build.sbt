organization := "com.ivan.nikolov"

name := "traits-sbt"

scalaVersion := "2.12.17"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

javaOptions ++= Seq("-target", "1.8", "-source", "1.8")

publishMavenStyle := true

libraryDependencies ++= {
  Seq(
    "org.scalatest" %% "scalatest" % "3.0.9" % "test",
    "org.mockito" % "mockito-all" % "1.10.19" % "test" // mockito for tests
  )
}