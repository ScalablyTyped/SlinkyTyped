organization := "org.scalablytyped.slinky"
name := "tensorflow__tfjs-node"
version := "1.7.0-82f3c1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs" % "1.7.0-1b6a52",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-converter" % "1.7.0-271e24",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-core" % "1.7.0-f30867",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-data" % "1.7.0-0291e6",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-layers" % "1.7.0-87d08d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
