organization := "org.scalablytyped.slinky"
name := "testing-library__vue"
version := "5.0-dt-20200723Z-d7ff6c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "aria-query" % "4.2-dt-20200628Z-d35a92",
  "org.scalablytyped.slinky" %%% "pretty-format" % "26.2.0-f4d3db",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "testing-library__dom" % "7.21.7-79bb23",
  "org.scalablytyped.slinky" %%% "vue" % "2.6.11-398e0f",
  "org.scalablytyped.slinky" %%% "vue-router" % "3.3.4-f2d200",
  "org.scalablytyped.slinky" %%% "vuex" % "3.5.1-c532b7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
