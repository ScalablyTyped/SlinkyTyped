organization := "org.scalablytyped.slinky"
name := "testing-library__cypress"
version := "5.0-dt-20191024Z-871de5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "cypress" % "3.6.1-44d825",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-b0f930",
  "org.scalablytyped.slinky" %%% "pretty-format" % "24.9.0-35a608",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-c4cdb0",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "testing-library__dom" % "6.10-dt-20191101Z-9d6058")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        