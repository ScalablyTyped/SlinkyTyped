organization := "org.scalablytyped.slinky"
name := "tensorflow__tfjs-node"
version := "1.3.2-a2c3f2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs" % "1.3.2-7517bb",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-converter" % "1.3.2-1153e7",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-core" % "1.3.2-b92edf",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-data" % "1.3.2-5956d6",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-layers" % "1.3.2-13cd99")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        