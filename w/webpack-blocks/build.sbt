organization := "org.scalablytyped.slinky"
name := "webpack-blocks"
version := "2.0-dt-20200925Z-a5d984"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-07892e",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.11-dt-20201027Z-116148",
  "org.scalablytyped.slinky" %%% "webpack-blocks__assets" % "2.0-dt-20200925Z-6862e9",
  "org.scalablytyped.slinky" %%% "webpack-blocks__babel" % "2.0-dt-20200925Z-a30340",
  "org.scalablytyped.slinky" %%% "webpack-blocks__core" % "2.0-dt-20200925Z-f0c898",
  "org.scalablytyped.slinky" %%% "webpack-blocks__dev-server" % "2.0-dt-20200925Z-be7f79",
  "org.scalablytyped.slinky" %%% "webpack-blocks__postcss" % "2.0-dt-20200925Z-a2fb11",
  "org.scalablytyped.slinky" %%% "webpack-blocks__sass" % "2.0-dt-20200925Z-ac9c6f",
  "org.scalablytyped.slinky" %%% "webpack-blocks__typescript" % "2.0-dt-20200925Z-e120e4",
  "org.scalablytyped.slinky" %%% "webpack-blocks__uglify" % "2.0-dt-20200925Z-c3cef1",
  "org.scalablytyped.slinky" %%% "webpack-blocks__webpack" % "2.0-dt-20200925Z-cd125a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
