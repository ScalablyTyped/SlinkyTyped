organization := "org.scalablytyped.slinky"
name := "web3-eth-accounts"
version := "1.3.0-e14dea"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bignumber_dot_js" % "9.0.1-ebae07",
  "org.scalablytyped.slinky" %%% "bn_dot_js" % "4.11-dt-20200515Z-81625d",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "web3-core" % "1.3.0-f9f4e6",
  "org.scalablytyped.slinky" %%% "web3-core-helpers" % "1.3.0-b15db2",
  "org.scalablytyped.slinky" %%% "web3-core-method" % "1.3.0-c6c7ca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
