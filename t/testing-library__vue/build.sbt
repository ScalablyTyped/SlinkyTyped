organization := "org.scalablytyped.slinky"
name := "testing-library__vue"
version := "5.0-dt-20200723Z-cf9501"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "aria-query" % "4.2-dt-20200628Z-95974c",
  "org.scalablytyped.slinky" %%% "pretty-format" % "26.6.2-9678b4",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "testing-library__dom" % "7.28.1-08cf48",
  "org.scalablytyped.slinky" %%% "vue" % "2.6.12-ac716f",
  "org.scalablytyped.slinky" %%% "vue-router" % "3.4.9-2f1c36",
  "org.scalablytyped.slinky" %%% "vue__test-utils" % "1.1.1-d53110",
  "org.scalablytyped.slinky" %%% "vuex" % "3.5.1-025a5a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
