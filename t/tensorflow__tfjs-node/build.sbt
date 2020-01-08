organization := "org.scalablytyped.slinky"
name := "tensorflow__tfjs-node"
version := "1.5.1-0bedab"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs" % "1.5.1-3f6c81",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-converter" % "1.5.1-fa1c73",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-core" % "1.5.1-8d3b8c",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-data" % "1.5.1-0f15e9",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-layers" % "1.5.1-53025b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        