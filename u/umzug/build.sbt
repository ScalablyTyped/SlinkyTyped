organization := "org.scalablytyped.slinky"
name := "umzug"
version := "v2.2.0-dt-20200515Z-d276e7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20200520Z-6ce100",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20200515Z-3565c2",
  "org.scalablytyped.slinky" %%% "continuation-local-storage" % "3.2-dt-20200515Z-e376bc",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20200519Z-08d73a",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.5-dt-20200518Z-608e56",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "sequelize" % "4.28.0-dt-20200515Z-4711d6",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "validator" % "13.0-dt-20200407Z-4ccb27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
