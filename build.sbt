name := "Giskard"

version := "0.1"

scalaVersion := "3.0.0"

organization := "A.S.I.M.o.V."

val AkkaVersion = "2.6.13"
val AkkaHttpVersion = "10.2.4"

lazy val exportedGiskard = (project in file("."))

lazy val giskard = (project in file("."))
  .settings(
    name := "Giskard"
  )

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-swing" % "3.0.0",
)