organization := "org.scalablytyped.slinky"
name := "unist-util-visit"
version := "2.0.3-2aae98"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "unist" % "2.0-dt-20190213Z-b876dc",
  "org.scalablytyped.slinky" %%% "unist-util-is" % "4.0.3-2d0514",
  "org.scalablytyped.slinky" %%% "unist-util-visit-parents" % "3.1.1-536849")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
