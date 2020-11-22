organization := "org.scalablytyped.slinky"
name := "wordpress__plugins"
version := "2.3-dt-20200925Z-868490"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-23cf0c",
  "org.scalablytyped.slinky" %%% "downshift" % "6.0.6-e9fb4d",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ed7fbd",
  "org.scalablytyped.slinky" %%% "re-resizable" % "6.6.1-3222c6",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-8f0b52",
  "org.scalablytyped.slinky" %%% "react-dom" % "17.0-dt-20201120Z-bfdd50",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "tinycolor2" % "1.4-dt-20201002Z-3daba5",
  "org.scalablytyped.slinky" %%% "wordpress__components" % "9.8-dt-20201104Z-be9860",
  "org.scalablytyped.slinky" %%% "wordpress__element" % "2.18.0-32ba50",
  "org.scalablytyped.slinky" %%% "wordpress__notices" % "1.5-dt-20200925Z-a3abe0",
  "org.scalablytyped.slinky" %%% "wordpress__rich-text" % "3.4-dt-20200925Z-39f6cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
