organization := "org.scalablytyped.slinky"
name := "webpack-blocks__webpack"
version := "2.0-dt-20200515Z-711895"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20200515Z-2c3c09",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20200515Z-c6cc21",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-ba4eed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200515Z-780548",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.9-dt-20200519Z-6f8d3e",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20200515Z-8e5d2e",
  "org.scalablytyped.slinky" %%% "webpack-blocks__core" % "2.0-dt-20200515Z-f30b17",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200515Z-96d9b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
