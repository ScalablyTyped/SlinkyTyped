organization := "org.scalablytyped.slinky"
name := "storybook__api"
version := "5.3.19-33a50d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-c880b4",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-0597fa",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.28-bbe99f",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.16-d8a95b",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.27-237b70",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.31-059e8c",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.3-ccd446",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200518Z-f12504",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-9fd6d8",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-2120c2",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-c528cd",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.19-76b97a",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.19-058f88",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.19-4ad7cb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
