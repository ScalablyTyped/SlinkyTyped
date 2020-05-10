organization := "org.scalablytyped.slinky"
name := "webcola"
version := "3.4.0-b3b253"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "d3-dispatch" % "1.0-dt-20200225Z-fbcdca",
  "org.scalablytyped.slinky" %%% "d3-drag" % "1.2-dt-20200225Z-bc37ab",
  "org.scalablytyped.slinky" %%% "d3-selection" % "1.4-dt-20200320Z-19e9d5",
  "org.scalablytyped.slinky" %%% "d3-timer" % "1.0-dt-20190212Z-c14316",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
