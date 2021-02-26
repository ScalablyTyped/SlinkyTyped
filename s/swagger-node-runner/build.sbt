organization := "org.scalablytyped.slinky"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-be9896"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-a3cce0",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200923Z-e4eec6",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200515Z-f6bf3b",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20200515Z-47aea4",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20201002Z-671a3f",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20201111Z-1b328b",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200921Z-935502",
  "org.scalablytyped.slinky" %%% "formidable" % "1.0.16-dt-20201002Z-476d8e",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20201028Z-843f0c",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20200515Z-642e62",
  "org.scalablytyped.slinky" %%% "joi" % "17.3.0-876e70",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-25c5b2",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-ebf808",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20201002Z-07189b",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20201002Z-38a912",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20201002Z-9bc0d9",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20201002Z-d58f66",
  "org.scalablytyped.slinky" %%% "restify" % "8.4-dt-20201028Z-6259b0",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20201117Z-7353a1",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20200515Z-7b1525",
  "org.scalablytyped.slinky" %%% "spdy" % "3.4-dt-20200227Z-7086d7",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "swagger-schema-official" % "2.0-dt-20200515Z-ceeeea")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
