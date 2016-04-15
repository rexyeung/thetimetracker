name := """thetimetracker"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

lazy val myProject = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.18"
libraryDependencies += evolutions
libraryDependencies += "org.webjars" % "bootstrap" % "3.3.4"
libraryDependencies += "org.webjars" %% "webjars-play" % "2.4.0-1"

libraryDependencies += "org.testng" % "testng" % "6.8.8"
libraryDependencies += "de.johoop" % "sbt-testng-interface_2.10" % "3.0.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1"
libraryDependencies += "org.scalatestplus" %% "play" % "1.4.0-M4"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
