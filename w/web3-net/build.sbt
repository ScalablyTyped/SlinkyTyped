organization := "org.scalablytyped.slinky"
name := "web3-net"
version := "1.2.8-67a817"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bignumber_dot_js" % "9.0.0-640e4a",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200515Z-2f434c",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "web3-core" % "1.2.8-1cfc4f",
  "org.scalablytyped.slinky" %%% "web3-core-helpers" % "1.2.8-28ce46",
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.2.8-68d193")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
