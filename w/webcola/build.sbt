organization := "org.scalablytyped.slinky"
name := "webcola"
version := "3.4.0-b35eb3"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200515Z-da9567",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200515Z-b9448f",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200515Z-b39db8",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20200515Z-4d48ca",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
