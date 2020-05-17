organization := "org.scalablytyped.slinky"
name := "theme-ui"
version := "0.3-dt-20200320Z-9ea040"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-64368f",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-547fbc",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-e90d62",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-a53b44",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-7e1d98",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-36b705",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "styled-system" % "5.1-dt-20200309Z-10a332",
  "org.scalablytyped.slinky" %%% "styled-system__css" % "5.0-dt-20200331Z-1f41b5",
  "org.scalablytyped.slinky" %%% "theme-ui__components" % "0.2-dt-20200426Z-7314c8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
