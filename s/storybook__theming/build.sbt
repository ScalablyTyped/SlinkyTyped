organization := "org.scalablytyped.slinky"
name := "storybook__theming"
version := "5.3.19-d4747f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-57a4b7",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-bc396a",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-011484",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-1bcf09",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-d65b89",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-9c0b7d",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-77dffb",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-151476",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200617Z-5b2e1b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-18eec6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
