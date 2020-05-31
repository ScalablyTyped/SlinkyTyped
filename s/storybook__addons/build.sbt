organization := "org.scalablytyped.slinky"
name := "storybook__addons"
version := "5.3.18-0bc6fe"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-e8e429",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-b892e5",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-3f1951",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-2e1daa",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-229adf",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-28e060",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200518Z-c625cf",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-717070",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-ceb6fa",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-5c4f6b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.3.18-e2fe69",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.18-e7ece3",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.18-2b72ce",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.18-b36adb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
