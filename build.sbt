enablePlugins(ScalaJSPlugin)

name := "JSTest"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions := Seq("-deprecation", "-feature")

resolvers += sbt.Resolver.bintrayRepo("denigma", "denigma-releases") //add resolver

libraryDependencies += "org.denigma" %%% "threejs-facade" % "0.0.74-0.1.7"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.1" % "test"

jsDependencies += "org.webjars.bower" % "three.js" % "0.74.0" / "three.js" minified "three.min.js"

//skip in packageJSDependencies := false

persistLauncher in Compile := true

persistLauncher in Test := false