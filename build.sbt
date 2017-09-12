lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := "koju",
      version := "0.1.0-SNAPSHOT",
      scalaVersion := "2.12.3"
    )),
    name := "nepse-data",
    libraryDependencies ++= {
      lazy val akkaHttpVersion = "10.0.10"

      Seq(
        "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,

        "org.json4s" %% "json4s-jackson" % "3.5.3",
        "de.heikoseeberger" %% "akka-http-json4s" % "1.18.0",

        "net.ruippeixotog" %% "scala-scraper" % "2.0.0",

        "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
        "org.scalatest" %% "scalatest" % "3.0.4" % Test
      )
    }
  )
