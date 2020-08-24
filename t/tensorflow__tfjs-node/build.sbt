organization := "org.scalablytyped.slinky"
name := "tensorflow__tfjs-node"
version := "2.0.1-539c80"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs" % "2.0.1-50a0a2",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-converter" % "2.0.1-d3c9b4",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-core" % "2.0.1-4df361",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-data" % "2.0.1-25c108",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-layers" % "2.0.1-9b5ea6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
