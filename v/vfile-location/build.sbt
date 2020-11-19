organization := "org.scalablytyped.slinky"
name := "vfile-location"
version := "2.0-dt-20200515Z-b66846"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "unist" % "2.0-dt-20190213Z-37dfa7",
  "org.scalablytyped.slinky" %%% "vfile" % "4.2.0-e48e38",
  "org.scalablytyped.slinky" %%% "vfile-message" % "2.0.4-211b02")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
