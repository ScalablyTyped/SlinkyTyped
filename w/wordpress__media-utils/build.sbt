organization := "org.scalablytyped.slinky"
name := "wordpress__media-utils"
version := "0.2-dt-20200611Z-bba9d2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-fce754",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ce652f",
  "org.scalablytyped.slinky" %%% "re-resizable" % "6.3.2-b123bc",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-6a9854",
  "org.scalablytyped.slinky" %%% "react-dom" % "16.9-dt-20200519Z-60152b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "wordpress__block-editor" % "2.2-dt-20200611Z-5c47ee",
  "org.scalablytyped.slinky" %%% "wordpress__blocks" % "6.4-dt-20200623Z-f9bb5c",
  "org.scalablytyped.slinky" %%% "wordpress__components" % "9.0-dt-20200623Z-45c779",
  "org.scalablytyped.slinky" %%% "wordpress__element" % "2.16.0-466dea",
  "org.scalablytyped.slinky" %%% "wordpress__notices" % "1.5-dt-20200515Z-0901d7",
  "org.scalablytyped.slinky" %%% "wordpress__rich-text" % "3.4-dt-20200515Z-f720e2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
