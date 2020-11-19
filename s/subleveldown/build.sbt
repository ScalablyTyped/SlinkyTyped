organization := "org.scalablytyped.slinky"
name := "subleveldown"
version := "4.1-dt-20191226Z-d29d95"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "abstract-leveldown" % "5.0-dt-20180913Z-18239d",
  "org.scalablytyped.slinky" %%% "level-codec" % "9.0-dt-20200515Z-fa14e6",
  "org.scalablytyped.slinky" %%% "levelup" % "4.3-dt-20200515Z-06684b",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
