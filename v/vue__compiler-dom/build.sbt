organization := "org.scalablytyped.slinky"
name := "vue__compiler-dom"
version := "3.0.2-28ed2f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.12.7-44f313",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.12.7-ade8b2",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-09416f",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "vue__compiler-core" % "3.0.2-e0f2df")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
