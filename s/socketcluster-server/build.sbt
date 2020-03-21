organization := "org.scalablytyped.slinky"
name := "socketcluster-server"
version := "15.0-dt-20200214Z-ef34bd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "async-stream-emitter" % "3.0-dt-20200205Z-57e036",
  "org.scalablytyped.slinky" %%% "consumable-stream" % "1.0-dt-20200205Z-7fc1af",
  "org.scalablytyped.slinky" %%% "jsonwebtoken" % "8.3-dt-20200228Z-b23aae",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "sc-auth" % "5.0-dt-20181130Z-1619f6",
  "org.scalablytyped.slinky" %%% "sc-errors" % "1.4-dt-20200205Z-33a753",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "stream-demux" % "7.0-dt-20200205Z-6362ab",
  "org.scalablytyped.slinky" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-4b8817",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200227Z-1a4b01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
