organization := "org.scalablytyped.slinky"
name := "splunk-bunyan-logger"
version := "0.9-dt-20180705Z-d03e44"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200515Z-965f7d",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20200515Z-da01e2",
  "org.scalablytyped.slinky" %%% "form-data" % "3.0.0-ee7e6b",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20200515Z-8a4c09",
  "org.scalablytyped.slinky" %%% "splunk-logging" % "0.9-dt-20180705Z-0dfc83",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20201002Z-9a7324")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
