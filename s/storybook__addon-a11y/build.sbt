organization := "org.scalablytyped.slinky"
name := "storybook__addon-a11y"
version := "5.3.13-b5b7d2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "axe-core" % "3.5.1-05dea8",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-89abae",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-e18651",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-a11461",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-b89acd",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-48fa34",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-4dc9ef",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-b556bf",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200226Z-86a01d",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-0fa30c",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-6bb503",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200212Z-a5ee88",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200227Z-f18fda",
  "org.scalablytyped.slinky" %%% "react-redux" % "7.1-dt-20200225Z-03f0fc",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-9d78fe",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.3.13-5ed1a3",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.13-3d5a2e",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.13-c57780",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.13-4de4dc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
