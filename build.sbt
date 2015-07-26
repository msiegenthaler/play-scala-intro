name := """play-scala-intro"""

version := "1.0.5"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

resolvers += "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "1.0.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "1.0.0",
  "com.h2database" % "h2" % "1.4.177",
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
  specs2 % Test
)     

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator


dockerExposedPorts in Docker := Seq(9000)

maintainer in Docker := "Mario Siegenthaler <ms@inventsoft.ch>"

dockerRepository := Some("msiegenthaler")

dockerUpdateLatest := true
