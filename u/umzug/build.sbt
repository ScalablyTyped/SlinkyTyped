organization := "org.scalablytyped.slinky"
name := "umzug"
version := "v2.2.0-dt-20200227Z-e027c4"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20200302Z-44c437",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20200319Z-cb58b3",
  "org.scalablytyped.slinky" %%% "continuation-local-storage" % "3.2-dt-20200225Z-ffcff4",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20200417Z-5a7e1e",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.5-dt-20200426Z-daa38b",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "sequelize" % "4.28.0-dt-20200225Z-318325",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "validator" % "13.0-dt-20200407Z-dee531")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
