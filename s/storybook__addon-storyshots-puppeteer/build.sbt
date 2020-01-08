organization := "org.scalablytyped.slinky"
name := "storybook__addon-storyshots-puppeteer"
version := "5.1-dt-20191122Z-40afa5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-f22bc8",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-af6ef8",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-4620f5",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-dac661",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-16ab26",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-006b9c",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-9c10de",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20191126Z-50a366",
  "org.scalablytyped.slinky" %%% "jest-image-snapshot" % "2.11-dt-20191223Z-47034c",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1d231d",
  "org.scalablytyped.slinky" %%% "puppeteer" % "2.0-dt-20191126Z-45e885",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.2-dt-20191009Z-7b8a4c",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191220Z-f02704",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "storybook__addon-storyshots" % "5.1-dt-20191122Z-4ba786",
  "org.scalablytyped.slinky" %%% "storybook__addons" % "5.2.8-f720fc",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.2.8-f74b1b",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.2.8-f401f8",
  "org.scalablytyped.slinky" %%% "storybook__react" % "5.2.8-ea2e3d",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.2.8-b51817")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        