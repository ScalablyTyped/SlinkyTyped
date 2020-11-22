organization := "org.scalablytyped.slinky"
name := "umzug"
version := "v2.3.0-dt-20201013Z-dcd5e4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20201028Z-64939d",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20201020Z-4f852e",
  "org.scalablytyped.slinky" %%% "continuation-local-storage" % "3.2-dt-20201002Z-8c3815",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20201105Z-cc83da",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.5-dt-20201120Z-6bd85e",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "sequelize" % "4.28.0-dt-20201002Z-7cde05",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "validator" % "13.1-dt-20200624Z-cf8f99")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
