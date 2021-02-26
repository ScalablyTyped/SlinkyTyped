organization := "org.scalablytyped.slinky"
name := "wordpress__components"
version := "9.8-dt-20201104Z-39439c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-58bcb0",
  "org.scalablytyped.slinky" %%% "downshift" % "6.0.6-1e74f8",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-931d77",
  "org.scalablytyped.slinky" %%% "re-resizable" % "6.6.1-12e6f1",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-9cde70",
  "org.scalablytyped.slinky" %%% "react-dom" % "17.0-dt-20201120Z-891d84",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "tinycolor2" % "1.4-dt-20201002Z-655071",
  "org.scalablytyped.slinky" %%% "wordpress__element" % "2.18.0-bc06fb",
  "org.scalablytyped.slinky" %%% "wordpress__notices" % "1.5-dt-20200925Z-f70d64",
  "org.scalablytyped.slinky" %%% "wordpress__rich-text" % "3.4-dt-20200925Z-1f495f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
