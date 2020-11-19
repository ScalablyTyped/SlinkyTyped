organization := "org.scalablytyped.slinky"
name := "tensorflow__tfjs-node"
version := "2.0.1-788aa5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs" % "2.0.1-b12606",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-converter" % "2.0.1-5a58a0",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-core" % "2.0.1-cc1bf1",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-data" % "2.0.1-3dabb4",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-layers" % "2.0.1-19326d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
