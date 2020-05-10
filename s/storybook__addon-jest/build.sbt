organization := "org.scalablytyped.slinky"
name := "storybook__addon-jest"
version := "5.3.17-ce15e8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-fa3762",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-fb16b4",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-9c2bbf",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-60374b",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-17d59c",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-78dae8",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-06b749",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200226Z-2bae32",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-24495c",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-281d9f",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-47fb9f",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.3.17-7a0d15",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.17-c8eadd",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.17-727574",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.17-796e3d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
