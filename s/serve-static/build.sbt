organization := "org.scalablytyped.slinky"
name := "serve-static"
version := "1.13-dt-20200519Z-32009a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "express-serve-static-core" % "4.17-dt-20200515Z-0d2fca",
  "org.scalablytyped.slinky" %%% "mime" % "2.0-dt-20200515Z-22dd62",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-094fa5",
  "org.scalablytyped.slinky" %%% "qs" % "6.9-dt-20200519Z-ed5b33",
  "org.scalablytyped.slinky" %%% "range-parser" % "1.2-dt-20181016Z-3a96cb",
  "org.scalablytyped.slinky" %%% "std" % "3.9-a77a62")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
