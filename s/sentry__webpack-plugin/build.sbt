organization := "org.scalablytyped.slinky"
name := "sentry__webpack-plugin"
version := "1.9-dt-20191011Z-0c0c71"
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
  "org.scalablytyped.slinky" %%% "webpack-sources" % "0.1-dt-20200323Z-21d450")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
