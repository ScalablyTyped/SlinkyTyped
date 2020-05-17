organization := "org.scalablytyped.slinky"
name := "socketcluster-client"
version := "15.1-dt-20200330Z-1a0b70"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ag-channel" % "4.0-dt-20200205Z-0cd300",
  "org.scalablytyped.slinky" %%% "ag-simple-broker" % "4.0-dt-20200205Z-66558d",
  "org.scalablytyped.slinky" %%% "async-stream-emitter" % "3.0-dt-20200205Z-b32fea",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-da1d91",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.3-dt-20200407Z-9cf225",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20200407Z-e3c167",
  "org.scalablytyped.slinky" %%% "sc-errors" % "1.4-dt-20200205Z-010701",
  "org.scalablytyped.slinky" %%% "socketcluster-server" % "15.0-dt-20200214Z-44ef7e",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200205Z-594f12",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-7144cf",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200413Z-ae451a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
