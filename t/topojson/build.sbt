organization := "org.scalablytyped.slinky"
name := "topojson"
version := "3.2-dt-20200515Z-1f1eb7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "geojson" % "7946.0-dt-20200515Z-762b9c",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "topojson-client" % "3.0-dt-20180414Z-b63ec1",
  "org.scalablytyped.slinky" %%% "topojson-simplify" % "3.0-dt-20180414Z-133d2e",
  "org.scalablytyped.slinky" %%% "topojson-specification" % "1.0-dt-20190213Z-e8fbca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
