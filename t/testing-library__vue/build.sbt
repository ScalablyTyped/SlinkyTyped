organization := "org.scalablytyped.slinky"
name := "testing-library__vue"
version := "2.0-dt-20190816Z-e4ed77"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "pretty-format" % "24.9.0-35a608",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "testing-library__dom" % "6.10-dt-20191101Z-9d6058",
  "org.scalablytyped.slinky" %%% "vue" % "2.6.10-a1b218",
  "org.scalablytyped.slinky" %%% "vue-router" % "3.1.3-64c6ec",
  "org.scalablytyped.slinky" %%% "vuex" % "3.1.2-6a0c39")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        