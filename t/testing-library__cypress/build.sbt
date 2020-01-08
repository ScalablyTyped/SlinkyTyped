organization := "org.scalablytyped.slinky"
name := "testing-library__cypress"
version := "5.0-dt-20191024Z-2fee58"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "cypress" % "3.8.1-686b02",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-9323e2",
  "org.scalablytyped.slinky" %%% "pretty-format" % "24.9.0-496fef",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-dd2029",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "testing-library__dom" % "6.11-dt-20200102Z-aaa1f9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        