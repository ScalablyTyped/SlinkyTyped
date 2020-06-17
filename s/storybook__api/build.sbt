organization := "org.scalablytyped.slinky"
name := "storybook__api"
version := "5.3.18-201173"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-046861",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-0682f4",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-8a0853",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-05d917",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-ebdda8",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-3812b3",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-2b9754",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200518Z-96f64c",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-75109a",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-7c717f",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-5e5e25",
  "org.scalablytyped.slinky" %%% "std" % "3.9-a77a62",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.18-371f7b",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.18-d1d31d",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.18-4bede5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
