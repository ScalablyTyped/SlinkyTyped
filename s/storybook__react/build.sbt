organization := "org.scalablytyped.slinky"
name := "storybook__react"
version := "5.2.6-d0b120"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e36b6f",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.19-b8deac",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-79cb0f",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-a074ee",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-1dd1a8",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-8dbe18",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-dcd79a",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20190822Z-5fc4d9",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191123Z-8ab09a",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-4b2a81",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.2-dt-20191009Z-233968",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191122Z-3deda2",
  "org.scalablytyped.slinky" %%% "std" % "3.7-317bd7",
  "org.scalablytyped.slinky" %%% "storybook__addons" % "5.2.6-f83833",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.2.6-f6de04",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.2.6-ad4a20",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.2.6-fbabe3",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.2.6-fc0db5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        