organization := "org.scalablytyped.slinky"
name := "storybook__addon-a11y"
version := "5.3.18-618eb8"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "axe-core" % "3.5.3-77d3d9",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-ba7af9",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-ac76b9",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-3f1951",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-22ad02",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-c7035e",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-28e060",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200518Z-c625cf",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-272fb7",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-5d1ff9",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "react-redux" % "7.1-dt-20200519Z-3f3995",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-7392f6",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.3.18-9b0a0f",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.18-e7ece3",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.18-385bf5",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.18-11ec4e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
