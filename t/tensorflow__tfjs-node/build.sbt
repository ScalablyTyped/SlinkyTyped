organization := "org.scalablytyped.slinky"
name := "tensorflow__tfjs-node"
version := "1.7.0-59bc9b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs" % "1.7.0-d03256",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-converter" % "1.7.0-0502a2",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-core" % "1.7.0-b0eef4",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-data" % "1.7.0-0241f8",
  "org.scalablytyped.slinky" %%% "tensorflow__tfjs-layers" % "1.7.0-ecd78c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
