organization := "org.scalablytyped.slinky"
name := "unimodules__core"
version := "4.0.0-ea9826"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-7d274f",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1735fa",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191025Z-c3107a",
  "org.scalablytyped.slinky" %%% "react-native" % "0.60-dt-20191028Z-df5406",
  "org.scalablytyped.slinky" %%% "std" % "3.7-5d968d",
  "org.scalablytyped.slinky" %%% "unimodules__react-native-adapter" % "4.0.0-72c44b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        