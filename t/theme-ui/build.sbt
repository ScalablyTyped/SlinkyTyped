organization := "org.scalablytyped.slinky"
name := "theme-ui"
version := "0.3-dt-20200320Z-f6234b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-fa3762",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-9c2bbf",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-60374b",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-78dae8",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-06b749",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-24495c",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-47fb9f",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "styled-system" % "5.1-dt-20200309Z-9fdf6d",
  "org.scalablytyped.slinky" %%% "styled-system__css" % "5.0-dt-20200331Z-375c74",
  "org.scalablytyped.slinky" %%% "theme-ui__components" % "0.2-dt-20200426Z-593020")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
