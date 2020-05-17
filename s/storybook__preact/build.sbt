organization := "org.scalablytyped.slinky"
name := "storybook__preact"
version := "5.3.17-2fbca4"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-151ea5",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-64368f",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-547fbc",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-719179",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-e90d62",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-a53b44",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200226Z-fad309",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-7e1d98",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-f15a3a",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-36b705",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "storybook__addons" % "5.3.17-c53ca4",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.3.17-90898d",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.17-95f550",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.17-785adb",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.17-c5e7b1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
