organization := "org.scalablytyped.slinky"
name := "storybook__addon-storyshots"
version := "5.3.18-89bff1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-6598c3",
  "org.scalablytyped.slinky" %%% "angular__core" % "8.2.14-26b013",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "emotion-theming" % "10.0.27-ba7af9",
  "org.scalablytyped.slinky" %%% "emotion__core" % "10.0.20-ac76b9",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-3f1951",
  "org.scalablytyped.slinky" %%% "emotion__styled" % "10.0.23-22ad02",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-c7035e",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-28e060",
  "org.scalablytyped.slinky" %%% "eventemitter3" % "4.0.4-7a8486",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200515Z-90a207",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20200518Z-c625cf",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-3eadc9",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20200519Z-08d73a",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-9d1960",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "reach__router" % "1.3-dt-20200426Z-5d1ff9",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.5-a158f0",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.5-1d035b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "storybook__addons" % "5.3.18-28a28a",
  "org.scalablytyped.slinky" %%% "storybook__api" % "5.3.18-9b0a0f",
  "org.scalablytyped.slinky" %%% "storybook__channels" % "5.3.18-e7ece3",
  "org.scalablytyped.slinky" %%% "storybook__client-api" % "5.3.18-8520ad",
  "org.scalablytyped.slinky" %%% "storybook__router" % "5.3.18-385bf5",
  "org.scalablytyped.slinky" %%% "storybook__theming" % "5.3.18-11ec4e",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-1c0109",
  "org.scalablytyped.slinky" %%% "typescript" % "3.9.3-dd6c61")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
