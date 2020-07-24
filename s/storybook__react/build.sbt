organization := "org.scalablytyped.slinky"
name := "storybook__react"
version := "5.3.19-715d5d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-9fcfdc",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-53bf82",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-289e9f",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-6ca6c2",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-115435",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-d273f9",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-98e365",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200518Z-e57a1c",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-051843",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-77dff4",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-55d3f0",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-014bc6",
  "org.scalablytyped.slinky" %%% "std" % "3.9-25efe0",
  "org.scalablytyped.slinky" %%% "storybook__addons" % "5.3.19-ac2f46",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.3.19-359b4a",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.19-fee168",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.19-9494dc",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.19-428475")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
