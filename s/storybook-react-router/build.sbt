organization := "org.scalablytyped.slinky"
name := "storybook-react-router"
version := "1.0-dt-20191122Z-d87a92"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-58bcb0",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.1.1-978917",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.16-a8d0ee",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.27-040617",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.31-857dc1",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.3-562ee1",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20201002Z-67d6e3",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-931d77",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20201002Z-9bc0d9",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200925Z-b26fdb",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-9cde70",
  "org.scalablytyped.slinky" %%% "react-router" % "5.1-dt-20201002Z-af2a8d",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "storybook__addons" % "6.1.2-679664",
  "org.scalablytyped.slinky" %%% "storybook__api" % "6.1.2-2b31f1",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "6.1.2-4cfe7c",
  "org.scalablytyped.slinky" %%% "storybook__client-api" % "6.1.2-74609b",
  "org.scalablytyped.slinky" %%% "storybook__react" % "6.1.2-4f374d",
  "org.scalablytyped.slinky" %%% "storybook__router" % "6.1.2-a94bde",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "6.1.2-d2f90a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
