organization := "org.scalablytyped.slinky"
name := "webpack-dev-server"
version := "3.10-dt-20200227Z-30f712"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-015d8e",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-ed4596",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-b2d5a0",
  "org.scalablytyped.slinky" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-07d730",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200227Z-17932f",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200225Z-62466e",
  "org.scalablytyped.slinky" %%% "http-proxy" % "1.17-dt-20200226Z-99f43f",
  "org.scalablytyped.slinky" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-2a0a88",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-e728ff",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-6f090d",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-3c94e9",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20200225Z-ebe192",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-63359b",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200225Z-a8b959",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.0-dt-20200225Z-ae4d9a",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20200227Z-6dbb07",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200225Z-2c39c2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
