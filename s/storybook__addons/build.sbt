organization := "org.scalablytyped.slinky"
name := "storybook__addons"
version := "5.3.19-148e09"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-9fcfdc",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-2c446a",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-a437c0",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-6ca6c2",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-26b4fc",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-910bd9",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-98e365",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200518Z-e57a1c",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200609Z-439deb",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-77dff4",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-ab7b3d",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200617Z-0ab4bf",
  "org.scalablytyped.slinky" %%% "std" % "3.9-25efe0",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.3.19-76ce6e",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.19-fee168",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.19-031aa1",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.19-276239")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
