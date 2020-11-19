organization := "org.scalablytyped.slinky"
name := "topojson"
version := "3.2-dt-20200515Z-e1570c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20200515Z-638879",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "topojson-client" % "3.0-dt-20180414Z-30ead2",
  "org.scalablytyped.slinky" %%% "topojson-simplify" % "3.0-dt-20180414Z-638612",
  "org.scalablytyped.slinky" %%% "topojson-specification" % "1.0-dt-20190213Z-bfa5bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
