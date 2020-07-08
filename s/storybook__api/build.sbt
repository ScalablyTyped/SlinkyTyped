organization := "org.scalablytyped.slinky"
name := "storybook__api"
version := "5.3.19-23f72a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-2278c5",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-63d09f",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-332d79",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-1e56b8",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-3f2585",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-3c2ed6",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-77a50e",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200518Z-50a723",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-360342",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-d61f23",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200617Z-036789",
  "org.scalablytyped.slinky" %%% "std" % "3.9-dec240",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.19-bee273",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.19-543484",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.19-48f953")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
