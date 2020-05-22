organization := "org.scalablytyped.slinky"
name := "wordpress__media-utils"
version := "0.2-dt-20200515Z-f15f68"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "re-resizable" % "6.3.2-302032",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "react-dom" % "16.9-dt-20200519Z-bc6686",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "wordpress__block-editor" % "2.2-dt-20200515Z-0a296b",
  "org.scalablytyped.slinky" %%% "wordpress__blocks" % "6.4-dt-20200515Z-ca5a72",
  "org.scalablytyped.slinky" %%% "wordpress__components" % "8.5-dt-20200427Z-18da7d",
  "org.scalablytyped.slinky" %%% "wordpress__element" % "2.4-dt-20200427Z-e60d51",
  "org.scalablytyped.slinky" %%% "wordpress__notices" % "1.5-dt-20200515Z-f58e18",
  "org.scalablytyped.slinky" %%% "wordpress__rich-text" % "3.4-dt-20200515Z-ed8e1f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
