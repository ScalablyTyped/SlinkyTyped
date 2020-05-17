organization := "org.scalablytyped.slinky"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-2036c3"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20180214Z-c9a3c6",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-69059c",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-ef676c",
  "org.scalablytyped.slinky" %%% "braces" % "3.0-dt-20190422Z-a9ce38",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-fe7436",
  "org.scalablytyped.slinky" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-22c509",
  "org.scalablytyped.slinky" %%% "content-disposition" % "0.5-dt-20200331Z-9e7955",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-12c299",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200409Z-223215",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200415Z-cfdf0c",
  "org.scalablytyped.slinky" %%% "fast-glob" % "2.2.7-1c0a13",
  "org.scalablytyped.slinky" %%% "http-proxy" % "1.17-dt-20200320Z-188def",
  "org.scalablytyped.slinky" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-e23a7f",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20191226Z-6b91f5",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20200327Z-8ac877",
  "org.scalablytyped.slinky" %%% "koa-compress" % "v2.x-dt-20200226Z-010f58",
  "org.scalablytyped.slinky" %%% "koa-send" % "4.1-dt-20200226Z-86a6a1",
  "org.scalablytyped.slinky" %%% "koa-static" % "4.0-dt-20200226Z-61a177",
  "org.scalablytyped.slinky" %%% "micromatch" % "4.0-dt-20200226Z-cd7169",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-d94a1a",
  "org.scalablytyped.slinky" %%% "mrmlnc__readdir-enhanced" % "2.2.1-fade7f",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200225Z-413bcb",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-34f923",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-51c95d",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20200225Z-3feb4d",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-53abfb",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200225Z-750916",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.9-dt-20200413Z-c67f3d",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20200418Z-852cfb",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200323Z-21d450")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
