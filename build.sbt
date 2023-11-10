ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % "test"
libraryDependencies ++= Seq(
    "org.tpolecat" %% "doobie-core"      % "1.0.0-RC4",
    "org.tpolecat" %% "doobie-hikari" % "1.0.0-RC4",
    "org.tpolecat" %% "doobie-h2"        % "1.0.0-RC4",         // H2 driver 1.4.200 + type mappings.
    "com.h2database" % "h2" % "2.1.214",
    "org.typelevel" %% "cats-effect" % "3.5.2"
)



lazy val root = (project in file("."))
  .settings(
      name := "webapp-scala-tutorial"
  )
