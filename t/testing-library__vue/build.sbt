organization := "org.scalablytyped.slinky"
name := "testing-library__vue"
version := "2.0-dt-20200401Z-43403d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "pretty-format" % "24.9.0-e411e6",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "testing-library__dom" % "7.0-dt-20200423Z-3e2bf6",
  "org.scalablytyped.slinky" %%% "vue" % "2.6.11-32f38d",
  "org.scalablytyped.slinky" %%% "vue-router" % "3.1.6-8bf915",
  "org.scalablytyped.slinky" %%% "vuex" % "3.1.3-449e36")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
