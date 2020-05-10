organization := "org.scalablytyped.slinky"
name := "swagger-node-runner"
version := "0.6-dt-20190212Z-98d079"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-e2128c",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20200226Z-149376",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20200226Z-fbce10",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20190219Z-ee5d11",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-196a23",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200409Z-5ef924",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200415Z-f286fc",
  "org.scalablytyped.slinky" %%% "formidable" % "1.0.16-dt-20200225Z-369fcb",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20200427Z-3f63ac",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20180214Z-cb44f4",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20200227Z-693408",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-46fc76",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-565e34",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20200330Z-ce7ed5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20200225Z-5cf00b",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200225Z-632c59",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-3e2563",
  "org.scalablytyped.slinky" %%% "restify" % "8.4-dt-20200225Z-639f8e",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-16be36",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20181002Z-91408a",
  "org.scalablytyped.slinky" %%% "spdy" % "3.4-dt-20200227Z-e030a4",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "swagger-schema-official" % "2.0-dt-20200314Z-dbd21f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
