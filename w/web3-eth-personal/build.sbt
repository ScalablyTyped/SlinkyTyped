organization := "org.scalablytyped.slinky"
name := "web3-eth-personal"
version := "1.2.11-6786d7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bignumber_dot_js" % "9.0.0-a05ba7",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200515Z-b98b93",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "web3-core" % "1.2.11-0e3f22",
  "org.scalablytyped.slinky" %%% "web3-core-helpers" % "1.2.11-196bae",
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.2.11-acae37")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
