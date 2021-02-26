organization := "org.scalablytyped.slinky"
name := "tensorflow__tfjs"
version := "2.7.0-9a9a1f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-converter" % "2.7.0-773c5a",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-core" % "2.7.0-f22142",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-data" % "2.7.0-ffbdad",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-layers" % "2.7.0-135963")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
