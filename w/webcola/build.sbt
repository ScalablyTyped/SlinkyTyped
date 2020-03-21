organization := "org.scalablytyped.slinky"
name := "webcola"
version := "3.4.0-784c25"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200225Z-52c9b4",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200225Z-bfd8eb",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200225Z-ac6795",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20190212Z-4214fa",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
