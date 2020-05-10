organization := "org.scalablytyped.slinky"
name := "umzug"
version := "v2.2.0-dt-20200227Z-fe752f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20200302Z-1b60d9",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20200319Z-4a8483",
  "org.scalablytyped.slinky" %%% "continuation-local-storage" % "3.2-dt-20200225Z-1866bf",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20200417Z-4d62ba",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.5-dt-20200426Z-e46654",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "sequelize" % "4.28.0-dt-20200225Z-197419",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "validator" % "13.0-dt-20200407Z-3adfb2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
