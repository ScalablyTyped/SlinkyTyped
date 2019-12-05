organization := "org.scalablytyped.slinky"
name := "twilio-chat"
version := "3.3.3-c4910e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "loglevel" % "1.6.6-b84837",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "twilio-mcs-client" % "0.3.1-e01c43",
  "org.scalablytyped.slinky" %%% "twilio-notifications" % "0.5.8-362d1b",
  "org.scalablytyped.slinky" %%% "twilio-sync" % "0.11.5-970678",
  "org.scalablytyped.slinky" %%% "twilsock" % "0.5.11-c28bca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        