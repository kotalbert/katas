ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion :="3.1.0"

lazy val root = (project in file("."))
  .settings(
    name := "katas",
    idePackagePrefix := Some("codewars")
  )

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.15"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"

resolvers += "Artima Maven Repository" at "https://repo.artima.com/releases"
