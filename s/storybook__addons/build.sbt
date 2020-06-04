organization := "org.scalablytyped.slinky"
name := "storybook__addons"
version := "5.3.18-871c87"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-d1c111",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-926794",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-f62ab7",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-55458f",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-44ca77",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-b73f22",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-88168d",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200518Z-001bda",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-1736f1",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-7481b3",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-50711e",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-83112e",
  "org.scalablytyped.slinky" %%% "std" % "3.9-ad7699",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.3.18-3db56e",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.18-02ca63",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.18-2892d3",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.18-f1d112")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
