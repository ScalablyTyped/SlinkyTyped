organization := "org.scalablytyped.slinky"
name := "swagger-stats"
version := "0.95-dt-20200211Z-16ccb5"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-3172ef",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-49be3e",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200515Z-35525e",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200515Z-f4fc10",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "9.1.0-cb6024",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20190521Z-63f228",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "19.0-dt-20200515Z-af82c7",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "6.0.0-48f0ca",
  "org.scalablytyped.slinky" %%% "hapi__joi" % "17.1-dt-20200505Z-fc5d6b",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20200424Z-d72697",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20200515Z-328c12",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20190404Z-a5fc9f",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200515Z-2900a9",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-0a8c94",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "prom-client" % "11.5.3-6117c3",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-8e6135",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-0a4f98",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-85de9b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
