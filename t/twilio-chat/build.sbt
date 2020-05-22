organization := "org.scalablytyped.slinky"
name := "twilio-chat"
version := "3.3.7-080514"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "loglevel" % "1.6.8-d4877d",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "twilio-mcs-client" % "0.3.3-a1a0df",
  "org.scalablytyped.slinky" %%% "twilio-notifications" % "0.5.9-d57f64",
  "org.scalablytyped.slinky" %%% "twilio-sync" % "0.12.2-4a3316",
  "org.scalablytyped.slinky" %%% "twilsock" % "0.5.12-b5f5ed")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
