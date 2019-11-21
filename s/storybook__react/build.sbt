organization := "org.scalablytyped.slinky"
name := "storybook__react"
version := "4.0-dt-20190605Z-20465e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-7d274f",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191108Z-ac59bd",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1735fa",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191025Z-852e77",
  "org.scalablytyped.slinky" %%% "std" % "3.7-5d968d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        