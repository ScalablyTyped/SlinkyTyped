organization := "org.scalablytyped.slinky"
name := "umzug"
version := "v2.3.0-dt-20201013Z-d184f9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20201028Z-a72283",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20201020Z-ac18e0",
  "org.scalablytyped.slinky" %%% "continuation-local-storage" % "3.2-dt-20201002Z-f691c1",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20201105Z-0e39b7",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.5-dt-20201120Z-df7602",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "sequelize" % "4.28.0-dt-20201002Z-2f5ceb",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "validator" % "13.1-dt-20200624Z-9529ba")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
