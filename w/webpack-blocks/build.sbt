organization := "org.scalablytyped.slinky"
name := "webpack-blocks"
version := "2.0-dt-20200515Z-f59fe5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-fe56c3",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.9-dt-20200706Z-1102cf",
  "org.scalablytyped.slinky" %%% "webpack-blocks__assets" % "2.0-dt-20200515Z-79c21f",
  "org.scalablytyped.slinky" %%% "webpack-blocks__babel" % "2.0-dt-20200515Z-b32f9c",
  "org.scalablytyped.slinky" %%% "webpack-blocks__core" % "2.0-dt-20200515Z-b87fb8",
  "org.scalablytyped.slinky" %%% "webpack-blocks__dev-server" % "2.0-dt-20200515Z-ece72d",
  "org.scalablytyped.slinky" %%% "webpack-blocks__postcss" % "2.0-dt-20200515Z-ef08f3",
  "org.scalablytyped.slinky" %%% "webpack-blocks__sass" % "2.0-dt-20200515Z-8b0947",
  "org.scalablytyped.slinky" %%% "webpack-blocks__typescript" % "2.0-dt-20200515Z-d6c83f",
  "org.scalablytyped.slinky" %%% "webpack-blocks__uglify" % "2.0-dt-20200515Z-c4bc44",
  "org.scalablytyped.slinky" %%% "webpack-blocks__webpack" % "2.0-dt-20200515Z-bc2212")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
