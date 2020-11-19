organization := "org.scalablytyped.slinky"
name := "twilio-chat"
version := "4.0.0-756beb"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "loglevel" % "1.6.8-f97ad1",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "twilio-mcs-client" % "0.3.3-dd7f56",
  "org.scalablytyped.slinky" %%% "twilio-notifications" % "0.5.9-b05d24",
  "org.scalablytyped.slinky" %%% "twilio-sync" % "0.12.2-f1add2",
  "org.scalablytyped.slinky" %%% "twilsock" % "0.5.12-a6f666")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
