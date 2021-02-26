organization := "org.scalablytyped.slinky"
name := "webpack-blocks"
version := "2.0-dt-20200925Z-29336e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-09416f",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.11-dt-20201027Z-a0d11f",
  "org.scalablytyped.slinky" %%% "webpack-blocks__assets" % "2.0-dt-20200925Z-3e29f6",
  "org.scalablytyped.slinky" %%% "webpack-blocks__babel" % "2.0-dt-20200925Z-ddc579",
  "org.scalablytyped.slinky" %%% "webpack-blocks__core" % "2.0-dt-20200925Z-edc1a9",
  "org.scalablytyped.slinky" %%% "webpack-blocks__dev-server" % "2.0-dt-20200925Z-64abc3",
  "org.scalablytyped.slinky" %%% "webpack-blocks__postcss" % "2.0-dt-20200925Z-630f51",
  "org.scalablytyped.slinky" %%% "webpack-blocks__sass" % "2.0-dt-20200925Z-747847",
  "org.scalablytyped.slinky" %%% "webpack-blocks__typescript" % "2.0-dt-20200925Z-39a717",
  "org.scalablytyped.slinky" %%% "webpack-blocks__uglify" % "2.0-dt-20200925Z-3f2dff",
  "org.scalablytyped.slinky" %%% "webpack-blocks__webpack" % "2.0-dt-20200925Z-cb7081")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
