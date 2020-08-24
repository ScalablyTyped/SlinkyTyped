organization := "org.scalablytyped.slinky"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-c99d62"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-b686e3",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200515Z-5e1790",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200515Z-f14ab9",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20200515Z-b3bbee",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-46705a",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200706Z-e24f67",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200722Z-f4d568",
  "org.scalablytyped.slinky" %%% "formidable" % "1.0.16-dt-20200522Z-476e06",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20200721Z-3e84d1",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20200515Z-2445af",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20200515Z-c70c1b",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-cba958",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-0b33f9",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20200515Z-6c0184",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20200515Z-ba41fb",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-7e078d",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-d7b143",
  "org.scalablytyped.slinky" %%% "restify" % "8.4-dt-20200515Z-c2ad44",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-0a0205",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20200515Z-fc564d",
  "org.scalablytyped.slinky" %%% "spdy" % "3.4-dt-20200227Z-37dd3d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "swagger-node-runner" % "0.6-dt-20190212Z-029f46",
  "org.scalablytyped.slinky" %%% "swagger-schema-official" % "2.0-dt-20200515Z-ec738b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
