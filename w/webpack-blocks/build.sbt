organization := "org.scalablytyped.slinky"
name := "webpack-blocks"
version := "2.0-dt-20200515Z-72616c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-92df5a",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.9-dt-20200706Z-001eb3",
  "org.scalablytyped.slinky" %%% "webpack-blocks__assets" % "2.0-dt-20200515Z-48d285",
  "org.scalablytyped.slinky" %%% "webpack-blocks__babel" % "2.0-dt-20200515Z-813933",
  "org.scalablytyped.slinky" %%% "webpack-blocks__core" % "2.0-dt-20200515Z-e68d83",
  "org.scalablytyped.slinky" %%% "webpack-blocks__dev-server" % "2.0-dt-20200515Z-8ec8bd",
  "org.scalablytyped.slinky" %%% "webpack-blocks__postcss" % "2.0-dt-20200515Z-b7f527",
  "org.scalablytyped.slinky" %%% "webpack-blocks__sass" % "2.0-dt-20200515Z-168c8f",
  "org.scalablytyped.slinky" %%% "webpack-blocks__typescript" % "2.0-dt-20200515Z-c8deaa",
  "org.scalablytyped.slinky" %%% "webpack-blocks__uglify" % "2.0-dt-20200515Z-5b3a05",
  "org.scalablytyped.slinky" %%% "webpack-blocks__webpack" % "2.0-dt-20200515Z-9c1333")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
