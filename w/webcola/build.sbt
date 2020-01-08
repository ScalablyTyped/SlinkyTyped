organization := "org.scalablytyped.slinky"
name := "webcola"
version := "3.4.0-ce6d6a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20190212Z-473d3c",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20190212Z-cad6f2",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20190710Z-e8dbdc",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20190212Z-38e570",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        