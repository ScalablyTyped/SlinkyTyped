organization := "org.scalablytyped.slinky"
name := "swagger-hapi"
version := "0.7-dt-20181022Z-883a5d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-ef676c",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200226Z-9bc6cb",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200226Z-1deb17",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20190219Z-6df910",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-fe7436",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200409Z-223215",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200415Z-cfdf0c",
  "org.scalablytyped.slinky" %%% "formidable" % "1.0.16-dt-20200225Z-c07e28",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20200427Z-dbd1c9",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20180214Z-2b9b4c",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20200227Z-04761c",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-d94a1a",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-b0f594",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20200330Z-c9e8fe",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20200225Z-1e929f",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200225Z-413bcb",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-34f923",
  "org.scalablytyped.slinky" %%% "restify" % "8.4-dt-20200225Z-5f2f33",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-51c95d",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20181002Z-02c7ec",
  "org.scalablytyped.slinky" %%% "spdy" % "3.4-dt-20200227Z-6486db",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "swagger-node-runner" % "0.6-dt-20190212Z-65ef52",
  "org.scalablytyped.slinky" %%% "swagger-schema-official" % "2.0-dt-20200314Z-44ba79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
