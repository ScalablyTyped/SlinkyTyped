organization := "org.scalablytyped.slinky"
name := "testing-library__vue"
version := "2.0-dt-20190816Z-d49de4"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "pretty-format" % "24.9.0-4be6c7",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "testing-library__dom" % "6.12-dt-20200210Z-f42b6a",
  "org.scalablytyped.slinky" %%% "vue" % "2.6.11-d6cffc",
  "org.scalablytyped.slinky" %%% "vue-router" % "3.1.5-e3dff9",
  "org.scalablytyped.slinky" %%% "vuex" % "3.1.2-f1a8e9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
