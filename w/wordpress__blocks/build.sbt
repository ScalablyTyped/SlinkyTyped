organization := "org.scalablytyped.slinky"
name := "wordpress__blocks"
version := "6.4-dt-20200623Z-292857"
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
  "org.scalablytyped.slinky" %%% "wordpress__components" % "9.0-dt-20200623Z-641a1d",
  "org.scalablytyped.slinky" %%% "wordpress__element" % "2.16.0-207de8",
  "org.scalablytyped.slinky" %%% "wordpress__notices" % "1.5-dt-20200515Z-5a6db0",
  "org.scalablytyped.slinky" %%% "wordpress__rich-text" % "3.4-dt-20200515Z-909ab1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
