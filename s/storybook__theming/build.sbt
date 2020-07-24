organization := "org.scalablytyped.slinky"
name := "storybook__theming"
version := "5.3.19-428475"
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
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-77dff4",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-014bc6",
  "org.scalablytyped.slinky" %%% "std" % "3.9-25efe0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
