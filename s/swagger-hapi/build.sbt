organization := "org.scalablytyped.slinky"
name := "swagger-hapi"
version := "0.7-dt-20181022Z-accb62"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-288ac7",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200923Z-824024",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200515Z-965f7d",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20200515Z-40bb00",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20201002Z-8c61d7",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20201111Z-3019f6",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200921Z-5d68bc",
  "org.scalablytyped.slinky" %%% "formidable" % "1.0.16-dt-20201002Z-ab8f12",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20201028Z-cc997c",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20200515Z-3a2039",
  "org.scalablytyped.slinky" %%% "joi" % "17.3.0-11fb7b",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-6314e7",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-3991b7",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20201002Z-0b036b",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20201002Z-c5a256",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20201002Z-ff6847",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20201002Z-f6189b",
  "org.scalablytyped.slinky" %%% "restify" % "8.4-dt-20201028Z-0edbc4",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20201117Z-ffbd1b",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20200515Z-7443ca",
  "org.scalablytyped.slinky" %%% "spdy" % "3.4-dt-20200227Z-0333b9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "swagger-node-runner" % "0.6-dt-20190212Z-0692bf",
  "org.scalablytyped.slinky" %%% "swagger-schema-official" % "2.0-dt-20200515Z-78bfd4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
