organization := "org.scalablytyped.slinky"
name := "tensorflow__tfjs-node"
version := "1.5.2-3a1c31"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs" % "1.5.2-530a15",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-converter" % "1.5.2-3a3289",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-core" % "1.5.2-e23b5b",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-data" % "1.5.2-eb7aea",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-layers" % "1.5.2-f0dd94")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
