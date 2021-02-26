organization := "org.scalablytyped.slinky"
name := "twilio-chat"
version := "4.0.0-597ef9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "loglevel" % "1.7.0-013013",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "twilio-mcs-client" % "0.3.3-9ab27d",
  "org.scalablytyped.slinky" %%% "twilio-notifications" % "0.5.11-1aabe4",
  "org.scalablytyped.slinky" %%% "twilio-sync" % "0.12.4-39bfc4",
  "org.scalablytyped.slinky" %%% "twilsock" % "0.5.14-6fd08c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
