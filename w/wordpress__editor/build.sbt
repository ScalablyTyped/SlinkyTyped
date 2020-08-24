organization := "org.scalablytyped.slinky"
name := "wordpress__editor"
version := "9.4-dt-20200611Z-46d0e6"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-c880b4",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-9fd6d8",
  "org.scalablytyped.slinky" %%% "re-resizable" % "6.3.2-b5273f",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-c528cd",
  "org.scalablytyped.slinky" %%% "react-dom" % "16.9-dt-20200519Z-911095",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "wordpress__api-fetch" % "3.2-dt-20190726Z-15f000",
  "org.scalablytyped.slinky" %%% "wordpress__block-editor" % "2.2-dt-20200611Z-3427a9",
  "org.scalablytyped.slinky" %%% "wordpress__blocks" % "6.4-dt-20200623Z-292857",
  "org.scalablytyped.slinky" %%% "wordpress__components" % "9.0-dt-20200623Z-641a1d",
  "org.scalablytyped.slinky" %%% "wordpress__core-data" % "2.4-dt-20200515Z-73cf0e",
  "org.scalablytyped.slinky" %%% "wordpress__element" % "2.16.0-207de8",
  "org.scalablytyped.slinky" %%% "wordpress__media-utils" % "0.2-dt-20200611Z-a7b16c",
  "org.scalablytyped.slinky" %%% "wordpress__notices" % "1.5-dt-20200515Z-5a6db0",
  "org.scalablytyped.slinky" %%% "wordpress__rich-text" % "3.4-dt-20200515Z-909ab1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
