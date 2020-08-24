organization := "org.scalablytyped.slinky"
name := "tgfancy"
version := "0.13-dt-20180822Z-4ee21b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20200515Z-ea521b",
  "org.scalablytyped.slinky" %%% "form-data" % "3.0.0-cbc882",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "node-telegram-bot-api" % "0.50-dt-20200714Z-eeadfe",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20200515Z-25c97e",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20200515Z-0b128d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
