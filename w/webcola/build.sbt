organization := "org.scalablytyped.slinky"
name := "webcola"
version := "3.4.0-63fdb7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200225Z-59cb74",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200225Z-04a1df",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200320Z-176a7c",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20190212Z-25ccd9",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
