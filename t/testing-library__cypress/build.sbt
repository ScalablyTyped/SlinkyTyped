organization := "org.scalablytyped.slinky"
name := "testing-library__cypress"
version := "5.0-dt-20200401Z-63236a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cypress" % "3.8.3-179e33",
  "org.scalablytyped.slinky" %%% "eventemitter2" % "5.0.1-6faa28",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-e19481",
  "org.scalablytyped.slinky" %%% "pretty-format" % "24.9.0-e411e6",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-61c165",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "testing-library__dom" % "7.0-dt-20200423Z-3e2bf6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
