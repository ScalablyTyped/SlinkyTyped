organization := "org.scalablytyped.slinky"
name := "swagger-stats"
version := "0.95-dt-20200708Z-b097a1"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-e4419c",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-41abee",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200706Z-a5f9b2",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200722Z-5cbccc",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "9.1.0-758312",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20190521Z-295fd8",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "19.0-dt-20200722Z-a49bfa",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "6.0.0-de150e",
  "org.scalablytyped.slinky" %%% "hapi__joi" % "17.1-dt-20200710Z-32b2ec",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20200424Z-14f7b0",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20200515Z-406789",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20190404Z-47ef55",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-600803",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-f64a1e",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "prom-client" % "11.5.3-9ae0eb",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-524837",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-18f701",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-04f03f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
