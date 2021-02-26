organization := "org.scalablytyped.slinky"
name := "swagger-stats"
version := "0.95-dt-20200925Z-2c3599"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ajv" % "6.12.6-d07378",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-a3cce0",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20201002Z-671a3f",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20201111Z-1b328b",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200921Z-935502",
  "org.scalablytyped.slinky" %%% "fastify" % "3.8.0-639d61",
  "org.scalablytyped.slinky" %%% "fastify-error" % "0.2.0-909897",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "9.1.0-ce42f2",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20200925Z-6746dd",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "20.0-dt-20201028Z-3adc1b",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "6.0.0-58c143",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20200925Z-db6434",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20201002Z-05305b",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20200925Z-e6a54b",
  "org.scalablytyped.slinky" %%% "joi" % "17.3.0-876e70",
  "org.scalablytyped.slinky" %%% "light-my-request" % "4.3.0-fc5941",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-25c5b2",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-ebf808",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "prom-client" % "12.0.0-e140d5",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20201002Z-9bc0d9",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20201002Z-d58f66",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20201117Z-7353a1",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
