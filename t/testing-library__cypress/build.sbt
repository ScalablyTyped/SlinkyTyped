organization := "org.scalablytyped.slinky"
name := "testing-library__cypress"
version := "5.0-dt-20200203Z-d4e1ba"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "cypress" % "3.8.3-5d55cc",
  "org.scalablytyped.slinky" %%% "eventemitter2" % "5.0.1-69b2f2",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-ca8f54",
  "org.scalablytyped.slinky" %%% "pretty-format" % "24.9.0-4be6c7",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-615858",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "testing-library__dom" % "6.12-dt-20200210Z-f42b6a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
