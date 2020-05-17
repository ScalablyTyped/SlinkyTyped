organization := "org.scalablytyped.slinky"
name := "swagger-stats"
version := "0.95-dt-20200211Z-c70870"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-ef676c",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-fe7436",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200409Z-223215",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200415Z-cfdf0c",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "9.1.0-a6c5ac",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20190521Z-696f50",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "19.0-dt-20200427Z-fd06b1",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "6.0.0-90a4b2",
  "org.scalablytyped.slinky" %%% "hapi__joi" % "16.0-dt-20200225Z-651f20",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20200424Z-7b4869",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20200225Z-1f7131",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20190404Z-27b5fd",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-d94a1a",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-b0f594",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "prom-client" % "11.5.3-3439cf",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200225Z-413bcb",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-34f923",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-51c95d",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
