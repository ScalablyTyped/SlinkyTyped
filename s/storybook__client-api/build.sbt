organization := "org.scalablytyped.slinky"
name := "storybook__client-api"
version := "5.2.6-6922bf"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-34c756",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.19-972a2c",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-49c2bb",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-213c24",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-cc250f",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-6d5370",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-7e2d6a",
  "org.scalablytyped.slinky" %%% "eventemitter3" % "4.0.0-c10e8e",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20191126Z-44cadc",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20191126Z-7d8796",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-243f84",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.2-dt-20191009Z-db6144",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191126Z-6c3558",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "storybook__addons" % "5.2.6-eede00",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.2.6-66f765",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.2.6-36aca7",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.2.6-cd1557")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        