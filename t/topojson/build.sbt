organization := "org.scalablytyped.slinky"
name := "topojson"
version := "3.2-dt-20190717Z-95a1d6"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20190925Z-114ee8",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "topojson-client" % "3.0-dt-20180414Z-b013d8",
  "org.scalablytyped.slinky" %%% "topojson-simplify" % "3.0-dt-20180414Z-2a45b7",
  "org.scalablytyped.slinky" %%% "topojson-specification" % "1.0-dt-20190213Z-1edd6f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
