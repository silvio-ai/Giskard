name := "Giskard"

version := "0.1"

scalaVersion := "2.12.12"

organization := "com.asimov"

val AkkaVersion = "2.6.13"
val AkkaHttpVersion = "10.2.4"

lazy val exportedGiskard = (project in file("."))

lazy val giskard = (project in file("."))
  .settings(
    name := "Giskard"
  )

libraryDependencies ++= Seq(

)