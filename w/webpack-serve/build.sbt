organization := "org.scalablytyped.slinky"
name := "webpack-serve"
version := "2.0-dt-20200226Z-26f1fa"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "accepts" % "1.3-dt-20180214Z-e97526",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-0c158e",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.19-dt-20200210Z-e2128c",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20200226Z-196a23",
  "org.scalablytyped.slinky" %%% "content-disposition" % "0.5-dt-20200331Z-83c44d",
  "org.scalablytyped.slinky" %%% "cookies" % "0.7-dt-20191002Z-090613",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20200409Z-5ef924",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200415Z-f286fc",
  "org.scalablytyped.slinky" %%% "keygrip" % "1.0-dt-20191226Z-c1763d",
  "org.scalablytyped.slinky" %%% "koa" % "2.11.0-dt-20200327Z-24c1cd",
  "org.scalablytyped.slinky" %%% "loglevel" % "1.6.7-8053b5",
  "org.scalablytyped.slinky" %%% "memory-fs" % "0.3.0-dt-20200225Z-077546",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-46fc76",
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
  "org.scalablytyped.slinky" %%% "webpack-dev-middleware" % "3.7-dt-20200226Z-6f7e43",
  "org.scalablytyped.slinky" %%% "webpack-hot-client" % "4.1-dt-20200225Z-73c69e",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200323Z-0b1523",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200413Z-e5ad6b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
