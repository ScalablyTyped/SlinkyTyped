organization := "org.scalablytyped.slinky"
name := "storybook__addon-storyshots"
version := "5.3.17-d92d6a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-479697",
  "org.scalablytyped.slinky" %%% "angular__core" % "8.2.14-06fd0b",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-151ea5",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-64368f",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-547fbc",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-719179",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-e90d62",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-a53b44",
  "org.scalablytyped.slinky" %%% "eventemitter3" % "4.0.0-abb1c1",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200226Z-b875fa",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200226Z-fad309",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-0a5fbb",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20200417Z-5a7e1e",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200226Z-c4f6f9",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-7e1d98",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-f15a3a",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-36b705",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-e2a094",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-86bf9e",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "storybook__addons" % "5.3.17-c53ca4",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.3.17-90898d",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.17-95f550",
  "org.scalablytyped.slinky" %%% "storybook__client-api" % "5.3.17-89e4f6",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.17-785adb",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.17-c5e7b1",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200225Z-7a8959",
  "org.scalablytyped.slinky" %%% "typescript" % "3.8.3-472acc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
