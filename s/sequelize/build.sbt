organization := "org.scalablytyped.slinky"
name := "sequelize"
version := "4.28.0-dt-20200225Z-957f01"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20200302Z-a7b277",
  "org.scalablytyped.slinky" %%% "continuation-local-storage" % "3.2-dt-20200225Z-56f432",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20200302Z-29d3df",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "validator" % "12.0-dt-20191226Z-b5141e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
