organization := "org.scalablytyped.slinky"
name := "vue-docgen-api"
version := "4.33.9-a62528"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ast-types" % "0.14.2-ab04a5",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.12.7-9a5e63",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.12.7-cdf83e",
  "org.scalablytyped.slinky" %%% "pug" % "2.0-dt-20201002Z-1570c9",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-07892e",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "ts-map" % "1.0.3-45937a",
  "org.scalablytyped.slinky" %%% "vue-inbrowser-compiler-utils" % "4.33.6-20d44c",
  "org.scalablytyped.slinky" %%% "vue__compiler-core" % "3.0.2-9ad438")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
