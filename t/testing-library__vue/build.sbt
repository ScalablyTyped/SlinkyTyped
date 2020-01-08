organization := "org.scalablytyped.slinky"
name := "testing-library__vue"
version := "2.0-dt-20190816Z-bc234a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "pretty-format" % "24.9.0-496fef",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "testing-library__dom" % "6.11-dt-20200102Z-aaa1f9",
  "org.scalablytyped.slinky" %%% "vue" % "2.6.11-82e24e",
  "org.scalablytyped.slinky" %%% "vue-router" % "3.1.3-f4d148",
  "org.scalablytyped.slinky" %%% "vuex" % "3.1.2-e814ee")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        