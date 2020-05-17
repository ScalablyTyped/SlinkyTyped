organization := "org.scalablytyped.slinky"
name := "webpack-blocks"
version := "2.0-dt-20191016Z-68b552"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "anymatch" % "1.3-dt-20190212Z-69059c",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "source-list-map" % "v0.1.6-dt-20200225Z-3feb4d",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-53abfb",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200225Z-750916",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.9-dt-20200413Z-c67f3d",
  "org.scalablytyped.slinky" %%% "webpack" % "4.41-dt-20200418Z-852cfb",
  "org.scalablytyped.slinky" %%% "webpack-blocks__assets" % "2.0-dt-20191016Z-b06263",
  "org.scalablytyped.slinky" %%% "webpack-blocks__babel" % "2.0-dt-20191016Z-40b31b",
  "org.scalablytyped.slinky" %%% "webpack-blocks__core" % "2.0-dt-20191016Z-f35084",
  "org.scalablytyped.slinky" %%% "webpack-blocks__dev-server" % "2.0-dt-20191016Z-a629c9",
  "org.scalablytyped.slinky" %%% "webpack-blocks__postcss" % "2.0-dt-20191016Z-88d37f",
  "org.scalablytyped.slinky" %%% "webpack-blocks__sass" % "2.0-dt-20191016Z-8aacb6",
  "org.scalablytyped.slinky" %%% "webpack-blocks__typescript" % "2.0-dt-20191016Z-83ea5c",
  "org.scalablytyped.slinky" %%% "webpack-blocks__uglify" % "2.0-dt-20191016Z-fc2a05",
  "org.scalablytyped.slinky" %%% "webpack-blocks__webpack" % "2.0-dt-20191016Z-5aff27",
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200323Z-21d450")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
