organization := "org.scalablytyped.slinky"
name := "twilio-chat"
version := "4.0.0-e62591"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "loglevel" % "1.7.0-f12b84",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "twilio-mcs-client" % "0.3.3-35cd9d",
  "org.scalablytyped.slinky" %%% "twilio-notifications" % "0.5.11-672d45",
  "org.scalablytyped.slinky" %%% "twilio-sync" % "0.12.4-33e109",
  "org.scalablytyped.slinky" %%% "twilsock" % "0.5.14-860cbe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
