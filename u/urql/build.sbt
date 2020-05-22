organization := "org.scalablytyped.slinky"
name := "urql"
version := "1.9.7-23483e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-19956e",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "urql__core" % "1.11.8-6a5a93",
  "org.scalablytyped.slinky" %%% "wonka" % "4.0.13-214f31")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
