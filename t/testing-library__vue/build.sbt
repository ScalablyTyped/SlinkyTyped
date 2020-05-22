organization := "org.scalablytyped.slinky"
name := "testing-library__vue"
version := "2.0-dt-20200401Z-f7b698"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "pretty-format" % "24.9.0-c27bd9",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "testing-library__dom" % "7.0-dt-20200423Z-d96853",
  "org.scalablytyped.slinky" %%% "vue" % "2.6.11-3c5d56",
  "org.scalablytyped.slinky" %%% "vue-router" % "3.2.0-0f2e7b",
  "org.scalablytyped.slinky" %%% "vuex" % "3.4.0-e0c423")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
