organization := "org.scalablytyped.slinky"
name := "webpack-plugin-serve"
version := "0.10-dt-20190506Z-5cf5b5"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20180214Z-e97526",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-0c158e",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-e2128c",
  "org.scalablytyped.slinky" %%% "braces" % "3.0-dt-20190422Z-beae0f",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-196a23",
  "org.scalablytyped.slinky" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-f37102",
  "org.scalablytyped.slinky" %%% "content-disposition" % "0.5-dt-20200331Z-83c44d",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-090613",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200409Z-5ef924",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200415Z-f286fc",
  "org.scalablytyped.slinky" %%% "fast-glob" % "2.2.7-e3c1ce",
  "org.scalablytyped.slinky" %%% "http-proxy" % "1.17-dt-20200320Z-06fe3f",
  "org.scalablytyped.slinky" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-57cdc7",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20191226Z-c1763d",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20200327Z-24c1cd",
  "org.scalablytyped.slinky" %%% "koa-compress" % "v2.x-dt-20200226Z-a13291",
  "org.scalablytyped.slinky" %%% "koa-send" % "4.1-dt-20200226Z-08adcb",
  "org.scalablytyped.slinky" %%% "koa-static" % "4.0-dt-20200226Z-3f1eec",
  "org.scalablytyped.slinky" %%% "micromatch" % "4.0-dt-20200226Z-8f5ffe",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-46fc76",
  "org.scalablytyped.slinky" %%% "mrmlnc__readdir-enhanced" % "2.2.1-458279",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200225Z-632c59",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-3e2563",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20200227Z-16be36",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20200225Z-780bcc",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-cd3c83",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200225Z-9a5280",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.9-dt-20200413Z-a34c26",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20200418Z-5d7c48",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200323Z-0b1523")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
