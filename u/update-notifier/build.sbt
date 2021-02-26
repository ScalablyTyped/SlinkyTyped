organization := "org.scalablytyped.slinky"
name := "update-notifier"
version := "5.0-dt-20200930Z-ace08b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "boxen" % "4.2.0-c29812",
  "org.scalablytyped.slinky" %%% "cli-boxes" % "2.2.1-909e5b",
  "org.scalablytyped.slinky" %%% "configstore" % "4.0-dt-20200515Z-17c8ea",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "type-fest" % "0.8.1-07bb63")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
