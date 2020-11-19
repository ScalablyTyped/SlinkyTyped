organization := "org.scalablytyped.slinky"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-57a127"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-e4419c",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200515Z-0097ad",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200515Z-8d44c2",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20200515Z-b076ab",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-41abee",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200706Z-a5f9b2",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200722Z-5cbccc",
  "org.scalablytyped.slinky" %%% "formidable" % "1.0.16-dt-20200522Z-31765b",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20200721Z-6303f1",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20200515Z-8267c1",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20200515Z-7e47dd",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200722Z-600803",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-f64a1e",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20200515Z-7f1d66",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20200515Z-f38265",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-524837",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-18f701",
  "org.scalablytyped.slinky" %%% "restify" % "8.4-dt-20200515Z-875bc2",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-04f03f",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20200515Z-fdb566",
  "org.scalablytyped.slinky" %%% "spdy" % "3.4-dt-20200227Z-90826f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "swagger-node-runner" % "0.6-dt-20190212Z-6a9dae",
  "org.scalablytyped.slinky" %%% "swagger-schema-official" % "2.0-dt-20200515Z-23a1da")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
