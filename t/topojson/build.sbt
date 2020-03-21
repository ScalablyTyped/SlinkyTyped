organization := "org.scalablytyped.slinky"
name := "topojson"
version := "3.2-dt-20190717Z-6a574d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20190925Z-b49dde",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "topojson-client" % "3.0-dt-20180414Z-99f6ba",
  "org.scalablytyped.slinky" %%% "topojson-simplify" % "3.0-dt-20180414Z-7021c9",
  "org.scalablytyped.slinky" %%% "topojson-specification" % "1.0-dt-20190213Z-a776b9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
