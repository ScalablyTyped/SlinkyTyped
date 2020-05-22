organization := "org.scalablytyped.slinky"
name := "theme-ui"
version := "0.3-dt-20200513Z-fe9287"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-ac76b9",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-3f1951",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-c7035e",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-28e060",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "styled-system" % "5.1-dt-20200309Z-b5e89a",
  "org.scalablytyped.slinky" %%% "styled-system__css" % "5.0-dt-20200515Z-2d60c0",
  "org.scalablytyped.slinky" %%% "theme-ui__components" % "0.2-dt-20200515Z-7da0dd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
