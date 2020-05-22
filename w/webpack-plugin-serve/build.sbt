organization := "org.scalablytyped.slinky"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-6480b8"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20200515Z-0c9e7d",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20200515Z-2c3c09",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-3172ef",
  "org.scalablytyped.slinky" %%% "braces" % "3.0-dt-20200515Z-195808",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200515Z-49be3e",
  "org.scalablytyped.slinky" %%% "connect-history-api-fallback" % "1.3-dt-20200515Z-bf8dfb",
  "org.scalablytyped.slinky" %%% "content-disposition" % "0.5-dt-20200515Z-66a37c",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-7cfb2f",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200515Z-35525e",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200515Z-f4fc10",
  "org.scalablytyped.slinky" %%% "fast-glob" % "2.2.7-386b01",
  "org.scalablytyped.slinky" %%% "http-proxy" % "1.17-dt-20200320Z-a10baa",
  "org.scalablytyped.slinky" %%% "http-proxy-middleware" % "0.19-dt-20200515Z-1e3814",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20200515Z-83b29b",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20200515Z-aa680a",
  "org.scalablytyped.slinky" %%% "koa-compress" % "v4.x-dt-20200515Z-ae2b8f",
  "org.scalablytyped.slinky" %%% "koa-send" % "4.1-dt-20200226Z-0d2274",
  "org.scalablytyped.slinky" %%% "koa-static" % "4.0-dt-20200515Z-beeada",
  "org.scalablytyped.slinky" %%% "micromatch" % "4.0-dt-20200515Z-9a1539",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200515Z-2900a9",
  "org.scalablytyped.slinky" %%% "mrmlnc__readdir-enhanced" % "2.2.1-ca6dbf",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-8e6135",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-0a4f98",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200519Z-85de9b",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20200515Z-c6cc21",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-ba4eed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200515Z-780548",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.9-dt-20200519Z-6f8d3e",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20200515Z-8e5d2e",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200515Z-96d9b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
