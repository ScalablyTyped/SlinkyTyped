organization := "org.scalablytyped.slinky"
name := "theme-ui__components"
version := "0.2-dt-20191226Z-77e5f0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-f22bc8",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-4620f5",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-dac661",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-006b9c",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-9c10de",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1d231d",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191220Z-f02704",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "styled-system" % "5.1-dt-20191118Z-ca3bcb",
  "org.scalablytyped.slinky" %%% "styled-system__css" % "5.0-dt-20191115Z-21ce97",
  "org.scalablytyped.slinky" %%% "theme-ui" % "0.2-dt-20191213Z-b150b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        