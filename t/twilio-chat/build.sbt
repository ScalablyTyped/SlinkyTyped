organization := "org.scalablytyped.slinky"
name := "twilio-chat"
version := "3.3.4-913310"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "loglevel" % "1.6.7-c67505",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "twilio-mcs-client" % "0.3.3-f47e3c",
  "org.scalablytyped.slinky" %%% "twilio-notifications" % "0.5.8-cd5360",
  "org.scalablytyped.slinky" %%% "twilio-sync" % "0.11.5-ee7e57",
  "org.scalablytyped.slinky" %%% "twilsock" % "0.5.11-75f609")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
