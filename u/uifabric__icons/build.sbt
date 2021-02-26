organization := "org.scalablytyped.slinky"
name := "uifabric__icons"
version := "7.5.17-f0f50a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "cheerio" % "v0.22.0-dt-20201002Z-37cf48",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-58bcb0",
  "org.scalablytyped.slinky" %%% "enzyme" % "3.10-dt-20201028Z-b23993",
  "org.scalablytyped.slinky" %%% "fluentui__dom-utilities" % "1.1.1-f54b85",
  "org.scalablytyped.slinky" %%% "fluentui__theme" % "1.7.0-17d6bd",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-931d77",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-9cde70",
  "org.scalablytyped.slinky" %%% "react-test-renderer" % "17.0-dt-20201120Z-88215f",
  "org.scalablytyped.slinky" %%% "sinon" % "9.0-dt-20201003Z-8fb0a4",
  "org.scalablytyped.slinky" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-bd2398",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "uifabric__merge-styles" % "7.19.1-2fb0f9",
  "org.scalablytyped.slinky" %%% "uifabric__styling" % "7.16.18-48e593",
  "org.scalablytyped.slinky" %%% "uifabric__utilities" % "7.33.2-c92753")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
