organization := "org.scalablytyped.slinky"
name := "testing-library__vue"
version := "5.0-dt-20200723Z-5bc306"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "aria-query" % "4.2-dt-20200628Z-400560",
  "org.scalablytyped.slinky" %%% "pretty-format" % "26.2.0-89f324",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "testing-library__dom" % "7.21.7-bc0635",
  "org.scalablytyped.slinky" %%% "vue" % "2.6.11-68de27",
  "org.scalablytyped.slinky" %%% "vue-router" % "3.3.4-8470e5",
  "org.scalablytyped.slinky" %%% "vuex" % "3.5.1-31afed")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
