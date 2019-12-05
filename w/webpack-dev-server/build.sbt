organization := "org.scalablytyped.slinky"
name := "webpack-dev-server"
version := "3.9-dt-20191127Z-b6ee77"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-13b4ff",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.17-dt-20190819Z-0fbf69",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20190322Z-7f9ff6",
  "org.scalablytyped.slinky" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-49c49c",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20191101Z-99b8ef",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20191115Z-6e0a7c",
  "org.scalablytyped.slinky" %%% "http-proxy" % "1.17-dt-20191115Z-7863ab",
  "org.scalablytyped.slinky" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-445856",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-568141",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-aa5088",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20190819Z-98e334",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20190322Z-c233b8",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-49b491",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20190322Z-121f9c",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.0-dt-20181015Z-9f6b47",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20191116Z-43eefe",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20180625Z-314135")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        