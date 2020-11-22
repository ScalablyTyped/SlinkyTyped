organization := "org.scalablytyped.slinky"
name := "storybook__api"
version := "6.1.2-5cc761"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-23cf0c",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.1.1-2ca4da",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.16-2d2c8d",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.27-077112",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.31-cf2e23",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.3-323f0f",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20201002Z-12959c",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ed7fbd",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200925Z-c9138f",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-8f0b52",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "6.1.2-454725",
  "org.scalablytyped.slinky" %%% "storybook__router" % "6.1.2-163f46",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "6.1.2-a16b70")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
