organization := "org.scalablytyped.slinky"
name := "vue__compiler-sfc"
version := "3.0.2-2a1180"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.12.7-9a5e63",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.12.7-cdf83e",
  "org.scalablytyped.slinky" %%% "postcss" % "7.0.35-f6dc1d",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-07892e",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "vue__compiler-core" % "3.0.2-9ad438")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
