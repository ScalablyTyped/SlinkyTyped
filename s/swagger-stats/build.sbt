organization := "org.scalablytyped.slinky"
name := "swagger-stats"
version := "0.95-dt-20200925Z-3e11c1"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ajv" % "6.12.6-2e7610",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-288ac7",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20201002Z-8c61d7",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20201111Z-3019f6",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200921Z-5d68bc",
  "org.scalablytyped.slinky" %%% "fastify" % "3.8.0-b88842",
  "org.scalablytyped.slinky" %%% "fastify-error" % "0.2.0-3c3c9c",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "9.1.0-1d0df7",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20200925Z-ddb60e",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "20.0-dt-20201028Z-f587ef",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "6.0.0-869055",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20200925Z-916e85",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20201002Z-be0948",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20200925Z-4ad776",
  "org.scalablytyped.slinky" %%% "joi" % "17.3.0-11fb7b",
  "org.scalablytyped.slinky" %%% "light-my-request" % "4.3.0-ffd29c",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-6314e7",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-3991b7",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "prom-client" % "12.0.0-472be3",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20201002Z-ff6847",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20201002Z-f6189b",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20201117Z-ffbd1b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
