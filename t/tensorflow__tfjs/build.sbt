organization := "org.scalablytyped.slinky"
name := "tensorflow__tfjs"
version := "1.7.4-c7d314"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-converter" % "1.7.4-b46d0d",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-core" % "1.7.4-bf727d",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-data" % "1.7.4-a9623b",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-layers" % "1.7.4-4d9f6e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
