organization := "org.scalablytyped.slinky"
name := "testing-library__vue"
version := "5.0-dt-20200723Z-742f5e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "aria-query" % "4.2-dt-20200628Z-477232",
  "org.scalablytyped.slinky" %%% "pretty-format" % "26.6.2-4c5d9b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "testing-library__dom" % "7.28.1-7b1e8c",
  "org.scalablytyped.slinky" %%% "vue" % "2.6.12-40894a",
  "org.scalablytyped.slinky" %%% "vue-router" % "3.4.9-b56a77",
  "org.scalablytyped.slinky" %%% "vue__test-utils" % "1.1.1-12701e",
  "org.scalablytyped.slinky" %%% "vuex" % "3.5.1-c981d7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
