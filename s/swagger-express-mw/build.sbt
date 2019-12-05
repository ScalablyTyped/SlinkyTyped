organization := "org.scalablytyped.slinky"
name := "swagger-express-mw"
version := "0.7-dt-20181022Z-f2f5af"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "body-parser" % "1.17-dt-20190819Z-0fbf69",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20190805Z-112e20",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20190311Z-16188b",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20190219Z-865fe7",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20190322Z-7f9ff6",
  "org.scalablytyped.slinky" %%% "express" % "4.17-dt-20191101Z-99b8ef",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20191115Z-6e0a7c",
  "org.scalablytyped.slinky" %%% "formidable" % "1.0.16-dt-20190322Z-adf2a7",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20191115Z-6a457d",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20180214Z-94b91c",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20191101Z-bdcee5",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20191126Z-568141",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.27-dt-20190322Z-7b6e37",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20190322Z-fae497",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20190322Z-c87bd3",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-aa5088",
  "org.scalablytyped.slinky" %%% "restify" % "8.4-dt-20191119Z-f7e9b1",
  "org.scalablytyped.slinky" %%% "serve-static" % "1.13-dt-20190819Z-98e334",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20181002Z-afb9f2",
  "org.scalablytyped.slinky" %%% "spdy" % "3.4-dt-20181121Z-dc4477",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "swagger-node-runner" % "0.6-dt-20190212Z-518822",
  "org.scalablytyped.slinky" %%% "swagger-schema-official" % "2.0-dt-20191107Z-0d407b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        