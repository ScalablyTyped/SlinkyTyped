organization := "org.scalablytyped.slinky"
name := "storybook__addon-knobs"
version := "5.3.19-33e7a6"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-fce754",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-ac1388",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.28-f55723",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.16-e1b0d7",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.27-fa2c85",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.31-bdeb17",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.3-07d215",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200518Z-8944d8",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ce652f",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-c5224b",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-6a9854",
  "org.scalablytyped.slinky" %%% "react-color" % "3.0-dt-20200626Z-c0a89c",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.3.19-b5fbf5",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.19-84ffe6",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.19-3d4d4b",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.19-76fbf6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
