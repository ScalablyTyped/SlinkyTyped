organization := "org.scalablytyped.slinky"
name := "storybook__react"
version := "5.3.19-25e4c7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-57a4b7",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-bc396a",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-011484",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-1bcf09",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-d65b89",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-9c0b7d",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-77dffb",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200518Z-6106d7",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200609Z-5ab0d9",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-151476",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-451df0",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200617Z-5b2e1b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-18eec6",
  "org.scalablytyped.slinky" %%% "storybook__addons" % "5.3.19-78cb3d",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.3.19-76fb01",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.19-a3014c",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.19-bb66c3",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.19-d4747f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
