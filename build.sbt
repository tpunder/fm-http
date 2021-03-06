FMPublic

name := "fm-http"

description := "Async Http Client & Server for Scala"

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.11.11", "2.12.4")

scalacOptions := Seq(
  "-unchecked",
  "-deprecation",
  "-language:implicitConversions",
  "-feature",
  "-Xlint",
  "-Ywarn-unused-import"
) ++ (if (scalaVersion.value.startsWith("2.12")) Seq(
  // Scala 2.12 specific compiler flags
  "-opt:l:inline",
  "-opt-inline-from:<sources>"
) else Nil)

libraryDependencies ++= Seq(
  "com.frugalmechanic" %% "scala-optparse" % "1.1.2",
  "com.frugalmechanic" %% "fm-common" % "0.16.0",
  "com.frugalmechanic" %% "fm-lazyseq" % "0.8.0" % "test"
)

libraryDependencies ++= Seq(
  "io.netty" % "netty-all" % "4.0.53.Final",
  "com.jcraft" % "jzlib" % "1.1.3", // For Netty 4.X
  "com.github.jnr" % "jnr-posix" % "3.0.42", // POSIX Support (getpid and setssid) for the HttpServerApp
  "org.slf4j" % "slf4j-api" % "1.7.25",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "javax.mail" % "mail" % "1.4.1",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)
